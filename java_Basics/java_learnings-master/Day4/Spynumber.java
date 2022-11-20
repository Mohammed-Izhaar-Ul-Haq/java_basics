// WAP to find the spynumber
import java.util.Scanner;

class Spynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        checkNumber(n);
    }

    public static void checkNumber(int n) {
        int sum = 0;
        int product = 1;
        while(n>0) {
            int lastdigit = n%10; // to find last digit
            sum = sum + lastdigit;
            product = product * lastdigit;
            n = n/10; // to discard the remaining single digit
        }
        if(sum == product) {
            System.out.println("spynumber");
        } else {
            System.out.println("not spynumber");
        }
    }
}
