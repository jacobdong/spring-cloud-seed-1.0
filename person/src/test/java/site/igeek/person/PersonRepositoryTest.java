package site.igeek.person;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.igeek.person.po.Person;
import site.igeek.person.repository.PersonRepository;

import javax.annotation.Resource;

/**
 * Created by jacobdong on 16/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PersonApplicationLauncher.class)
public class PersonRepositoryTest {

    private final String PERSON_ID = "123456";
    @Resource
    PersonRepository personRepository;

    @Test
    public void addTest() {

        Person person = new Person();
        person.setId(PERSON_ID);
        person.setName("张三");
        person.setAge(1);

        personRepository.save(person);


        Assert.assertNotNull(personRepository.findOne(PERSON_ID));

    }
}
