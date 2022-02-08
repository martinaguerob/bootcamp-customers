package com.nttdata.customers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "customers")
public class Customers {

    @Id
    private String id;
    private String name;
    private String lastname;
    private String code;
    private String type;
}
