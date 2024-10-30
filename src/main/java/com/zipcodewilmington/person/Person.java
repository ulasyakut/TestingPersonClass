package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    //we have this class named Person

    private String name = "Leon";
    private int age = 5;
    //private int salary;
    //private String company;
    //private String car;
    //private String state;
    //to encapsulate data about object,we declared variables in class as private and
    //we will write public methods in class to set and get those values
    //Person person = new Person(name,age);


    //public Person (String name,int age) {
        //this.name = name;
        //this.age = age;
        //this.salary = salary;
        //this.company = company;
        //this.car = car;
        //this.state = state;
    //}
    Person person = new Person(name,age);




    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;


    }


    public void setName(String name) {

        this.name =name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return person.name;
    }

    public int getAge() {

        return person.age;
    }
}
