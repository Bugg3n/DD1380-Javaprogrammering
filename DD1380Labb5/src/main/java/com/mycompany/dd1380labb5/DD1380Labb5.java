package com.mycompany.dd1380labb5;

import java.util.Scanner;

public class DD1380Labb5 {
    public static Scanner in;
    public static int counter;
    public static boolean hashit;
        
    public static int readMap(int xLength,int yLength){
        char[][] map;
        map = new char[xLength][yLength];
        for (int i = 0; i<yLength; i++){
            String row = in.next();
            for (int j = 0; j<xLength; j++){
                map[j][i] = row.charAt(j);
            }
        }
        for (int y = 0; y < yLength; y++){
            for (int x = 0; x < xLength; x++){
                if (map[x][y] == '@'){
                    hashit = false;
                    counter += 1;
                    map = check(map,x,y, xLength, yLength, false);
                    }
                }
            }
        return counter;
        }

    public static char[][] check(char[][] map, int x, int y, int xmax, int ymax, boolean down){
        map[x][y] = 'X';
        if (x+1<xmax){
            if (map[x+1][y] == '@'){
                map=check(map,x+1,y, xmax, ymax, false);
            } else if ((map[x+1][y] == 'X')&& !(down)&&!(hashit)){
                counter -= 1;
                hashit = true;
            }
        }
        if (y+1<ymax){
            if (map[x][y+1] == '@'){
                map=check(map,x,y+1, xmax, ymax, true);
            }
            else if ((map[x][y+1] == 'X') &&!(hashit)){
                counter -= 1;
                hashit = true;
            }
        }
        return map;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int y = in.nextInt();
        int x = in.nextInt();
        int islands = readMap(x,y);
        System.out.print(islands);
    }
}