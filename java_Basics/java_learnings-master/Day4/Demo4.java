import java.util.Scanner;

/* Methods ->
        * The block of instructions used to perform a specific task
        * It is used to transfer data

        How to define a method
        [access modifier] [modifier] returnType methodName([formal arguments])

        Method Definition ->
        It consists of method declaration and method body

        Method Declaration ->
        It consits of access modifier, modifier, returnType, and method signature

        Method Signature ->
        It consists of methodName, and  formal arguments

        -> Access Modifier
        It is used to change the accessibillity of the method

        There are 4 types of access modifiers in java
        1) private 
        2) public
        3) protected
        4) default

        -> Modifiers
        They are used to change the behaviour of the method
        1) static
        2) non-static

        -> returnType
        It is the type of data type which is returned by the method
        Tpes of return:-
        1) void
        2) primitive data types
        3) non-primitive data types

        void ->
        It is a keyword which is used as a return type when the method is not returning anything
        
        return statement ->
        * return is a keyword, it is a control transfer statement 
        * Whenever the return type of method is primitive data type or non-primitive data type that method should return something after the execution
        * The return statement should return the value twhich is same as returnType of the method
    
        Advantage of method ->
        Code reusability

        Method call statement ->
        The statement which is used to call the method 

        Calling methods ->
        The method which is used to call other method

        Called method ->
        The method which is called by other method

        Flow of execution ->
        * Execution of main method starts
        * It will call the other method
        * Execution of main method stops and the control goes to called method
        * Execution of called method start
        * After completing the execution the control id given back to the caller
        * Execution of the caller method starts
        * Completes the execution

        Types of methods ->
        1) No argument method
        2) Parameterized method

        No argument method ->
        The method which has zero formal arguemnts
        Ex: public static void m1() {
            ....
        }

        Parametereized method ->
        The method which has one or more formal arguments
        Ex: public static void para(int a) {
            .....
        }

        formal arguments ->
        The arguments which are passed in method declaration

        actual arguments ->
        The arguments which are passed in method call statements
*/

class Demo4 {
    // WAP to check the given number is palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println
        int n = sc.nextInt();
        int result = reverse(n);
    }
    
    
    public static int reverse(int a) {
        int rev = 0;
        while(a!=0) {
            int x =a%10;
            rev=(rev*10)+x;
            a /= 10;
        }
        return rev;
    }

    public static string checkPalindrome(int a, int b) {
        if(a==b) {
            return "Palindrome";
            else {
                return "Not an palindrome";
            }
        }
    }
}