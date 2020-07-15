package com.example.rewards.repository;

import com.example.rewards.data.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction, Long> {
    List<Transaction> findAllByUserIdAndDateAfter(String userId, Date date);
    List<Transaction> findAll();
}
