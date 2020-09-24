package com.bookstore.Bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.Bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
