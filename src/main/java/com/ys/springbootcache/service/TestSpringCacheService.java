package com.ys.springbootcache.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：JackieChan
 * @date ：2019/12/22 14:24
 * @version: 1.0
 * @description：spring cache service测试
 */
@Service
@CacheConfig(cacheNames = {"commonCacheName"})
public class TestSpringCacheService {

    @Cacheable( key = "targetClass + methodName+#hello+#word")
    public String testPutCache(@RequestParam("hello") String hello, @RequestParam("word") String word) {
        System.out.println("未走缓存");
        return hello + word;
    }
}
