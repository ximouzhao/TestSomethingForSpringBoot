package com.ximouzhao.testsomething;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.ximouzhao.testsomething.transaction.dao")
public class TestsomethingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestsomethingApplication.class, args);
    }

}
