package Accessing_JPA.Data_with_REST;



import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



public interface PersonRepository extends PagingAndSortingRepository<Person , Long>,  CrudRepository<Person, Long> {


    List<Person> findByLastName(@Param("name") String name);








}
