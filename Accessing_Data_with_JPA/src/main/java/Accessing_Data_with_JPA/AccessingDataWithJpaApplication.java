package Accessing_Data_with_JPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AccessingDataWithJpaApplication {


	private static final Logger logger = LoggerFactory.getLogger(AccessingDataWithJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataWithJpaApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {

		return (args) -> {
			// save a few customers
			repository.save(new Customer("Jack", "Bauer", 32));
			repository.save(new Customer("Chloe", "O'Brian", 60));


			// fetch all customers
			logger.info("Customers found with findAll():");
			logger.info("-------------------------------");
			repository.findAll().forEach(customer -> {
				logger.info(customer.toString());
			});
			logger.info("");


		};


	}
}


