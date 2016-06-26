package site.igeek.person.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import site.igeek.person.domain.Person;
import site.igeek.person.repository.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jacobdong on 16/6/22.
 */
@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/greeting")
    public Map sayHello() {

        Map map = new HashMap();
        map.put("name", "jacobDong");
        map.put("content", "hello world");

        return map;
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String personName) {
        Person p = new Person(personName);
        personRepository.save(p);
        List<Person> people = personRepository.findAll(new PageRequest(0, 10)).getContent();
        return people;
    }
}
