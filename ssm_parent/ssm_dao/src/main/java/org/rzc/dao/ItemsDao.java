package org.rzc.dao;

import org.rzc.pojo.Items;

import java.util.List;

public interface ItemsDao {
    /***
     * 查询所有
     * @return
     */
    List<Items> findAll();

    /***
     * 保存操作
     * @param items
     */
    void save(Items items);

}
