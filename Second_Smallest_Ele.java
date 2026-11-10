package Arrays;



//Find the second-smallest element
public class Second_Smallest_Ele {
	public static void main(String[] args) {
		int arr[]= {78,89,45,65,47,52};
		int second=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			smallest=second;
			second=arr[i];
			
			if(second<arr[i]) {
				smallest=second;
			}
				
			}
		System.out.println(smallest);
		}
		
	}


