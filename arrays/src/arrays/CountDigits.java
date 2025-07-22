package arrays;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
	    int n =2359;
	    while(n>0) {
	    	n=n/10;
	    	count++;
	    	//System.out.println(count);
	    }
	    System.out.println(count);

	}

}
