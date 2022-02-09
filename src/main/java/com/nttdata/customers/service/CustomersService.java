package com.nttdata.customers.service;

import com.nttdata.customers.model.Customers;
import reactor.core.publisher.Mono;

public interface CustomersService extends CrudService<Customers, String>{

    Mono<Customers>findByCode(String code);
}
