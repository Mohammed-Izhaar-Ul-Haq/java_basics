// Xylem Numer -> n = 1234 ->   1+4=5 , 2+3=5 -> first and last sum is equal to the sum of middle numbers
import java.util.Scanner;

class Xylem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum1=0, sum2=0;
        int count1=0, count2=0;
        int temp=n;

        while(temp!=0) {
            count1++;
            temp /=10;
        }
        while(n!=0) {
            count2++;
            int rem = n%10;
            if(count2==1 || count1==count2) {
                sum1+=rem;
            } else {
                sum2+=rem;
            }
            n/=10;
        }

        if(sum1==sum2) {
            System.out.println("It is a xylem number");
        } else {
            System.out.println("It is not an xylem number");
        }
    }
}
