package com.test;

import com.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringbootApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        System.out.println(userService.selectUserByName("Ray"));
    }

}
