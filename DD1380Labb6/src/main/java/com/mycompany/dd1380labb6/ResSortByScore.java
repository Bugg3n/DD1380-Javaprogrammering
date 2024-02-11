package com.mycompany.dd1380labb6;

import java.util.Comparator;
public class ResSortByScore implements Comparator<Result>{
    public int compare(Result r1, Result r2){
        return r1.score - r2.score;
    }
}
