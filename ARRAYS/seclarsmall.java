package ARRAYS;

//  Given an array, find the second smallest and second largest element in the array. 
// Print ‘-1’ in the event that either of them doesn’t exist.

import java.util.Scanner;



public class seclarsmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // size of an array
        int size=sc.nextInt();
        int[] nums=new int[size];
        //taking input in an array 
        for(int i=0 ; i<nums.length ; i++){
            nums[i]=sc.nextInt();
        }
        if( size<2){
            System.out.println("-1");
            return;
        }
        int largest= nums[0];
        for(int i=0; i<nums.length; i++){
            if(largest<nums[i]){
                largest=nums[i];
            }
        }
        int seclar=-2;
        for (int i=0; i<nums.length ; i++){
            if(seclar<nums[i] && nums[i]!=largest){
                seclar=nums[i];
                
            }
        }
            
        System.out.println(seclar);

        

    }
}
