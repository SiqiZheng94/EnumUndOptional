package org.example;

import java.util.*;

public class PersonRepository {
    private Map<String, Person> persons = new HashMap();

    public void addPerson(Person person){
        persons.put(person.id(), person);
    }
    public Optional<Person> findById(String mapId){

        return Optional.ofNullable(persons.get(mapId));
    }

    public Optional<List<Person>> findByName(String name){
        List<Person> personNameList = new ArrayList<>();

        for(Person person : persons.values()){
            if(person.name().equals(name)){
                personNameList.add(person);
            }
        }
        return Optional.ofNullable(personNameList);
        //return Optional.empty();
    }
    public void numberOfGender(){
        int male=0;
        int female=0;
        int diverse=0;
        for(Person person:persons.values()){
            if(person.gender().equals(Gender.MALE)){
                ++male;
            }else if(person.gender().equals(Gender.FEMALE)){
                ++female;
            }
            else if(person.gender().equals(Gender.DIVERSE)){
                ++diverse;
            }
        }
        System.out.println("the number of male is: "+male+ ". the number of temale is: "+female+". the number of diverse is: "+diverse);
    }

}
