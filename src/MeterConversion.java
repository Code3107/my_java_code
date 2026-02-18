import java.util.Scanner;
public class MeterConversion {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Kilometer: ");
            int a=scan.nextInt();
            a=a*1000;
            System.out.println("In Meter: "+a);
            a=a/1000;
            System.out.println("In Kilometer: "+a);
        }
    }