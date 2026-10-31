package Arrays_intro;

public class Second_Largest_Num {
	public static void main(String[] args) {
		
	
	
	int[] arr= {20,50,60,70,90,80,110};
	
	int second=Integer.MIN_VALUE;
	int largest=Integer.MIN_VALUE;
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i] > largest) {
			second = largest;
			largest = arr[i];
		}else if(arr[i] > second && arr[i] != largest){
			
			second =arr[i];
		}
		
	  }
	
		System.out.println("second largest :" +second);
	
	}	

}
