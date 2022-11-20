import java.util.Scanner;

class Demo3 {
	public static void main(String[] args) {

	/* 
	Dynamic read --> the process of reading the data from the user during the execution of program
	Steps to achieve dynamic read: 
	1) import java.util.Scanner
	2) create the object of scanner class [Scanner sc = new Scanner(System.in)]
	3) call the methods of scanner class based on values you are reading from the user

	VALUE			METHOD
	int				nextInt();
	byte			nextByte();
	short 			nextShort();
	long 			nextLong();
	float 			nextFloat();
	double			nextDouble();
	char			next().charAt(0);
	String			next(); nextLine();
	*/
	
	/*
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value ");
	String a = sc.nextLine();
	System.out.println("The entered value is "+a);
	*/

	/*
	Decision making statements helps the programmer to skip the block of instructions
	1) if		
	2) if else	 
	3) else if ladder
	4) nested if
	5) switch
	*/
	
	/*
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();

	if(num%2==0) {
		System.out.println("Even Number.");
	} else {
		System.out.println("Odd number.");
	}
	*/

	/*
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers ");
	int num1 = sc. nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();

	if(num1>num2 && num1>num3) {
		System.out.println("Num1 is greater" +num1);
	} else if(num2>num3) {
		System.out.println("Num2 is greater" +num2);
	} else {
		System.out.println("Num3 is greater" +num3);
	} 
	*/

	/*
	switch( value/expression/variable ) {
		case 1: 
		break;
		.
		.
		.
		default : ()
	}

	For Switch we cannot pass long,float,double & boolean values

	break; -> 
	* It is a keyword
	* It is a control transfer statement
	* Whenever the break statement is executed it comes outside the box
	* We can you break statement in switch and also in loops

	*/

	/*
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	int num = sc.nextInt();

	switch(num) {

		case 1: {
			System.out.println("Hi");
			break;
		}

		case 2: {
			System.out.println("Hello");
			break;
		}
		

		default: {
			System.out.println("Bye");
		}
	}
	*/

	/*
	// Read the character from the user using switch print wheter it is vowel or consonant
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the character in lowercase");
	char ch = sc.next().charAt(0);

	switch(ch) {

		case 'a': {
			System.out.println("It is an vowel");
			break;
		}
		case 'e': {
			System.out.println("It is an vowel");
			break;
		}
		case 'i': {
			System.out.println("It is an vowel");
			break;
		}
		case 'o': {
			System.out.println("It is an vowel");
			break;
		}
		case 'u': {
			System.out.println("It is an vowel");
			break;
		}

		// grouping alternate method
		case a:
		case e:
		case i:
		case o:
		case u: {
			System.out.println("vowel");
			break;
		}

		default : {
			System.out.println("It is an consonant");
			break;
		}
	}
	*/

	/*
	// read integers from user, and read char from user +,-,/,* perform calculation 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	System.out.println("Enter operator");
	char ch = sc.next().charAt(0);

	switch(ch) {

		case '+': {
			System.out.println(num1+num2);
			break;
		}
		case '-': {
			System.out.println(num1-num2);
			break;
		}
		case '/': {
			System.out.println(num1/num2);
			break;
		}
		case '*': {
			System.out.println(num1*num2);
			break;
		}

		default : {
			System.out.println("Unable to perform operation");
		}
	}
	*/

	/* Types of loops 
	1) While loop -> while(condition) { }
	2) For loop
	3) do-While loop
	4) for-each loop
	5) nested loop

	Three things in loops
	* initialization
	* condition
	* updation
	*/

	/*
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();

	while(num>0) {
		System.out.println("rehaman");
		num--;
	}
	*/

	/*
	// take range from the user and print even numbers between them
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two numbers for range");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	System.out.println("The numbers are");

	while(num1<=num2) {
		
		if(num1%2==0) {
			System.out.println(num1);
		}
		num1++;
	}
	*/

	/* 
	do{
		.....
		.....
	} while(condition);
	*/

	/*
	// by using do while print alphabets
	char ch = 'a';
	do {
		System.out.print(ch);
		ch++;
	} while(ch<='z');
	*/

	/* for-loop
	for(initialization; condition; updation)
	*/
	/*
	// factors of the number given by the user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();

	System.out.println("The factors are:");
	for(int i=1; i<num; i++) {
		if(num%i == 0) {
			System.out.println(i);
		}
	}
	*/

	/*
	// factorial
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
	int fact = 1;
	
	while(num!=0) {
		fact *= num;
		num--;
	}
	System.out.println("The factorial is:" +fact);
	*/

	
}
}













