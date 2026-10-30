package Operator;

public class Arithmatic {
	public static void main(String[] args) {
		//arithmatic operator
		//binary
		int a=20;
		int b=10;
		System.out.println("add :"+(a+b));
		System.out.println("sub :"+(a-b));
		System.out.println("mul :"+(a*b));
		System.out.println("div :"+(a/b));
		System.out.println("module :"+(a%b));
		
		
		//unary operator
		int c=a++;//use first and then change then
		System.out.println(a);
		System.out.println(c);
		
		
		int d=++b;//change first and then use
		System.out.println(b);
		System.out.println(d);
	}

}
