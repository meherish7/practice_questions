package arrays;
import java.util.*;
public class Palindromee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int m=n;
		int r;
		int rem=0;
		int rev=0;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
			
			
		}
		System.out.println(rev);
       if(rev==m) {
    	   System.out.println("palindrome");
       }else {
    	   System.out.println("not palindrome");
       }
	}

}
