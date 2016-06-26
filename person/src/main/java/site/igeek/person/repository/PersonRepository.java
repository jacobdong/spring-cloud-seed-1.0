package site.igeek.person.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import site.igeek.person.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
