package com.ximouzhao.testsomething.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RedisTest {
    @Autowired
    RedisTemplate<String, String> redisTemplate;
    Map<String,Map<String,String>> map=new HashMap<>();
    public void test(){
        long redispushstart=System.currentTimeMillis();
        for(int j=0;j<100;j++){
            Map<String,String> map1=new HashMap<>();
            for(int i=0;i<1000;i++){
                redisTemplate.opsForHash().put("x"+j,"key"+i,"value"+i);
            }
            map.put("x"+j,map1);
        }
        long redispushend=System.currentTimeMillis();
        System.out.println("redispush cost"+(redispushend-redispushstart));

        long mapushstart=System.currentTimeMillis();
        for(int j=0;j<100;j++){
            Map<String,String> map1=new HashMap<>();
            for(int i=0;i<1000;i++){
                map1.put("key"+i,"value"+i);
            }
            map.put("x"+j,map1);
        }
        long mapushend=System.currentTimeMillis();
        System.out.println("mapush cost"+(mapushend-mapushstart));


        String value="";
        long redisgetstart=System.currentTimeMillis();
        for(int i=0;i<100;i++){
            value= (String) redisTemplate.opsForHash().get("x50","key500");
        }
        long redisgetend=System.currentTimeMillis();
        System.out.println("redisvalue: "+value);
        System.out.println("rediscost: "+(redisgetend-redisgetstart));
        long mapgetstart=System.currentTimeMillis();
        for(int i=0;i<100;i++){
            value= (String) map.get("x50").get("key500");
        }
        long mapgetend=System.currentTimeMillis();
        System.out.println("mapvalue: "+value);
        System.out.println("mapcost: "+(mapgetend-mapgetstart));
    }

}
