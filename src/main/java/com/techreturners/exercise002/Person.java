/**
 * @author Shurel Reynolds
 */
package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lastName;
    private String location;
    private int age;

    public Person(String firstName, String lastName, String location, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
