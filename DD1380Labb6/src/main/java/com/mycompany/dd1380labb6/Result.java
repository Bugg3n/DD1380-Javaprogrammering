package com.mycompany.dd1380labb6;

public class Result implements Comparable<Result> {
    public int date;
    public String firstName;
    public String lastName;
    public String name;
    public int score;
    
    public Result(int startDate, String startFirstName, String startLastName, int startScore){
        date = startDate;
        firstName = startFirstName;
        lastName = startLastName;
        score = startScore;
        name = lastName+firstName;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public int compareTo(Result r){
        return this.name.compareTo(r.name);
    }
}

