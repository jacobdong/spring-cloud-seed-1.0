package site.igeek.person.repository;

import org.springframework.data.repository.CrudRepository;
import site.igeek.person.po.Person;

/**
 * Created by jacobdong on 16/6/23.
 */
public interface PersonRepository extends CrudRepository<Person, String> {
}
