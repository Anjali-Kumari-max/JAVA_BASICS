 package switch_case;

import java.util.Scanner;

public class Weekdays {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String weekdays=scan.nextLine();
        switch (weekdays) {
            case "monday":
            System.out.println("upma");

                
                break;
            case "tuesday":
            System.out.println("sambar");
               break;
            case "wednesday":
            System.out.println("idli");
               break;
            case "thursday":
            System.out.println("chicken");
               break;
            case "friday":
            System.out.println("kabab");
               break;
            case "saturday":
            System.out.println("hassena dilruba");
               break;
            case "sunday":
            System.out.println("panner");
               break;
                           
            default:
                break;
        }
    }
 }
