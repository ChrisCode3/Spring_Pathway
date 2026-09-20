package Building_REST_services_with_Spring;


import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Employee {


@Id
@GeneratedValue
private Long id;




private String firstName;

private String lastName;

private String role;


Employee () {}

Employee ( String firstName,String lastName, String  role) {


    this.firstName = firstName;

    this.role = role;

    this.lastName = lastName;
}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.role);
    }


}
