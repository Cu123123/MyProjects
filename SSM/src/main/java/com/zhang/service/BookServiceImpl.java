package com.zhang.service;

import com.zhang.dao.BookMapper;
import com.zhang.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


public class BookServiceImpl implements BookService{
    //调用dao层的操作，设置一个set接口，方便Spring管理
    //@Autowired
    //@Qualifier(value = "bookMapper")
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        System.out.println(books);
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
