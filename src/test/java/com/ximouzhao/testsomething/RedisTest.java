package com.ximouzhao.testsomething;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisTemplate<String, String> redisTemplate;
    @Test
    public void redisTest() {
        long time=System.currentTimeMillis();
        for(int j=0;j<50;j++){
            Map<String, String> userInfoModelMap=new HashMap<>();
            for(int i=0;i<10000;i++){
                RedisUserInfoModel redisUserInfoModel=new RedisUserInfoModel();
                redisUserInfoModel.setUser_id("testid");
                redisUserInfoModel.setUser_name("testusername");
                redisUserInfoModel.setEmail("testEmail");
                redisUserInfoModel.setMobile("testeMobile");
                userInfoModelMap.put("testesttest-j="+j+"-i="+i+time, JSON.toJSONString(redisUserInfoModel));
            }
            redisTemplate.opsForHash().putAll("urm_user_info",userInfoModelMap);
        }
    }
}
