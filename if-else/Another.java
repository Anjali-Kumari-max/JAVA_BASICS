import java.util.Scanner;

public class Another {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int n=scan.nextInt();
    if(n<18){
        System.out.println("Minor");

    }
    if(n>=18 && n<60){
        System.out.println("Adult");
    }
    if(n>=60){
        System.out.println("adult citizen");
    }
    }
}
