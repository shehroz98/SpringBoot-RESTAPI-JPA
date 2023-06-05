package com.example.spring.datajpa.repository;

import com.example.spring.datajpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByPublished(boolean published);

    List<Book> findByTitleContaining(String title);
}
