package com.zhang;

import com.zhang.dao.TeacherMapper;
import com.zhang.pojo.Teacher;
import com.zhang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
//    @Test
//    public void test(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        List<Teacher> teacher = mapper.getTeacher();
//        for(Teacher teacher1:teacher){
//            System.out.println(teacher1);
//        }
//        sqlSession.close();
//    }
    @Test
  public void test(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
      Teacher teacher = mapper.getTeacher(1);
      System.out.println(teacher);
      sqlSession.close();

//        Teacher(id=1, name=秦老师,
//              students=[Student(id=1, name=小明, tid=1),
//              Student(id=2, name=小红, tid=1),
//              Student(id=3, name=小李, tid=1),
//              Student(id=4, name=小张, tid=1),
//              Student(id=5, name=小赵, tid=1)])
  }
  @Test
  public void test2(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
      Teacher teacher2 = mapper.getTeacher2(1);
      System.out.println(teacher2);
      sqlSession.close();
  }
}
