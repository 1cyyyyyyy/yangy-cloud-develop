package com.yangy.order.controller;

import com.yangy.order.openfeign.InventoryClient;
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
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private InventoryClient inventoryClient;

    @GetMapping("/add")
    public String add(){
        int nums = inventoryClient.getNums();
        return "还有"+nums +"件库存";
    }
}
