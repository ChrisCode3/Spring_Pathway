package Building_REST_services_with_Spring;


import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository< Employee, Long > {
}
