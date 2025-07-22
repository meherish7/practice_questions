package arrays;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int r=0;
		int sum=0;
		//int m=n;
		int n=153;
		int m=n;
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
			
		}
		System.out.println(m);
		if(sum==m) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not");
		}
		

	}

}
