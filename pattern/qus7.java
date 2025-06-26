// *********
//  ******* 
//   ***** 
//    ***  
//     *   
import java.util.Scanner;

public class qus7 {
           public static void main(String[] args) {
    //   nt n= scan.nextInt();
            int n= 3;
    //    int k=  Scanner scan=new Scanner(System.in);
    //    iscan.nextInt();                  
        for(int i=n;i>=1; i--){
            // int k=scan.nextInt();
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
           
            for (int k =1 ; k<=(2*i-1) ; k++){
                System.out.print(" * ");
            }
            System.out.println();
        } 

    }
}
