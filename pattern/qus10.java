import java.util.Scanner;

public class qus10 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n= scan.nextInt();
       int k= scan.nextInt();
        for(int i=1;i<=n; i++){
            // int k=scan.nextInt();
            for(int j=1;j<=k ; j++){
                if(i>=j){
                System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        } 
          for(int i=n-1;i>=1; i--){
            // int k=scan.nextInt();
            for(int j=1;j<=k ; j++){
                if(i>=j){
                System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        } 
        
    }
}
