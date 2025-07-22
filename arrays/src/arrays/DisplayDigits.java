package arrays;
import java.util.*;
public class DisplayDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int rem=0;
		int div=0;
		int rev=0;
		int count=0;
		while(n>0) {
			rem=n%10;
			 n=n/10;
			 count=n;
			 count++;
			 
			System.out.println(rem);
		}
		System.out.println(n);

	}

}
