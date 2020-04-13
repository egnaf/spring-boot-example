package com.github.egnaf.controllers;

import com.github.egnaf.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    private ArrayList<Book> books = new ArrayList<>();

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/books")
    public String addBook(Model model, @RequestParam(required = false) int id,
                          @RequestParam(required = false) String name,
                          @RequestParam(required = false) String author) {
        books.add(new Book(id, name, author));
        model.addAttribute("books", books);
        return "books";
    }
}
