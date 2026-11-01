package Arrays_intro;

public class Sum_Array_Elem {
	
	public static void main(String[] args) {
		int[] arr = {20,45,67,89,90,43};
		int sum=0;
	
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			arr[i]++;
		}
		System.out.println(sum);
	}

}
