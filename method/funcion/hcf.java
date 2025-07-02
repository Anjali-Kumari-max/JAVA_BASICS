package method.funcion;

import java.util.Scanner;

public class hcf {
    static int hcmnum(int a, int b){
        int rev=1;
        if(a<=b){
            for(int i=1 ;i<=a; i++){
                if(a%i==0 && b%i==0){
                    rev=i;
                        
                    
                }
            }
            System.out.println(rev);

        }else{
                 if(b<a){
            for(int i=1 ;i<=b; i++){
                if(a%i==0 && b%i==0){
                    rev=i;

                        
                    }
                }
            }
            System.out.println(rev);
        }
        return rev;
        }

        
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        hcmnum(a,b);

    }
}
