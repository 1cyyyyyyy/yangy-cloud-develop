package com.yangy.order.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Yangy
 * @Date 2023/7/18 14:26
 * @Description TODO
 * @Version 1.0
 */
@FeignClient("inventoryservice")
public interface InventoryClient {

    /**
     * 使用Feign的步骤：
     * ① 引入依赖
     * ② 添加@EnableFeignClients注解
     * ③ 编写FeignClient接口
     * @return
     */

    /**
     * 这个客户端主要是基于SpringMVC的注解来声明远程调用的信息，比如：
     *
     * - 服务名称：userservice
     * - 请求方式：GET
     * - 请求路径：/user/{id}
     * - 请求参数：Long id
     * - 返回值类型：User
     * @return
     */
    @GetMapping("/inventory/getGoodsNum")
    int getNums();
}
