package com.mycompany.dd1380labb2;
import java.util.*;


public class DD1380Labb2 {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        long sum = 0;
        long prime;

        long n = in.nextLong();  // Läser in N
        
        for (long i = 0; i < n; i++){ // Summerar alla tal
            sum = sum + in.nextLong();
        }
        
        for (long j = 2; j < sum+1; j++){  // Räknar ut minsta primtalsfaktorn
            if (sum%j == 0){
                prime = j;
                System.out.print(prime);
                break;
            }
        }
    }   
}
