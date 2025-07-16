package arrays;
import java.util.*;

public class PracticeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("menu");
		System.out.println("-----");
		System.out.println("add");
		System.out.println("sub");
		System.out.println("mul");
		System.out.println("div");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.nextLine();
		System.out.println("enter option");
		String option=sc.nextLine();
		
		switch(option) {
		case "add":
			System.out.println("sum"+(a+b));
			break;
		case "sub":
			System.out.println("sub"+(a-b));
		case "mul":
			System.out.println("mul"+(a*b));
		case "div":
			System.out.println("div"+(a/b));
			
		}

		

	}

}
