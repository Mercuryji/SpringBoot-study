package com.shanghai.caiyun.demo2.service;

import com.shanghai.caiyun.demo2.dao.StudentMapper;
import com.shanghai.caiyun.demo2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public int insert(Student student){
         studentMapper.insert(student);
         return student.getNum();
    }

    public Student findById(Integer id){
        return studentMapper.findById(id);
    }

    public Student findByName(String name){
        return studentMapper.findByName(name);
    }

    public Student findByTelNum(String telNum){
        return studentMapper.findByTelNum(telNum);
    }

    public List<Student> getStudents(){
        return  studentMapper.getStudents();
    }
}
