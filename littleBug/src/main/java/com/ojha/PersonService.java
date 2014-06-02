package com.ojha;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by alexandra on 02/06/2014.
 */
public class PersonService {

    private Set<Person> people = new HashSet<Person>();

    public Person createPerson(String name){
        Person person = new Person(name);
        people.add(person);
        return person;
    }

    public boolean personExists(Person person){
        return people.contains(person);
    }
}
