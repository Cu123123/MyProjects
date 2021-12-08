package com.zhang;

import com.zhang.dao.BlogMapper;
import com.zhang.pojo.Blog;
import com.zhang.utils.IDutils;
import com.zhang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addInitBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("MyBatis如此简单");
        blog.setAuthor("Cu说");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java如此简单");
        blog.setAuthor("Cu说");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring如此简单");
        blog.setAuthor("Cu说");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIF() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("author", "Cu说");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("author", "Cu说");
        map.put("views", 999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("title","Java如此简单3");
        map.put("author","Cu说3");
        map.put("id","1f6a2934a2c441638d23d87229a712db");
        mapper.updateBlog(map);
        sqlSession.close();
    }

    @Test
    public void queryBlogForeachTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for(Blog blog:blogs){
            System.out.println(blog);
        }
        sqlSession.close();
    }
}


