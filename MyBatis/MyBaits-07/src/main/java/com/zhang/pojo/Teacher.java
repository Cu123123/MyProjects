package com.zhang.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id ;
    private String name;
    //一个老师拥有多给我学生
    private List<Student> students;
}
