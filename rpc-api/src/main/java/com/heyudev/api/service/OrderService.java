package com.heyudev.api.service;

import com.heyudev.api.domain.Order;

/**
 *
 * @author heyudev
 * @date 2021/06/25
 */
public interface OrderService {

    Long createOrder(Order order);
}
