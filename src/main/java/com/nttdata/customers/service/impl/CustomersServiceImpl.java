package com.nttdata.customers.service.impl;

import com.nttdata.customers.model.Customers;
import com.nttdata.customers.repository.CustomersRepository;
import com.nttdata.customers.service.CustomersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class CustomersServiceImpl implements CustomersService {

    private final CustomersRepository customersRepository;

    @Override
    public Flux<Customers> findAll() {
        return customersRepository.findAll();
    }

    @Override
    public Mono<Customers> save(Customers entity) {
        return customersRepository.save(entity);
    }

    @Override
    public Mono<Customers> update(Customers entity) {
        return customersRepository.save(entity);
    }

    @Override
    public Mono<Void> delete(Long id) {
        return customersRepository.deleteById(id);
    }
}
