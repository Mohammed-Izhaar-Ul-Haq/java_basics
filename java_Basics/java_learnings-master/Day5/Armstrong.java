// Armstrong Number -> n=153 -> 3= 3*3*3 - 27, 5=5*5*5 -125, 1=1*1*1 -1
import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // int count = 0;
        int sum = 0;
        int rem;
        int temp=n;

        while(n!=0) {
            rem = n%10;
            sum += rem*rem*rem;
            // rem = Math.pow(rem, count); 
            // count++;
            n /= 10;
        }
        
        if(temp==sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
// xylem and phloem number