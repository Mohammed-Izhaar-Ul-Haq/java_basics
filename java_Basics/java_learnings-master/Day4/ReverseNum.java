import java.util.Scanner;

class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println("Reversed number " +result);
    }
    public static int reverse(int a) {
        int rev =0;
        while(a!=0) {
            int x = a%10;
            rev = (rev*10)+x;
            a /= 10;
        }
        return rev;
    }
}
