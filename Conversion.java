package basic_java;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//type conversion int to float
		//byte>short>int>float>long>double
//		float num=sc.nextInt();
//		System.out.println(num);
		//type casting
//		float a=45.56f;
//		int b=(int)a;
//		System.out.println(b);
//		char ch='A';
//		int number=ch;
//		System.out.println(number);
		//type promotion use only expretions (+,-,*,/)
		char a='a';
		char b='b';
		int c=a-b;
		System.out.println((int)a);
		System.out.println((int)b);
		System.out.println(c);
		
		System.out.println(b-a);
		
		
		
	}
	
}
