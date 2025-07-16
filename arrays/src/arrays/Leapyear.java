package arrays;
import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		sc.nextLine();
		//my approach
//	if(year%4==0||year%100!=0&&year%400==0) {
//			System.out.println("leap year");
//	}
//	else {
//		System.out.println("not leap year");
//	}
		
		
		//udemy approach
		
		if(year%4==0) {
			
			if(year%100==0) {
				
				if(year%400==0) {
					System.out.println("leap year");
				}
				else
					System.out.println("not leap");
			}
			else
				System.out.println("not leap");
		}
		else {
			System.out.println("not leap");
		}
	}
}
					
				
			
			
		





