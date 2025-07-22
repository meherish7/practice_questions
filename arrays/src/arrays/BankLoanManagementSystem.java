package arrays;
import java.util.*;
public class BankLoanManagementSystem {

	public static void main(String[] args) {
	   // int account=sc.nextInt();
		Scanner sc=new Scanner(System.in);
		int account=sc.nextInt();
		sc.nextLine();
		System.out.println("enter user name");
		String enteredun=sc.nextLine();
		//System.out.println("enter pass");
		String storedun="sai";
		System.out.println("enter pass");
		String enteredpass=sc.nextLine();
		String storedpass="laddu";
		if(enteredun.equals(storedun)&&enteredpass.equals(storedpass)) {
			System.out.println("entered password valid login successful");
		}
		else {
			System.out.println("please re enter valid pass and username");
		}
		
		
	switch(account) {
	case 1:System.out.println("savings account");
	break;
	case 2:System.out.println("gold loan account");
	break;
	case 3:System.out.println("current account");
	break;
	case 4:System.out.println("fd");
	break;
	default:System.out.println("enter valid input");
		
		
	}
	sc.close();

	}

}
