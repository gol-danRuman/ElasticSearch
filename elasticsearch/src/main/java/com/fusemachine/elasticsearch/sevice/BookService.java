package com.fusemachine.elasticsearch.sevice;

import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import com.fusemachine.elasticsearch.entity.Book;

public interface BookService {
	Book save(Book book);
	void delete(Book book);
	Book findOne(String id);
	Iterable<Book> findAll();
	Page<Book> findByAuthor(String author, Pageable page);

	List<Book> findByTitle(String title);
}
