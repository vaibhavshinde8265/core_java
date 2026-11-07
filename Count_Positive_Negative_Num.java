package Arrays;

public class Count_Positive_Negative_Num {
	
//	Count positive and negative numbers
	
	public static void main(String[] args) {
		int arr[] = {2,3,-4,-6,8,9,90};
		int positive=0;
		int neagative=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>0) {
				positive++;
		}
			if(arr[i]<0) {
				neagative++;
			}
			
			}
		
		System.out.println("positive number :"+positive );
		System.out.println("negative numbers :"+neagative);

	}

}
