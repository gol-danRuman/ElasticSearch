package com.fusemachine.elasticsearch;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fusemachine.elasticsearch.entities.Customer;
import com.fusemachine.elasticsearch.repositories.CustomerRepo;

@SpringBootApplication
public class Elasticsearch1Application {

	@Autowired
	private CustomerRepo customerRepo;
	
	public void getCustomers() {
		
		List<Customer> cl = Lists.newArrayList(customerRepo.findAll());
		
		cl.forEach(x  -> System.out.println(x.getFirstName()));
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Elasticsearch1Application.class, args);
	}
}
