import java.util.Scanner;

public class qus15 {
        public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n= scan.nextInt();
       int k= scan.nextInt();
        for(int i=n;i>=1; i--){
            // int k=scan.nextInt();
            for(int j=1;j<=i ; j++){
                if(j==1){
                    System.out.print("A");
                }else if(j==2){
                    System.out.print("B");
                }else if(j==3){
                    System.out.print("C");
                }else if(j==4){
                    System.out.print("D");
                }else{
                     if(j==5)
                    System.out.print("E");
                }

                
            } 
            System.out.println();
        } 

    }
}
