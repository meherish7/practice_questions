package arrays;

public class ReverseNumberrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=567;
        int rev=0;
        int r=0;
        int sum=0;
        
        while(n>0) {
        	r=n%10;
        	rev=rev*10+r;
        	n=n/10;
        	
        }
        System.out.println(rev);
	}

}
