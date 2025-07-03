package arrays;

public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("smallest element in array :");
		int[ ] num= {20,97,9,76,79};
		int smallest=num[0];
		for(int i=0; i<num.length; i++) {
			if (num[i]<smallest) {
				smallest=num[i];
				
			}
		
		
		}
		System.out.println("smallest is"+smallest);

	}

}
