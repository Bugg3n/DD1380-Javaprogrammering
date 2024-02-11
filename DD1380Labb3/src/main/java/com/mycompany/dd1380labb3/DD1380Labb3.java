package com.mycompany.dd1380labb3;
import java.util.*;

public class DD1380Labb3 {
        public static Scanner in;

    
    static int formel(boolean parantes){
        int u1 = uttryck();
        char op = operator();
        int u2 = uttryck();
        if (parantes){
            in.next(); 
        }
        return calculate(u1, op, u2);
    }
    
    static int uttryck(){
        String next = in.next();
        if (isNumeric(next)){
            return Integer.parseInt(next);
            
        }
        else {
            return formel(true);
        }
    }
    
    static char operator(){
        String next = in.next();
        return(next.charAt(0));
    }
    
    
    static int calculate(int num1, char operator, int num2){
            if (operator == '+'){
                return (num1+num2);
            }
            if (operator == '-'){
                return (num1-num2);
            }
            if (operator == '*'){
                return (num1*num2);
            }
            return 0;
    }
    static boolean isNumeric(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print(formel(false));
        }
    }