package method.funcion;

import java.util.Scanner;

public class palindrome {
        static int palindromenum(int a){
        int rev=0;
        int original=a;
        while(a!=0){
            int digit=a%10;
            rev=rev*10+digit;
            a/=10;

        }
        if(rev==original){
        System.out.println("palindrome");
        
    }
    else{
        System.out.println("not a palindrome");
    }
    return rev;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        palindromenum(a);


    }
}
