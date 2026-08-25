package Building_REST_services_with_Spring;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Employee {


@Id
@GeneratedValue
private Long id;




private String name;

private String role;


Employee () {}

Employee ( String name, String role) {


    this.name = name;

    this.role = role;
}





}
