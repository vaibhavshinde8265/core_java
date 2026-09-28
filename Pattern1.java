package pattern;

public class Pattern1 {
	public static void main(String[] args) {
		//int n=4;
		for(int row=1;row<=4;row++) {//row<=n
			for(int col=1;col<=4-row+1;col++) { //col<=n-row+1    
				System.out.print("* ");
			}
			System.out.println();
		}
			
	}

}
