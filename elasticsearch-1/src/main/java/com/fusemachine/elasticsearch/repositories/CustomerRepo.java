package com.fusemachine.elasticsearch.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.fusemachine.elasticsearch.entities.Customer;

public interface CustomerRepo extends ElasticsearchRepository<Customer, String>{

	
	
}
