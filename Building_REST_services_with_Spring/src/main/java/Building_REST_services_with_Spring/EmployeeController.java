package Building_REST_services_with_Spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {



    String hello = "Hello World";

   // Employee myEmployee  = new Employee("John" , "Smith");



  /*  public String Employee(Employee) {



    }*/



    @GetMapping("/hello")
    public String Hello() {


        return hello;
    }

}
