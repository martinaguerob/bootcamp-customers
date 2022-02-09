package com.nttdata.customers.service.impl;

import com.nttdata.customers.model.Customers;
import com.nttdata.customers.repository.CustomersRepository;
import com.nttdata.customers.service.CustomersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomersServiceImpl implements CustomersService {
	
	@Autowired
    private CustomersRepository customersRepository;

    @Override
    public Flux<Customers> findAll() {
        return customersRepository.findAll();
    }

    @Override
    public Mono<Customers> save(Customers entity) {
        entity.setStatus(true);
        return customersRepository.save(entity);
    }

    @Override
    public Mono<Customers> update(Customers entity) {
        return customersRepository.save(entity);
    }

    @Override
    public Mono<Void> delete(String id) {
        return customersRepository.deleteById(id);
    }

    @Override
    public Mono<Customers> findByCode(String code) {
        return customersRepository.findByCode(code);
    }
}
