package com.sawanlibrary.projectlibrarymanagement.Controller;

import com.sawanlibrary.projectlibrarymanagement.Entity.Book;
import com.sawanlibrary.projectlibrarymanagement.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    // POST APIs
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBook(@RequestBody List<Book> books){
        return bookService.saveBooks(books);
    }

    // GET APIs
    @GetMapping("/hi")
    public String hi(){
        return "Hello Savan, Welcome to Library-Management.";
    }

    @GetMapping("/books")
    public List<Book> findAllBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/bookById/{id}")
    public Book findBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @GetMapping("/bookByTitle/{title}")
    public Book getBookByTitle(@PathVariable String title){
        return bookService.getBookByTitle(title);
    }

    // PUT APIs
    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    // DELETE APIs
    @DeleteMapping("/delete/{id}")
    public String deleteBookById(@PathVariable int id){
        return bookService.deleteBookById(id);
    }
}
