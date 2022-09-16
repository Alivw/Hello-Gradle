package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private EmpService empService;

//    @GetMapping("/{address}")
//    public String hello(@PathVariable("address")String address){
//
//        log.info("receive parameter address :{}", address);
//        return "Hello Jalivv !";
//    }


    @GetMapping("/emp")
    public Object empList() {
        return empService.list();
    }

    @GetMapping("/")
    public Object hello() {
        log.info("receive parameter address :{}", "jalivv");
        return "Hello Jalivv !";
        }
}
