package com.sawanlibrary.projectlibrarymanagement.Service;

import com.sawanlibrary.projectlibrarymanagement.Entity.Book;
import com.sawanlibrary.projectlibrarymanagement.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // Save a Book
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    // Save a list of Book
    public List<Book> saveBooks(List<Book> books){
        return bookRepository.saveAll(books);
    }

    // Get all books
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    // Get a book by Id
    public Book getBookById(int id){
        return bookRepository.findById(id);
    }

    // Get a book by title
    public Book getBookByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    // Delete a book by Id
    public String deleteBookById(int id){
        bookRepository.deleteById(id);
        return "Book Deleted";
    }

    // Update a book details
    public Book updateBook(Book book){
        Book existingBook;
        // Fetching whether book exist in table or not with the given Id
        existingBook = bookRepository.findById(book.getId());

        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setIsbn(book.getIsbn());
        existingBook.setSubject(book.getSubject());

        return bookRepository.save(existingBook);
    }
}
