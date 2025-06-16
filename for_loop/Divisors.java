package for_loop;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n= scan.nextInt();


            for(int i= 1;i<=n ;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
