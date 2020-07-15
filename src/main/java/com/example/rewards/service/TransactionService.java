package com.example.rewards.service;

import com.example.rewards.data.Transaction;
import com.example.rewards.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    public int  getPointForUser(String user, int monthLimit) {
        Date date = Date.from(LocalDate.now().minusMonths(monthLimit).minusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(date);
        List<Transaction> transactions = transactionRepository.findAllByUserIdAndDateAfter(user, date);
        return transactions.stream().map(t -> {
            double amount = t.getAmount();
            int point = 0;
            if (amount > 50)
                point += 50;
            if(amount > 100)
                point += (amount - 100) * 2;
            return point;
        }).reduce(0, Integer::sum);
    }

}
