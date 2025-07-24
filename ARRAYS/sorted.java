// Given an array of size n, write a program to check if the given array is sorted in 
// (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True,
// Else return False.



package ARRAYS;

import java.util.Scanner;

public class sorted {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        
        for(int i=0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=1; i<arr.length ; i++){
            if(arr[i]<arr[i-1]){
                System.out.println("false");
                return;
            }
           
        }
         System.out.println("true");

     }
}
