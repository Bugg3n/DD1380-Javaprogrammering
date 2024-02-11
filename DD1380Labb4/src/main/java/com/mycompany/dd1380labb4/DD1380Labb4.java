package com.mycompany.dd1380labb4;

import java.util.Scanner;

public class DD1380Labb4 {
        public static Scanner in;
    
    public static int checkSet(String set, int N){
        for (int i = 0; i <= set.length()-N; i++){
            String current = set.substring(i, i+N);
            for (int j = 0; j<=set.length()-N; j++){
                String comparing = set.substring(j, j+N);
                if (i == j){
                }
                else if (current.equals(comparing)){
                    break;
                }
                else if (j==set.length()-N) {
                    return i;
                }
            }
        }
        return -1;
    }
        
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int N = in.nextInt();
        String set = in.next();
        System.out.print(checkSet(set, N));
    }
}
