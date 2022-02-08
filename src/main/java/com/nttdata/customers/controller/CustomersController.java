package com.nttdata.customers.controller;

import com.nttdata.customers.model.Customers;
import com.nttdata.customers.service.CustomersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    CustomersService customersService;

    @GetMapping
    public Flux<Customers> getCustomers(){
        System.out.println("Listar clientes");
        return customersService.findAll();
    }

    @PostMapping
    public Mono<Customers> saveCustomer(@RequestBody Customers customer){
        System.out.println("Guardar cliente");
        return customersService.save(customer);
    }
}
