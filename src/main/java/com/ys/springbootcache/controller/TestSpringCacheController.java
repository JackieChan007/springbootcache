package com.ys.springbootcache.controller;

import com.ys.springbootcache.service.TestSpringCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：JackieChan
 * @date ：2019/12/22 14:22
 * @version: 1.0
 * @description：测试sprig cache集成
 */
@RestController
@RequestMapping("/api/springcache")
public class TestSpringCacheController {
    @Autowired
    private TestSpringCacheService testSpringCacheService;

    @GetMapping("/putCache")
    public String testPutCache(@RequestParam("hello") String hello, @RequestParam("word") String word) {
        System.out.println(">>>>>>>test spring cache<<<<<<<<<<<");
        return testSpringCacheService.testPutCache("hello", "word");
    }
}
