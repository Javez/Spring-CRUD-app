package javezProject.dao;

import javezProject.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int peopleCount;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++peopleCount, "Tom"));
        people.add(new Person(++peopleCount, "Jack"));
        people.add(new Person(++peopleCount, "Li"));
        people.add(new Person(++peopleCount, "Fiona"));
    }
    public List<Person> index() {
        return people;
    }
    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
