// Given an array of integers nums, return the value of the largest element in the array
package ARRAYS;

import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int k=0;
        
        for(int i=0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        int largest=arr[0];
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
         
       }
       System.out.println("The largest element in array is "+largest);
        


        
    }
}

