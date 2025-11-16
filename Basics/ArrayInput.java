package Basics;

import java.util.*;


public class ArrayInput {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of Array :");
      int size = sc.nextInt();
      String names[] = new String[size];


      //input
      for(int i=0; i<size; i++) {
    	  System.out.println("Enter Name "+(i+1));
          names[i] = sc.next();
      }
     
      //output
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      
   }
}

