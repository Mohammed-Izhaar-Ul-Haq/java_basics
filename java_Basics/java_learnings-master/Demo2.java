class Demo2 {
	public static void main(String[] dadu) {
	/* widening
	int a = 10;
	double b = a; 
	System.out.println(b); */

	/* narrowing 
	double m = 10.031;
	int c = (int)m;
	System.out.println(c); */
	
	/*
	float f = 84.342f; //error: incompatible types --> throws an error if we don't include 'f' at the end
	long w = 939344444444484943l; //error: integer number too large
	System.out.println(w); */

	/*
	boolean b1 = true;
	boolean b2 = false;
	boolean b3 =(b1 == b2); // t & f == f
	
	System.out.println("b1 is " +b1);
	System.out.println("b2 is " +b2);
	System.out.println("b3 true == false is  " +b3); 

	int a=10, b=20;
	
	boolean bool= a==b;
	System.out.println(bool); */
	
	/* comparing 
	int c = 34;
	int d = 54;
	int m = c<d ? c : d;
	
	System.out.println(m); */
	
	/*
	int a = 12; 
	int b = 45;
	int c = 34;
	

	// 	condition statement1  statement2
	int ans = a>b? (a>c?a:c) : (b>c?b:c);

	System.out.println(ans); */


	/*int a=45, b=67, c=12, d=90;

	int ans = a>b? (a>c?(a>d? a:d):(c>d?c:d)) : (b>c?(b>d? b:d):(c>d?c:d));
	System.out.println(ans);*/

	/* int a=45, b=67, c=78, d=9, e=23;

	int ans = a>b? (a>c? (a>d? (a>e? a:e):(d>e? d:e)):(c>d? (c>e? c:e):(d>e? d:e))) : (b>c? (b>d? (b>e? b:e):(d>e? d:e)):(c>d? (c>e? c:e):(d>e? d:e)));
	System.out.println(ans); */

	// logical operators
	/*
	int a=23, b=34;
	boolean bool = a==b && a>b; --> and
	boolean bool = a!=b || a>b; --> or
	boolean bool = !(a==b || a>b); --> not
	System.out.println(bool);*/
	
	/* Post increment and Pre increment
	int a=10, b=15;
	int c = a++ + ++b + b++ + ++a + b++ + ++b + ++a + a++;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c); */

	/* Post decrement and Pre decrement */
	int a=10, b=15;
	int c = a-- + --b + b-- + --a + b-- + --b + --a + a--;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
}
}