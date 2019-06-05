package com.osyunge.service;

import com.osyunge.pojo.TbItem;

public interface ItemService {

    //通过商品id查询商品信息
    TbItem  findItemInfoByItemid(long itemId);
}
