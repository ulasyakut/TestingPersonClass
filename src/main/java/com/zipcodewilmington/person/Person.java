package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private int salary;
    private String car;
    private String state;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

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
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getCar() {
        return car;
    }

    public String getState() {
        return state;
    }
}
