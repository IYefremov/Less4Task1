package com.less4task1Package;

public class Human {
    private int age;
    private float weight, height;
    private String firstName, lastName;

    public Human(int age, float weight, float height, String firstName, String lastName) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human() {

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
