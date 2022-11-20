// Strong number -> n=145 -> 5! = 120, 4! = 24, 1! = 1 -> 120+24+1 = 145 
import java.util.Scanner;

class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int sum =0;
        
        while(temp!=0) {
            int rem = temp%10;
            int fact = 1;

            for(int i=1; i<=rem; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }

        if(sum==n) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not Strong number");
        }
    }
}
