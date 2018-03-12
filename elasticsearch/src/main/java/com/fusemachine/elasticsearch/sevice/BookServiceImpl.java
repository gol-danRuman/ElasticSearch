package com.fusemachine.elasticsearch.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fusemachine.elasticsearch.entity.Book;
import com.fusemachine.elasticsearch.repository.BookRepository;

@Service
public class BookServiceImpl  implements BookService{

	private BookRepository bookRepository;
	@Autowired
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub
		bookRepository.delete(book);
	}

	@Override
	public Book findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Page<Book> findByAuthor(String author, Pageable page) {
		// TODO Auto-generated method stub
		return bookRepository.findByAuthor(author, page);
	}

	@Override
	public List<Book> findByTitle(String title) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitle(title);
	}
	

}
