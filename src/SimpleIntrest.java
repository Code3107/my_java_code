import java.util.Scanner;
public class SimpleIntrest {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Principal amount: ");
            int pa = scan.nextInt();
            System.out.println("Enter the Rate of interest: ");
            int r = scan.nextInt();
            System.out.println("Enter the Time period: ");
            int t = scan.nextInt();
            int si=(pa*r*t)/100;
            System.out.println("The SimpleInterest is "+si);
        }
    }