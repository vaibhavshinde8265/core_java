package Arrays_intro;

import java.util.Arrays;

public class Arrays1 {

	
	public static void main(String[] args) {
		// array write in java
		
		String[] name=new String[5];
		name[0]="vaibhav";
		name[1]="suresh";
		int[] age= {667,78,9,6};
		int[] height=new int[] {6,7,8,9};
		
		// print memory identity
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		//print Arrays values
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(height));
		
		
	}
	
}
