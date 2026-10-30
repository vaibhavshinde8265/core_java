package practice;

import java.util.Scanner;

public class PrimeNumber {
	//public int prime(int n)
	public void prime(){
		Scanner sc=new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		//return n;
	}
	public static void main(String[] args) {
		PrimeNumber p=new PrimeNumber();
		p.prime();
	}

}
