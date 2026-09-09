package practice;


import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num1 : ");
		int num1=sc.nextInt();
		System.out.println("enter a num2 : ");
		int num2=sc.nextInt();
		int tem= num1;
		num1=num2;
		num2=tem;
		System.out.println(num1);
		System.out.println(num2);
	}

}
