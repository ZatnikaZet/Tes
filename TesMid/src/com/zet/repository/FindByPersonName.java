package com.zet.repository;

public class FindByPersonName implements  Specification <Person>{

    private String name;

    public FindByPersonName (String name){
        this.name = name;
    }

    @Override
    public boolean isExist(Person person) {
        return person.getName().equalsIgnoreCase(name);
    }
}
