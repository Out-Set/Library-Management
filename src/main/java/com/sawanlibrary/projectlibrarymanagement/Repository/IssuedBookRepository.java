package com.sawanlibrary.projectlibrarymanagement.Repository;

import com.sawanlibrary.projectlibrarymanagement.Entity.Book;
import com.sawanlibrary.projectlibrarymanagement.Entity.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssuedBookRepository extends JpaRepository<IssuedBook, Integer> {
    IssuedBook findById(int id);
}
