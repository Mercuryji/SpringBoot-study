package com.shanghai.caiyun.demo2.dao;

import com.shanghai.caiyun.demo2.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    int insert(Student student);

    Student findById(@Param("id")Integer id);

    Student findByName(@Param("name")String name);

    Student findByTelNum(@Param("telNum")String telNum);

    List<Student> getStudents();


}
