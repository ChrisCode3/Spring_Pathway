package springbootRest.example.Building_a_RESTful_Web_Service;





 /*


 https://spring.io/guides/gs/rest-service


 How to make  a Hello World  Restful Web with Spring

  HTTP requests are handled by a controller

  @RestController annotation and it also returns a json/xml

  The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.

 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Rest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Rest1Application.class, args);
	}

}
