package com.bookstore.Bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.Bookstore.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
