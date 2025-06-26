import java.util.Scanner;

public class qus9 {
     public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n= scan.nextInt();
    //    int k= scan.nextInt();
        for(int i=1;i<=n; i++){
            // int k=scan.nextInt();
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            } 
            for (int k =1 ; k<=(2*i-1) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=n;i>=1; i--){
            // int k=scan.nextInt();
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            } 
            for (int k =1 ; k<=(2*i-1) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }  

    }
}
