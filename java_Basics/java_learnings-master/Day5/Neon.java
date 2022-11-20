// Neon Number -> n=9 -> sqrt= 81 -> 8+1=9 -> It is a neon number
import java.util.Scanner;

class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sqrt = n * n;
        int sum = 0;

        while(sqrt!=0) {
            int rem = sqrt%10;
            sum += rem;
            sqrt /= 10;
        }

        if(sum==n) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not Neon number");
        }
    }
} 