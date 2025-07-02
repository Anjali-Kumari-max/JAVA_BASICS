// problem Statement: Given an integer N, return the number of digits in N.
package method.funcion;

import java.util.Scanner;

public class count {
    static int countnum(int a){
        int count=0;
        while(a!=0){
           
            a=a/10;
            ++count;
            
        }
        System.out.println("no. of digits are "+count );
         return count;
        

    }
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        countnum(a);
        
    }
}
