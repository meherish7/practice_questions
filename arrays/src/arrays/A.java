package arrays;

import java.util.*;
public class A{

    public static void main(String[] args) {
    	int creditScore;
    	boolean  employmentVerified;
    	int debtToIncome;
    	int loanType;
    	int HOME_LOAN;
    	boolean collateralProvided;
    	int approveLoan;
        Scanner sc = new Scanner(System.in);
       // int account = sc.nextInt();
        // sc.nextLine(); // Consume leftover newline
        System.out.println("enter user name");
        String enteredun = sc.nextLine();
        String storedun = "sai";
        System.out.println("enter pass");
        String enteredpass = sc.nextLine();
        String storedpass = "laddu";
        if (enteredun.equals(storedun) && enteredpass.equals(storedpass)) {
            System.out.println("entered password valid login successful");
        } else {
            System.out.println("please re enter valid pass and username");
        }
        //sc.nextLine();
        System.out.println("enter account type(1:savings, 2:gold,3:current,4:fd)");
        int account = sc.nextInt();
        switch (account) {
            case 1: System.out.println("savings account"); break;
            case 2: System.out.println("gold loan account"); break;
            case 3: System.out.println("current account"); break;
            case 4: System.out.println("fd"); break;
            default: System.out.println("enter valid input");
        }
        if (creditScore >= 650) {
            if (employmentVerified) {
                if (debtToIncome < 0.4) {
                    if (loanType == HOME_LOAN && collateralProvided) {
                    	approveLoan();
                    } else if (loanType != HOME_LOAN) {
                        approveLoan();
                    }
                }
            }
        }

        sc.close();
    }
}

