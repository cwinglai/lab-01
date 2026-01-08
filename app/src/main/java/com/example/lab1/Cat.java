package com.example.lab1;

import java.util.Date;

public class Cat extends Pet implements Pettable {
    public Cat(String name) {
        super(name);
        //the super keyword is used to explicitly invokes the constructor
        // of the immediate parent class (superclass)
    }
    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }
    @Override
    public String speak() {
        return "meow";
    }
    @Override
    public void pet() {
        // you can leave this empty or add a print
    }
}

