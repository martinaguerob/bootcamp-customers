package com.nttdata.customers.repository;

import com.nttdata.customers.model.Customers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface CustomersRepository extends ReactiveMongoRepository<Customers, String> {
}
