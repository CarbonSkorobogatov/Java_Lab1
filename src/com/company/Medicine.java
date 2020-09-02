package com.company;

public class Medicine {
    String Name, Director, Actor, Date;
    int views;
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    Level level;


    public Medicine(){}
    
    public Medicine(String Name, String Director, String Actor, String Date, int Raiting, int views){
        this.Name = Name;
        this.Director = Director;
        this.Actor = Actor;
        this.Date = Date;
        this.views = views;

        if (Raiting < 7){
            this.level = Level.HIGH;
        }else if(Raiting < 4){
            this.level = Level.MEDIUM;
        }else{
            this.level = Level.LOW;
        }
    }
}
