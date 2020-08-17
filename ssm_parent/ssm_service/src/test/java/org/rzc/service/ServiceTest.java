package org.rzc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rzc.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-service.xml"})
public class ServiceTest {
    @Autowired
    ItemsService service;

    @Test
    public void test01(){
        service.findAll();
    }

    @Test
    public void test02(){
        Items items = new Items();
        items.setName("商品名称5");
        items.setPrice(1666f);
        items.setCreatetime(new Date());
        service.save(items);
    }
}
