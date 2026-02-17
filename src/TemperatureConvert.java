import java.util.Scanner;
public class TemperatureConvert {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the temperature in Celsius: ");
            int a = scan.nextInt();
            int b=(a*9/5)+32;
            System.out.print("Temperature in Fahrenheit:");
            System.out.println(b);
            System.out.print("Temperature in Celsius:");
            b=(b-32)*5/9;
            System.out.println(b);
        }
    }
