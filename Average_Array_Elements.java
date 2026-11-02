package Arrays;



public class Average_Array_Elements {
	public static void main(String[] args) {
		int[] arr= {45,67,89,90,78};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		  System.out.println("Average = " + sum / arr.length);
	}

}
