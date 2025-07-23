package arrays;

import java.util.*;
public class A{

    public static void main(String[] args) {
//    	int creditScore;
//    	boolean  employmentVerified;
//    	int debtToIncome;
//    	int loanType;
//    	int HOME_LOAN;
//    	boolean collateralProvided;
//    	int approveLoan;
    	int accountbalance;
    	int goldloan=100000;
    	int fd=1000000;
    	int saveaccountbalance=10000000;
    
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
            case 1: System.out.println("savings account");
             accountbalance=10000;
             System.out.println(accountbalance);
            break;
            case 2: System.out.println("gold loan account"); 
            System.out.println("goldloan "+goldloan);
            break;
            case 3: System.out.println("current account");
            System.out.println("saveaccountbalance "+saveaccountbalance);
            break;
            case 4: System.out.println("fd");
            System.out.println("fd "+fd);
            break;
            default: System.out.println("enter valid input");
        }
//        if (creditScore >= 650) {
//            if (employmentVerified) {
//                if (debtToIncome < 0.4) {
//                    if (loanType == HOME_LOAN && collateralProvided) {
//                    	approveLoan();
//                    } else if (loanType != HOME_LOAN) {
//                        approveLoan();
//                    }
//                }
//            }
//        }

        sc.close();
    }
}

