import java.util.Scanner;
public class LeapYear {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the year: ");
            int year = scan.nextInt();
            if(year%400==0){
                System.out.println("Its an LeapYear");
            }
            else if(year%100==0){
                System.out.println("Its not an LeapYear");
            }
            else if(year%4==0){
                System.out.println("Its an LeapYear");
            }
            else{
                System.out.println("Its not an LeapYear");
            }
        }
    }