package arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7,count=0;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
     if(count==1) {
    	 System.out.println("prime");
     }
     else {
    	 System.out.println("not prime");
     }
    	 
	}

}
