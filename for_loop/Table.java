package for_loop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1 ; i<13 ; i++){
            System.out.println(n +" * " +i +" = " +n*i);
        }
    }
    
}
