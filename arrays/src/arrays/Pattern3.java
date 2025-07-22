package arrays;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
        for(int i=0;i<=5;i++) {
        	for(int j=1;j<=i;j++) {
        		++count;
        		System.out.print("*");
        		//System.out.print("* ");//to print stars in pyramid
        	}
        	System.out.println(" ");
        }
	}

}

