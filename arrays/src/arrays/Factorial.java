package arrays;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    long fact=1;
    int n=5;
    for(int i=1;i<=n;i++) {
    	fact=fact*i;
    	//System.out.println("fact is"+fact);
    }
    System.out.println("fact is"+fact);
	}

}
