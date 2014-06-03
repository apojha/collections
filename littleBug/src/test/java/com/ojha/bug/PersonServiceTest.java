package com.ojha.bug;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by alexandra on 02/06/2014.
 */
public class PersonServiceTest {

    private PersonService personSevice;

    @Before
    public void setup(){
        this.personSevice = new PersonService();
    }

    @Test
    public void testWhenPersonCreatedThenPersonExists(){
        // given
        Person person = this.personSevice.createPerson("Danny boy");
        person.addHobby("skiing");

        // when
        boolean exists = personSevice.personExists(person);

        // then
        assertTrue(exists);
    }
}
