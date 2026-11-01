package Arrays_intro;

public class Largest_Element_Array {
	
	public static void main(String[] args) {
		int[] arr = {30,40,50,60,70,80,90};
		int largest= arr[0];
		for(int i=1;i< arr.length;i++) {
			if(arr[i] > largest) {
				largest=arr[i];
				
				
			}
		}
		System.out.println(largest);

}
}