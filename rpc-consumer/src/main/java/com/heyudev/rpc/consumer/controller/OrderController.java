package com.heyudev.rpc.consumer.controller;

import com.heyudev.api.domain.Order;
import com.heyudev.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author supeng
 * @date 2021/06/25
 */
@RestController
@RequestMapping(value = "")
public class OrderController {

    @Resource
    OrderService orderService;

    @PostMapping(value = "/createOrder")
    public Long createOrder() {
        Order order = new Order(1L, 1L, new ArrayList<>());

        return orderService.createOrder(order);
    }
}
