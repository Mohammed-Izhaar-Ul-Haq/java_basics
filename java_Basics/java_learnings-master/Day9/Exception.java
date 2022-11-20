public class Exception {
    public static void mian(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
            System.out.println(a/b); // gives exception
            String s = null;
            System.out.println(s.charAt(0));
        }
        catch(ArithmeticException e) { // e is an variable it can be given anything
            System.out.println("Exception Handled");
            e.printStackTrace(); // gives the trace of on exception
        }
        catch(NullPointerException e) {
            System.out.println("Null Pointer Exception Handled");
        }
       System.out.println("hi");
    }
}
