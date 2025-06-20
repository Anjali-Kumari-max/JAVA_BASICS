import java.util.Scanner;

public class qus {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n= scan.nextInt();
       int k= scan.nextInt();
        for(int i=1;i<=n; i++){
            // int k=scan.nextInt();
            for(int j=1;j<=k ; j++){
                if(i>=j){
                System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        } 

    }
}
