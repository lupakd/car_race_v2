package com.codecool.springbootdemo.model;

import javax.validation.constraints.NotEmpty;

public class Dog {


    private Breed breed;
    @NotEmpty
    private String name;
    private int age;

    public Dog(Breed breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }


    public Dog() {
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
