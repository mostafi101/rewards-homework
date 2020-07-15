package com.example.rewards;

import com.example.rewards.data.Transaction;
import com.example.rewards.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class RewardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TransactionRepository transactionRepository) {
		return args -> {
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			transactionRepository.deleteAll();
			List<Transaction> transactions = Arrays.asList(
					Transaction.builder().id(3001L).userId("user3").description("General Transaction").amount(210.01).date(dateFormat.parse("02/01/2020")).build(),
					Transaction.builder().id(3002L).userId("user3").description("General Transaction").amount(1000.00).date(dateFormat.parse("04/015/2020")).build(),
					Transaction.builder().id(3003L).userId("user3").description("General Transaction").amount(10.01).date(dateFormat.parse("06/13/2020")).build(),
					Transaction.builder().id(3004L).userId("user3").description("General Transaction").amount(60.01).date(dateFormat.parse("06/13/2020")).build(),

					Transaction.builder().id(1001L).userId("user1").description("General Transaction").amount(20.01).date(dateFormat.parse("02/01/2020")).build(),
					Transaction.builder().id(1002L).userId("user1").description("General Transaction").amount(1000.00).date(dateFormat.parse("03/01/2020")).build(),
					Transaction.builder().id(1003L).userId("user1").description("General Transaction").amount(10.01).date(dateFormat.parse("03/13/2020")).build(),
					Transaction.builder().id(1004L).userId("user1").description("General Transaction").amount(129.01).date(dateFormat.parse("04/14/2020")).build(),
					Transaction.builder().id(1005L).userId("user1").description("General Transaction").amount(220.01).date(dateFormat.parse("04/17/2020")).build(),
					Transaction.builder().id(1006L).userId("user1").description("General Transaction").amount(720.01).date(dateFormat.parse("04/27/2020")).build(),
					Transaction.builder().id(1007L).userId("user1").description("General Transaction").amount(520.01).date(dateFormat.parse("04/28/2020")).build(),
					Transaction.builder().id(1008L).userId("user1").description("General Transaction").amount(220.01).date(dateFormat.parse("05/03/2020")).build(),
					Transaction.builder().id(1009L).userId("user1").description("General Transaction").amount(420.01).date(dateFormat.parse("05/15/2020")).build(),
					Transaction.builder().id(1010L).userId("user1").description("General Transaction").amount(320.01).date(dateFormat.parse("05/16/2020")).build(),
					Transaction.builder().id(1011L).userId("user1").description("General Transaction").amount(30.11).date(dateFormat.parse("05/20/2020")).build(),
					Transaction.builder().id(1012L).userId("user1").description("General Transaction").amount(270.28).date(dateFormat.parse("06/03/2020")).build(),
					Transaction.builder().id(1013L).userId("user1").description("General Transaction").amount(50.00).date(dateFormat.parse("06/07/2020")).build(),
					Transaction.builder().id(1014L).userId("user1").description("General Transaction").amount(120.11).date(dateFormat.parse("06/19/2020")).build(),
					Transaction.builder().id(1015L).userId("user1").description("General Transaction").amount(60.06).date(dateFormat.parse("06/21/2020")).build(),
					Transaction.builder().id(1016L).userId("user1").description("General Transaction").amount(1000.95).date(dateFormat.parse("06/23/2020")).build(),
					Transaction.builder().id(1017L).userId("user1").description("General Transaction").amount(10.00).date(dateFormat.parse("06/24/2020")).build(),
					Transaction.builder().id(1018L).userId("user1").description("General Transaction").amount(60.01).date(dateFormat.parse("07/01/2020")).build(),
					Transaction.builder().id(1019L).userId("user1").description("General Transaction").amount(300.01).date(dateFormat.parse("07/05/2020")).build(),
					Transaction.builder().id(1020L).userId("user1").description("General Transaction").amount(200.01).date(dateFormat.parse("07/06/2020")).build(),

					Transaction.builder().id(2001L).userId("user2").description("General Transaction").amount(20.01).date(dateFormat.parse("02/01/2020")).build(),
					Transaction.builder().id(2002L).userId("user2").description("General Transaction").amount(300.00).date(dateFormat.parse("05/01/2020")).build(),
					Transaction.builder().id(2003L).userId("user2").description("General Transaction").amount(30.01).date(dateFormat.parse("05/02/2020")).build(),
					Transaction.builder().id(2004L).userId("user2").description("General Transaction").amount(90.01).date(dateFormat.parse("05/14/2020")).build(),
					Transaction.builder().id(2005L).userId("user2").description("General Transaction").amount(2001.00).date(dateFormat.parse("05/28/2020")).build(),
					Transaction.builder().id(2006L).userId("user2").description("General Transaction").amount(50.01).date(dateFormat.parse("06/01/2020")).build(),
					Transaction.builder().id(2007L).userId("user2").description("General Transaction").amount(40.01).date(dateFormat.parse("06/13/2020")).build(),
					Transaction.builder().id(2008L).userId("user2").description("General Transaction").amount(60.49).date(dateFormat.parse("06/27/2020")).build(),
					Transaction.builder().id(2009L).userId("user2").description("General Transaction").amount(220.01).date(dateFormat.parse("06/03/2020")).build(),
					Transaction.builder().id(2010L).userId("user2").description("General Transaction").amount(120.01).date(dateFormat.parse("07/02/2020")).build()

			);
			transactionRepository.saveAll(transactions);
		};
	}

}
