import java.util.Scanner;

// WAP to find the given number is prime or not
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime");
        int n = sc.nextInt();
        String result = primeCheck(n);
        System.out.println(n+ " is" +result+ " number");
    }

    
    public static String primeCheck(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                count++;
            }
        }
        if(count==2) {
            return "prime";
        } else {
            return "not prime";
        }
    }
}

// spynumber