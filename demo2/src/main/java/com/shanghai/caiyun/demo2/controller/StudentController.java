package com.shanghai.caiyun.demo2.controller;

import com.shanghai.caiyun.demo2.service.StudentService;
import com.shanghai.caiyun.demo2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    int insert(@RequestBody Student student){
        return studentService.insert(student);
    }

    @GetMapping("/find")
    Student findById(@RequestParam Integer id){
        return studentService.findById(id);
    }

    @GetMapping("/query")
    Student findByName(@RequestParam String name){
        return studentService.findByName(name);
    }

    @GetMapping("/query_tel")
    Student findByTelNum(@RequestParam String telNum){
        return studentService.findByTelNum(telNum);
    }
}
