package for_loop;

import java.util.Scanner;

public class Even_numbers {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();

        if (n%2==0){
            System.out.println("Even :" +n);
        }
        if (n%2!=0){
            System.out.println("Odd :" +n);
        }
        if(n>0){
            System.out.println("Positive :" +n);

        }
        if(n<0){
            System.out.println("negative :" +n);
        }
    }
    
}
