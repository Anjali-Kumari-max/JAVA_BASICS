import java.util.Scanner;

public class qus16 {
        public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n= scan.nextInt();
       int k= scan.nextInt();
        for(int i=1;i<=n; i++){
            // int k=scan.nextInt();
            for(int j=1;j<=i ; j++){
                if(i==1){
                    System.out.print("A");
                }else if(i==2){
                    System.out.print("B");
                }else if(i==3){
                    System.out.print("C");
                }else if(i==4){
                    System.out.print("D");
                }else{
                     if(i==5)
                    System.out.print("E");
                }

                
            } 
            System.out.println();
        } 

    }
}
