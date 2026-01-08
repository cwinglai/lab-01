package com.example.lab1;
import java.util.Date;
public class Sad extends Mood {
    //1. Constructor with no parameter
    public Sad() {
        super();
    }
    //2. Constructor with Date parameter
    public Sad(Date date){
        super(date);
    }
    @Override
    public String getMood() {
        return "Sad";
    }
}
