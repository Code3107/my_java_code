import java.util.Scanner;
public class BiggestAmongThree {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the three number: ");
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            if((a>b)&&(a>c)){
                System.out.println(a +" is the Biggest");
            }
            else if((b>a)&&(b>c)){
                System.out.println(b +" is the Biggest");
            }
            else if(c>a){
                System.out.println(c +" is the Biggest");
            }
            else{
                System.out.println("Either all are equal or the input is wrong.");
            }
        }
    }
