package arrays;
import java.util.*;
public class DoWithSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1:choclate");
			System.out.println("2:boondi");
			System.out.println("3:bhelpuri");
			System.out.println("4:onionbonda");
			System.out.println("5:exit");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1 ->System.out.println("1 choclate");
			case 2 ->System.out.println("2 boondi");
			case 3 ->System.out.println("3 bhelpuri");
			case 4 ->System.out.println("4:onionbonda");
			case 5 ->System.out.println("5:exit");
			default ->System.out.println("enter the corct choice");
			}
		}while(choice!=5);

	}

}
