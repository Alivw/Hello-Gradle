package org.example.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Jalivv
 * @create: 2022-10-25 11:22
 **/
@RestController
public class TestController {


    @Resource
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }


    @GetMapping("/user")
    public Object user() {
        return jdbcTemplate.queryForList("select * from t_user");
    }
}
