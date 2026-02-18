import java.util.Scanner;
public class PositiveNegative {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int a = scan.nextInt();
            if(a>0){
                System.out.println("The number is Positive");
            }
            else if(a<0) {
                System.out.println("The number is Negative");
            }
            else{
                System.out.println("The number is Zero");
            }
        }
    }
