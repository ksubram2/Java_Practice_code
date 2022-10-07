import java.util.Scanner;

public class PractiseCode2{
    public static void main(String[] args) {
        try {
              System.out.println("using Try and Catch Block");
              System.out.println("To try Try Block Exception");
              System.out.println("Write a program to compute and print the number of students who have obtained marks");
              System.out.println("Enter the marks of Students");
              Scanner input = new Scanner(System.in);
              int marks = input.nextInt();
              if(marks<=100 && marks>80){
                System.out.println("Marks in Range of 81 to 100");
              }
              else{
                   if(marks<=80 && marks>60){
                      System.out.println("Marks in Range of 61 to 80");
                  }
                  else{
                       if(marks<=60 && marks>40){
                          System.out.println("Marks in Range of 41 to 60");
                      }
                      else{
                           System.out.println("Marks in Range of 0 to 40");
                      }
                    }  
                }
                input.close();
            } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}