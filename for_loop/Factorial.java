package for_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int ans= 1;
        for(int i = n ; i>0 ; i-- ){
            ans=ans*i;
            if(i==1){
                System.out.print( i );
                break;

            }

            System.out.print(i+"*");

        }
        System.out.println();
        System.out.println(ans);
    }
}
