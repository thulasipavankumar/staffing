package com.expleo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;
@Getter
@Setter
public class Employee {
    private String id;
    private String name;
    private String title;
}
