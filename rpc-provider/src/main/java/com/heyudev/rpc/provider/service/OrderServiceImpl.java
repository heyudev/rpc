package com.heyudev.rpc.provider.service;

import com.heyudev.api.domain.Order;
import com.heyudev.api.service.OrderService;
import org.springframework.stereotype.Service;

/**
 *
 * @author supeng
 * @date 2021/06/25
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Long createOrder(Order order) {
        return order.getId();
    }
}
