package com.fusemachine.elasticsearch.entity;



import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "ruman", type = "books")
public class Book {
	@Id
	private String id;
	
	private String title;
	private String author;
	private String releaseDate;
	public Book() {
		super();
	}
	public Book(String id, String title, String author, String releaseDate) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.releaseDate = releaseDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", releaseDate=" + releaseDate + "]";
	}
	

	


	

}
