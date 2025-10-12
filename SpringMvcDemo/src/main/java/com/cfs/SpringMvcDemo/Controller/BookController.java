package com.cfs.SpringMvcDemo.Controller;


import com.cfs.SpringMvcDemo.Entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private List<Book> bookList=new ArrayList<>();
    @GetMapping("/books")
    public String getBooks(Model model){
//        bookList.add(new Book( "Java Programming", "James Gosling"));
//        bookList.add(new Book( "Spring Boot Basics", "Rod Johnson"));
        model.addAttribute("books",bookList);
        return "books";
    }
    @PostMapping("/add-book")
    public String addBook(@ModelAttribute Book book){
        bookList.add(book);
        return "redirect:/books";
    }
    @GetMapping("/add-book")
    public String ShowAllBooks(Model model){
        model.addAttribute("books   ",new Book());
        return "add-book";
    }
}
