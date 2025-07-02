package method.funcion;

import java.util.Scanner;

public class divisor {
    static int divisor(int a){
        System.out.print("[");
        for(int i=1 ;i<=(a-1) ;i++){
            if(a%i==0){
                System.out.print(i +",");
                
                }
            }
            System.out.print(a+"]");
             
            
        return a-1;
        }
        
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        divisor(a);
    }
}

