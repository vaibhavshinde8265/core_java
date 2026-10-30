package practice;

import java.util.Scanner;

public class Factorial {
	//return type
	
	//public int fac(int n) 
	public void fac(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);
		//return fact;
	}
	public static void main(String[] args) {
		Factorial f=new Factorial();
	    f.fac();
	   
	}

}
