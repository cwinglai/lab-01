package com.example.lab1;

import java.util.Date;

public class Happy extends Mood {
    public Happy() {
        super();
    }
    //2. Constructor with Date parameter
    public Happy(Date date){
        super(date);
    }
    @Override
    public String getMood() {
        return "Happy";
    }
}
