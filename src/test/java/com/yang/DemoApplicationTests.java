package com.yang;


import com.yang.mapper.UserMapper;
import com.yang.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    public void show(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    public void insert(){
        User user=new User();
        user.setName("小ha");
        user.setEmail("aaaa");
        user.setAge(20);
        int insert = userMapper.insert(user);
        System.out.println(user);
        System.out.println(insert);
    }

}
