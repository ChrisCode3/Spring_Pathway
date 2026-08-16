package Accessing_Data_with_JPA;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

        List<Customer> findByLastName(String lastName);

        Customer findById(long id);

        Customer findByFirstName (String firstName);


}

