package practice;

public class ProductOfOddDigit {
	public static void main(String[] args) {
		int n=1234;
		int prod=1;
		while(n>0) {
			int digit= n%10;
			if(digit%2==0) {
			prod=prod*digit;
			}
			n=n/10;
			
		}
		System.out.println(prod);
	}

}
