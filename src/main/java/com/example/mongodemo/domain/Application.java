package com.example.mongodemo.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Accessors(chain = true)
@Document
public class Application {
    @Id
    private String id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String phoneNumber;


    private List<Passport> passports;
}
