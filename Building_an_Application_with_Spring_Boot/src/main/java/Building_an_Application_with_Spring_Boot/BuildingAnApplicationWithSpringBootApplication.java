package Building_an_Application_with_Spring_Boot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;





@SpringBootApplication
public class BuildingAnApplicationWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildingAnApplicationWithSpringBootApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {


			System.out.println("Hello World");
/*
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);

			for ( String beanName : beanNames ) {

				System.out.println(beanName);
				
			}*/

		};


	}

}

