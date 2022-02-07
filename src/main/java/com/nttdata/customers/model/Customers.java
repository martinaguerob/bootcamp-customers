package com.nttdata.customers.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(collation = "Customers")
public class Customers {

    @Id
    private Long id;
    private String name;
    private String lastname;
    private String code;
    private String type;
}
