package com.zhang.controller;

import com.zhang.pojo.Books;
import com.zhang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("book", books);
        return "updateBook";
    }

    @RequestMapping("/UpdateBook")
    public String updateBook(Model model, Books books) {
        bookService.updateBook(books);
        Books books1 = bookService.queryBookById(books.getBookID());
        model.addAttribute("book", books1);
        return "allBook";
    }

    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBookByName(Model model, String name) {
        //List<Books> list = new ArrayList<Books>();
        List<Books> list = bookService.queryBookByName(name);
        System.out.println(list);
        //list.add(books);
        model.addAttribute("list",list);
        return "allBook";
    }

}