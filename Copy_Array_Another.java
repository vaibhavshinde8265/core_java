package Arrays;

public class Copy_Array_Another {
	public static void main(String[] args) {
		
//		Copy one array into another array
		
		int arr1[]= {20,30,40,50,60,70,80};
		int arr2[]=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
