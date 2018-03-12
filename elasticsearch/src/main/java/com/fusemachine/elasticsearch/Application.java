package com.fusemachine.elasticsearch;

import java.util.Map;


import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.querydsl.QPageRequest;

import com.fusemachine.elasticsearch.entity.Book;
import com.fusemachine.elasticsearch.sevice.BookService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private ElasticsearchOperations es;
	@Autowired
	private BookService bookService;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		printElasticSearchInfo();
		bookService.save(new Book("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017"));
        bookService.save(new Book("1002", "Apache Lucene Basics", "Rambabu Posa", "13-MAR-2017"));
        bookService.save(new Book("1003", "Apache Solr Basics", "Rambabu Posa", "21-MAR-2017"));
        
        //fuzzey search
        //Page<Book> books = bookService.findByAuthor(author, new page);
        
        Pageable page = new QPageRequest(0, 10);
        
        Page<Book> books = bookService.findByAuthor("Rambabu", page);
        books.forEach(System.out::println);
        		
        		
        		
        		
        		
	}
	//useful for debug, print elastic search details
    private void printElasticSearchInfo() {

        System.out.println("--ElasticSearch--");
        Client client = es.getClient();
        Map<String, String> asMap = client.settings().getAsMap();

        asMap.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
        System.out.println("--ElasticSearch--");
    }
	

}
