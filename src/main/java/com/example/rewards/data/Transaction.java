package com.example.rewards.data;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@Document(collection = "transactions")
public class Transaction {
    private long id;
    private String userId;  //for demonstration, in real app would be a object
    private String description;
    private double amount;
    private Date date;
}
