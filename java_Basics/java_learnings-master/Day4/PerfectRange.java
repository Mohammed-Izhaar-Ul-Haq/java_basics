// WAP to find the given number in range is perfect number or not
import java.util.Scanner;

class PerfectRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end range");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String result = perfectNum(n1,n2);
        System.out.println(result);
    }

    public static String perfectNum(int n1, int n2) {
        for(int i=n1; i<=n2; i++) {
            int sum=0;
            for(int j=1; j<i; j++) {
                if(i%j == 0) {
                    sum += j;
                }
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
        return "done";
    }

}        