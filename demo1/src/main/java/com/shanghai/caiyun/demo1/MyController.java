package com.shanghai.caiyun.demo1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class MyController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person p1){
        return p1;
    }
}
