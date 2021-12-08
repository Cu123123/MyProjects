package com.zhang.dao;

import com.zhang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
@Select("select * from teacher where id=#{id}")
public Teacher getTeacher(@Param("id") int id);
}
