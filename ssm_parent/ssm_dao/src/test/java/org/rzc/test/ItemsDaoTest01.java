package org.rzc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rzc.dao.ItemsDao;
import org.rzc.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ItemsDaoTest01 {
    @Autowired
    ItemsDao itemsDao;

    @Test
    public void findAll() {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
//        ItemsDao itemsDao = (ItemsDao)app.getBean("itemsDao");
        System.out.println("商品列表：：：" + itemsDao.findAll());
        Items items = new Items();
        items.setName("商品名称3");
        items.setPrice(1666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }
}
