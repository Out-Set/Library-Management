package com.sawanlibrary.projectlibrarymanagement.Controller;

import com.sawanlibrary.projectlibrarymanagement.Entity.IssuedBook;
import com.sawanlibrary.projectlibrarymanagement.Repository.IssuedBookRepository;
import com.sawanlibrary.projectlibrarymanagement.Service.IssuedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IssuedBookController {

    @Autowired
    private IssuedBookService issuedBookService;

    // GET APIs
    @GetMapping("/issuedBooks")
    public List<IssuedBook> findIssuedBook(){
        return issuedBookService.getIssuedBook();
    }

    @GetMapping("/issuedBook/{id}")
    public IssuedBook FindIssuedBookById(@PathVariable int id){
        return issuedBookService.getIssuedBooksById(id);
    }

    // POST APIs
    @PostMapping("/issueBook")
    public IssuedBook issueABook(@RequestBody IssuedBook issuedBook){
        return issuedBookService.issueBook(issuedBook);
    }

    @PostMapping("/issueBooks")
    public List<IssuedBook> issueManyBooks(@RequestBody List<IssuedBook> issuedBooks){
        return issuedBookService.issueBooks(issuedBooks);
    }

    // PUT APIs
    @PutMapping("/updateIssuedBook")
    public IssuedBook updateIssuedBook(@RequestBody IssuedBook issuedBook){
        return issuedBookService.updateIssuedBook(issuedBook);
    }

    // DELETE APIs
    @DeleteMapping("/deleteIssuedBook/{id}")
    public String deleteIssuedBook(@PathVariable int id){
        return issuedBookService.deleteIssuedBook(id);
    }
}

