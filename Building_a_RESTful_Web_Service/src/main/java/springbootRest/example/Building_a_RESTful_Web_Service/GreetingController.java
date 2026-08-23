package springbootRest.example.Building_a_RESTful_Web_Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;


/*

A
  @RestController annotation and it also returns a json/xml


  The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
 */


@RestController
public class GreetingController {

private static final String template = "Hello Sexy , %s!";


int num = 0;


public static int count (int x){



    return x + x;
}



  private final AtomicLong counter = new AtomicLong();




@GetMapping("/greeting")
public Greeting greeting(@RequestParam(defaultValue = "World") String name) {


        return new Greeting(counter.incrementAndGet(),
                template.formatted(name));

    }










}

