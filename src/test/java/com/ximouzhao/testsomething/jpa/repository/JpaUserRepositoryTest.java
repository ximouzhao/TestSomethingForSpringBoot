package com.ximouzhao.testsomething.jpa.repository;

import com.ximouzhao.testsomething.jpa.model.JpaUserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaUserRepositoryTest {
    @Autowired
    JpaUserRepository jpaUserRepository;
    @Test
    public void save(){
        List<JpaUserModel> jpaUserModels=new ArrayList<>();
        JpaUserModel jpaUserModel=new JpaUserModel();
        jpaUserModel.setUserId("222");
        jpaUserModel.setUserName("aaa");
        jpaUserModels.add(jpaUserModel);
        JpaUserModel jpaUserModel1=new JpaUserModel();
        jpaUserModel1.setUserId("333");
        jpaUserModel1.setUserName("bbb");
        jpaUserModels.add(jpaUserModel1);
        JpaUserModel jpaUserModel2=new JpaUserModel();
        jpaUserModel2.setUserId("444");
        jpaUserModel2.setUserName("bbb");
        jpaUserModels.add(jpaUserModel2);
        List<JpaUserModel> r=jpaUserRepository.saveAll(jpaUserModels);
        assertNotNull(r);
    }

}