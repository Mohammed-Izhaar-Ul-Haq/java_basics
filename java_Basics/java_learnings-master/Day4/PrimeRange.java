// prime numbers in the range
import java.util.Scanner;

class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end range");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(primeNum(n1, n2));
    }

    public static int primeNum(int n1, int n2) {
        for(int i=n1; i<=n2; i++) {
            int count = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.println(i);
            }
        }
        return 1; 
    }
}