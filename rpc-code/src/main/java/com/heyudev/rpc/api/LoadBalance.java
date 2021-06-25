package com.heyudev.rpc.api;

import java.util.List;

/**
 * 负载均衡
 *
 * @author heyudev
 * @date 2021/06/25
 */
public interface LoadBalance {
    /**
     * 选择
     * @param urls
     * @return
     */
    String select(List<String> urls);
}
