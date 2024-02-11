package com.mycompany.dd1380labb6;

import java.util.Comparator;
public class ResSortByDate implements Comparator<Result>{
    public int compare(Result r1, Result r2){
        return r1.date - r2.date;
    }
}