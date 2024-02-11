package com.mycompany.dd1380labb6;
import java.util.*;

public class DD1380Labb6 {
    public static Scanner in;
    
    public static Result[] filterStudents(int N, int D){
        Result[] studentList = new Result[0] ;
        int j = 0;
        for(int i = 0; i<N; i++){
            boolean notFound = true;
            Result student = new Result(in.nextInt(),in.next(), in.next(), in.nextInt());            
            if (student.date <= D){
                for (int l = 0; l<studentList.length; l++){
                    if (student.name.equals(studentList[l].name)){
                        notFound = false;
                        if (student.score > studentList[l].score){
                            studentList[l] = student;
                        }
                    }
                }
                if (notFound){
                studentList = Arrays.copyOf(studentList, studentList.length + 1);
                studentList[studentList.length-1] = student;
                }   
            }
        }
        return studentList;
    }
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int N = in.nextInt();
        int D = in.nextInt();
        Result[] studentList = filterStudents(N, D);
        Collections.sort(Arrays.asList(studentList));        
        if (studentList.length == 0){
            System.out.println("EMPTY");
        }
        else{
            for (Result studentList1 : studentList) {
                System.out.println(studentList1.date + " " + studentList1.firstName + ' ' + studentList1.lastName + ' ' + studentList1.score);
            }
        }
    }
}