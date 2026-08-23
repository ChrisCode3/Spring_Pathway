package Accessing_Relational_Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication
public class AccessingRelationalDataApplication implements CommandLineRunner {


	private static final Logger log = LoggerFactory.getLogger(AccessingRelationalDataApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(AccessingRelationalDataApplication.class, args);
	}


	private final JdbcTemplate jdbcTemplate;


	public AccessingRelationalDataApplication(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public void run(String... strings) throws Exception {


		System.out.println("Creating Tables");

		// the execute method is for writien queries for the database to execute
		jdbcTemplate.execute(("DROP TABLE IF EXISTS customers"));

		jdbcTemplate.execute("CREATE TABLE  customers (" + " id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255), age SMALLINT)");


// Split up  the array of whole names into an array of first names and second names
		List<Object[]> splitNames = Stream.of("John Woo 34", "Jeff Dean 65", "Josh Bloch 75", "Josh Long 67")
				.map(name -> name.split(" "))
				.collect(Collectors.toList());


// this prints the name of the data in the list
		splitNames.forEach(name -> System.out.println(name[0]  + " " +  name[1] +  " " +  name[2]));


		// this is where we add the information into the sql database.
		// using ? as a placeholder for a single value.
		jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name, age) VALUES (?,?,?)", splitNames);

		//jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?,?)", splitNames);

// this would be how you would do it in a proper application assumign that your getting the data from submit or from a repository
/*

	List<Customer> customers = customerRepository.findAll();
	customers.stream()
			.map(customer -> customer.getFirstName())
			.collect(Collectors.toList());

	}
*/




		// so the fimnal section is when we create a java object from a an entry in the sql

		jdbcTemplate.query( "SELECT id, first_name, last_name, age FROM customers WHERE first_name = ?",
				(rs, rowNum) -> new Customer((rs.getLong("id")), rs.getNString("first_name"),
						rs.getString("last_name"), rs.getInt("age")), "Josh")
				.forEach(customer -> System.out.println(customer.toString()));



	}

}

