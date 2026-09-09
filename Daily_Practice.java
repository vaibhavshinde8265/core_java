package practice;

import java.util.Scanner;

public class Daily_Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if((num%4==0) || (num%400==0 && num %100!=0)){
			System.out.println("leap year");
			
			
		}else {
			System.out.println("not leap year");
		}
		
		
}}