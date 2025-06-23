import java.util.Scanner;

public class qus11 {
        public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=1;
        for(int i=1;i<=n; i++){
            
          for(int j=1;j<=i;j++){
           if((i+j)%2==0){
            System.out.print("1");

           }else{
            System.out.print("0");
           }

           
            
            
          }
          
          System.out.println();

          
    }
}
}
