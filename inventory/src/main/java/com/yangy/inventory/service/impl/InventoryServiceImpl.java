package com.yangy.inventory.service.impl;

import com.yangy.inventory.controller.GoodsController;
import com.yangy.inventory.service.InventoryService;
import org.springframework.stereotype.Service;

/**
 * @Author Yangy
 * @Date 2023/7/18 14:19
 * @Description TODO
 * @Version 1.0
 */
@Service
public class InventoryServiceImpl implements InventoryService {

    private static int goodsNum = 10;

    @Override
    public int getNums() {
        goodsNum = goodsNum - 1;
        return goodsNum;
    }
}
