package org.rzc.service.impl;

import org.rzc.dao.ItemsDao;
import org.rzc.pojo.Items;
import org.rzc.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Resource
    ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }


    @Override
    public void save(Items items) {
        itemsDao.save(items);
    }
}
