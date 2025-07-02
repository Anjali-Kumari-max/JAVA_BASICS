package method.funcion;

import java.util.Scanner;

public class prime {
    static void primenum(int a){
        boolean isprime=true;
        if( a<=1){
            isprime=false;
        }else{
            for(int i = 2;i<=(a-1); i++){
                if(a%i==0){
                    isprime=false;
                    break;
                }
            }
        }if(isprime){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }

    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        primenum(a);
    }
}
