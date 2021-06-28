package com.heyudev.rpc.api;

import java.util.List;

/**
 * 路由
 *
 * @author supeng
 * @date 2021/06/25
 */
public interface Router {
    List<String> route(List<String> urls);

}
