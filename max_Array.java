package Arrays;

public class max_Array {
	
	
	// maximum number using array
	
	public static void main(String[] args) {
		int arr[]= {-23,-456,-78,-99,-56,-444,-456,-777};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>i) {
				max=arr[i];
				
			}
		}
		System.out.println(max);
	}

}
