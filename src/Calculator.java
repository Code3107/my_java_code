import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the two number: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
        }
    }
