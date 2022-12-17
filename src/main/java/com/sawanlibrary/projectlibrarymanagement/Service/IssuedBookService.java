package com.sawanlibrary.projectlibrarymanagement.Service;

import com.sawanlibrary.projectlibrarymanagement.Entity.IssuedBook;
import com.sawanlibrary.projectlibrarymanagement.Repository.IssuedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssuedBookService {

    @Autowired
    private IssuedBookRepository issuedBookRepository;

    // Issue a Book
    public IssuedBook issueBook(IssuedBook issueBook){
        return issuedBookRepository.save(issueBook);
    }

    // Issue many Books
    public List<IssuedBook> issueBooks(List<IssuedBook> issueBooks){
        return issuedBookRepository.saveAll(issueBooks);
    }

    // Get all Issued Books
    public List<IssuedBook> getIssuedBook(){
        return issuedBookRepository.findAll();
    }

    // Get Issued Books by Id
    public IssuedBook getIssuedBooksById(int id){
        return issuedBookRepository.findById(id).orElse(null);
    }

    // Get Issued Books by Email
    public Object getIssuedBooksByEmail(String email){
        return issuedBookRepository.findByEmail(email);
    }

    // Delete a Issued Book
    public String deleteIssuedBook(int id){
        issuedBookRepository.deleteById(id);
        return "Record Deleted";
    }

    // Update the Issued details
    public IssuedBook updataIssuedBook(IssuedBook issuedBook){

        IssuedBook existingIssuedBook;

        existingIssuedBook = issuedBookRepository.findById(issuedBook.getId()).orElse(null);

        existingIssuedBook.setBookId(issuedBook.getBookId());
        existingIssuedBook.setStatus(issuedBook.getStatus());
        existingIssuedBook.setUserId(issuedBook.getUserId());

        return issuedBookRepository.save(existingIssuedBook);
    }
}
