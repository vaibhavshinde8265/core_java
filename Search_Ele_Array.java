package Arrays;

import java.util.Scanner;

public class Search_Ele_Array {

	// search element using array
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50,60,70,80};
		System.out.println("Enter Search Element :");
		int search=sc.nextInt();
		boolean found= false;
		for(int i=0;i<arr.length;i++) {
			
			if(search==arr[i]) {
				System.out.println("your search element :"+search);
				found =true;
				break;
			}
			
		}
			
		if(!found){
			System.out.println("Element Not Found");
			}
	
	

}}
