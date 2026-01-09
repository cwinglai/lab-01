package com.example.petshop;
import java.util.Date;
public abstract class Mood {
    private Date date;

    //1.Constructor with default date
    public Mood() {
        this.date = new Date();
    }

    //2.Constructor with specific date
    public Mood(Date date) {
        this.date =date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    //abstract method for mood string
    public abstract String getMood();
    public Date getDate() {
        return date;
    }


}
