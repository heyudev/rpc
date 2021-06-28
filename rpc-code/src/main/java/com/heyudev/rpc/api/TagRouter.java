package com.heyudev.rpc.api;

import java.util.List;

/**
 * @author supeng
 * @date 2021/06/28
 */
public class TagRouter implements Router {
    public List<String> route(List<String> urls) {
        return urls;
    }
}
