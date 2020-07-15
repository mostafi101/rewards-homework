package com.example.rewards.controller;

import com.example.rewards.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/transaction")
public class TransactionController {

    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }


    @GetMapping("/rewardpoint/{userID}")
    public int getPoint(@PathVariable String userID) {
        //for three month
        return transactionService.getPointForUser(userID, 3);
    }
}
