// WAP to find the given number is perfect number or not
import java.util.Scanner;

class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String result = perfectNum(n);
        System.out.println(result);
    }

    public static String perfectNum(int n) {
        int sum=0;
        for(int i=1; i<n; i++) {
            if(n%i==0) {
                sum=sum+i;
            }
        }
        if(sum==n) {
            return "Perfect Number";
        } else {
            return "Not a perfect Number";
        }
    }

}        