package com.bookstore.Bookstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.Bookstore.dao.AuthorRepository;
import com.bookstore.Bookstore.dao.BookRepository;
import com.bookstore.Bookstore.entity.Book;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookstoreController {
	
	private BookRepository bookRepository;
	
	private AuthorRepository AuthorRepository;
	
	public BookstoreController(BookRepository bookRepository,
			com.bookstore.Bookstore.dao.AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		AuthorRepository = authorRepository;
	}

	@GetMapping("/bookstore")
	List<Book> getAll() {
		return bookRepository.findAll();
	}
	
	@PostMapping("/bookstore")
	Book addPlanet(@RequestBody Book book) {
		return bookRepository.save(book);
	}

	@GetMapping("/bookstore/{id}")
	public Book getBook(@PathVariable Integer id) {
		return bookRepository.getOne(id);
	}
	
	@PutMapping("/bookstore/{id}")
	Book updatePlanet(@RequestBody Book book, @PathVariable Integer id) {
		return bookRepository.findById(id).map(existingBook -> {
			existingBook.setTitle(book.getTitle());
			existingBook.setPrice(book.getPrice());
			existingBook.setYear(book.getYear());
			existingBook.setCategory(book.getCategory());
			return bookRepository.save(existingBook);
		}).orElseGet(() -> {
			return bookRepository.save(book);
		});
	}
	
	@DeleteMapping("/bookstore/{id}")
	void delete(@PathVariable Integer id) {
		bookRepository.deleteById(id);
	}
	

}
