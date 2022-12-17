package com.sawanlibrary.projectlibrarymanagement.Repository;

import com.sawanlibrary.projectlibrarymanagement.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findById(int id);

    Book findByTitle(String title);

}
