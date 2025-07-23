package arrays;

public class Pallli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=176;
    int r=0;
    int m=n;
    int rev=0;
    
    while(n>0) {
    	r=n%10;
    	rev=rev*10+r;
    	n=n/10;
    	System.out.println(rev);
    }
    System.out.println(rev);
    
//    if(m==rev) {
//    	System.out.println("palindrome");
//    }
//    else {
//    	System.out.println("not palindrome");
//    }
//	}

}
}
