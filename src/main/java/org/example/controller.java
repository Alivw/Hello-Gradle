package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Jalivv
 * @create: 2022-10-23 19:24
 **/
@RestController
public class controller {


    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
}
