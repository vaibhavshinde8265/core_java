package Arrays;


//Count even and odd numbers
public class Count_E_O_Array {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8,9,10};
		
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				even++;
				
			}else {
				odd++;
			}
		}
		System.out.println("count even number :"+even);
		System.out.println("count odd nnumber :"+odd);
	}

}
