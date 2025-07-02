// Check if the Number is Armstrong
package method;

import java.util.Scanner;

public class armstrong {
    static int armstrongnum(int a){
        int q=a;
        int k=a;
        int sum=0;
        int count=0;
        while(a!=0){
            a/=10;
            ++count;
            
        }
        
        while (q!=0) {
              int digit = q % 10;
            sum+=( Math.pow(digit,count ));
            q/=10;
            
            
        }
        
        if (sum==k){
            System.out.println("True");
        }else{
            System.out.println("False");
       
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        armstrongnum(a);
    }
}
