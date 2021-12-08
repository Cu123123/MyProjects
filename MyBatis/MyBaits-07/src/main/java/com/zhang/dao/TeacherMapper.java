package com.zhang.dao;

import com.zhang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

//   List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher(int id);
    Teacher getTeacher2(int id);
}
