package com.ojha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandra on 02/06/2014.
 */
public class Person {

    private final String name;
    private final List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<String>();
    }

    public String getName(){
        return this.name;
    }

    public void addHobby(String hobby){
        this.hobbies.add(hobby);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!hobbies.equals(person.hobbies)) return false;
        if (!name.equals(person.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + hobbies.hashCode();
        return result;
    }
}
