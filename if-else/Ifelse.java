import java.util.Scanner;

class Ifelse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create Scanner object
        int num = scan.nextInt();              // Read integer input

        if (num > 0) {
            System.out.println("positive");
        }

        if (num == 0) {
            System.out.println("zero");
        }

        if (num < 0) {
            System.out.println("negative");
        }

        scan.close(); // Good practice to close the Scanner
    }
}