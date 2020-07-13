package com.ximouzhao.testsomething.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTestTest {
    @Autowired
    RedisTest redisTest;

    @Test
    public void test() {
        redisTest.test();
    }
}