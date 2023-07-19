package com.yangy.inventory.controller;

import com.yangy.inventory.service.InventoryService;
import com.yangy.inventory.service.impl.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yangy
 * @Date 2023/7/18 14:12
 * @Description TODO
 * @Version 1.0
 */
@RestController("商品")
@RequestMapping("/inventory")
public class GoodsController {


    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/getGoodsNum")
    public int getGoodsNum(){
        int nums = inventoryService.getNums();
        return nums;
    }

}
