package com.shanghai.caiyun.demo2.utils;


import com.shanghai.caiyun.demo2.model.Student;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static   DataBase dataBase = new DataBase();

    private  Map<Integer,Student> map = new HashMap<>();
    private DataBase(){

    }

    public static DataBase newInstance(){
        if (dataBase == null){
            dataBase = new DataBase();
        }
        return  dataBase;
    }

    public Map<Integer,Student> getmap(){
        return map;
    }

    public void putToMap(Student student){
        Integer id = student.getNum();
        map.put(id,student);
    }

}
