package arrays;



import java.util.Scanner;

public class Bank{

    // These would ideally be stored in files and managed by objects
    // For this simplified example, hardcoding a single user
    private static final String STORED_USERNAME = "john.doe";
    private static final String STORED_PASSWORD = "password123";
    private static final String STORED_FULL_NAME = "John Doe";
    private static final String STORED_ADDRESS = "123 Main St";
    private static final String STORED_PHONE = "555-1234";
    private static double STORED_ANNUAL_INCOME = 60000.0;

    // Account balances for the single hardcoded user
    private static double savingsAccountBalance = 1500.0; // Must be >= $100 [cite: 21]
    private static double currentAccountBalance = 500.0;
    private static double fdBalance = 10000.0; // Just an example, not explicitly in the docs
    private static double goldLoanAmount = 0.0; // Assuming this is a loan amount, not an account

    // Simplified loan data (would be much more complex with multiple loans and statuses)
    private static int userCreditScore = 700; // Example credit score
    private static boolean userEmploymentVerified = true;
    private static double userDebtToIncome = 0.35; // Example DTI [cite: 36]
    private static boolean collateralProvidedForHomeLoan = true; // Example

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        int loginAttempts = 0;
        final int MAX_LOGIN_ATTEMPTS = 3; 
        // --- User Login System --- [cite: 8]
        while (!loggedIn && loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.println("\n--- Bank Login ---");
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();
            System.out.print("Enter password (min 8 chars): "); 
            String enteredPassword = scanner.nextLine();

            // Basic password length check (more robust validation needed) [cite: 11]
            if (enteredPassword.length() < 8) {
                System.out.println("Password must be at least 8 characters long. Please try again.");
                loginAttempts++;
                continue; // Skip to next iteration
            }

            if (enteredUsername.equals(STORED_USERNAME) && enteredPassword.equals(STORED_PASSWORD)) { 
                System.out.println("Login successful! Welcome, " + STORED_FULL_NAME + ".");
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
                loginAttempts++;
                if (loginAttempts == MAX_LOGIN_ATTEMPTS) {
                    System.out.println("Too many failed attempts. Account temporarily locked."); 
                    // In a real system, you'd implement a timer or a flag to unlock
                    return; // Exit application
                }
            }
        }

        if (!loggedIn) {
            System.out.println("Exiting application.");
            return;
        }

        // --- Main Menu after successful login ---
        int choice = 0;
        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Account Management"); 
            System.out.println("2. Loan Processing System"); 
            System.out.println("3. View User Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Input validation for menu choice [cite: 60]
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
                continue; // Restart loop
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    handleAccountManagement(scanner);
                    break;
                case 2:
                    handleLoanProcessing(scanner);
                    break;
                case 3:
                    displayUserDetails();
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank Loan Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while(choice != 4);

        scanner.close();
    }
   

    // --- Account Management Sub-menu --- [cite: 19]
    private static void handleAccountManagement(Scanner scanner) {
        int accountChoice;
        do {
            System.out.println("\n--- Account Management ---");
            System.out.println("1. Savings Account (Balance: $" + String.format("%.2f", savingsAccountBalance) + ")");
            System.out.println("2. Current Account (Balance: $" + String.format("%.2f", currentAccountBalance) + ")"); 
            System.out.println("4. Withdraw Money"); 
            System.out.println("5. Check Balance"); 
            System.out.println("6. View Transaction History (Not implemented in this simplified version)"); 
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                accountChoice = 0; // Set to invalid to repeat loop
                continue;
            }
            accountChoice = scanner.nextInt();
            scanner.nextLine();

            switch (accountChoice) {
                case 1:
                    System.out.println("Savings Account selected. Balance: $" + String.format("%.2f", savingsAccountBalance)); 
                    break;
                case 2:
                    System.out.println("Current Account selected. Balance: $" + String.format("%.2f", currentAccountBalance)); 
                    break;
                case 3:
                    handleDeposit(scanner); 
                    break;
                case 4:
                    handleWithdrawal(scanner); 
                    break;
                case 5:
                    System.out.println("Savings Account Balance: $" + String.format("%.2f", savingsAccountBalance));
                    System.out.println("Current Account Balance: $" + String.format("%.2f", currentAccountBalance)); 
                    break;
                case 6:
                    System.out.println("Transaction history feature is not implemented in this simplified example."); 
                    break;
                case 7:
                    System.out.println("Returning to Main Menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (accountChoice != 7);
    }

    private static void handleDeposit(Scanner scanner) {
        System.out.print("Enter account type to deposit to (1: Savings, 2: Current): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter 1 or 2.");
            scanner.nextLine();
            return;
        }
        int accType = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter amount to deposit: $");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric amount.");
            scanner.nextLine();
            return;
        }
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        if (accType == 1) {
            savingsAccountBalance += amount;
            System.out.println("Successfully deposited $" + String.format("%.2f", amount) + " to Savings Account."); 
            System.out.println("New Savings Account balance: $" + String.format("%.2f", savingsAccountBalance));
        } else if (accType == 2) {
            currentAccountBalance += amount;
            System.out.println("Successfully deposited $" + String.format("%.2f", amount) + " to Current Account."); 
            System.out.println("New Current Account balance: $" + String.format("%.2f", currentAccountBalance));
        } else {
            System.out.println("Invalid account type selected.");
        }
    }

    private static void handleWithdrawal(Scanner scanner) {
        System.out.print("Enter account type to withdraw from (1: Savings, 2: Current): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter 1 or 2.");
            scanner.nextLine();
            return;
        }
        int accType = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter amount to withdraw: $");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric amount.");
            scanner.nextLine();
            return;
        }
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (accType == 1) {
            if (savingsAccountBalance - amount >= 100) { // Savings Account minimum balance $100 [cite: 21]
                savingsAccountBalance -= amount;
                System.out.println("Successfully withdrew $" + String.format("%.2f", amount) + " from Savings Account."); 
                System.out.println("New Savings Account balance: $" + String.format("%.2f", savingsAccountBalance));
            } else {
                System.out.println("Insufficient funds or withdrawal would go below minimum balance ($100) for Savings Account. Current: $" + String.format("%.2f", savingsAccountBalance)); 
            }
        } else if (accType == 2) {
            if (currentAccountBalance - amount >= 0) { // Current Account no minimum balance [cite: 22]
                currentAccountBalance -= amount;
                System.out.println("Successfully withdrew $" + String.format("%.2f", amount) + " from Current Account."); 
                System.out.println("New Current Account balance: $" + String.format("%.2f", currentAccountBalance));
            } else {
                System.out.println("Insufficient funds in Current Account. Current: $" + String.format("%.2f", currentAccountBalance)); 
            }
        } else {
            System.out.println("Invalid account type selected.");
        }
    }

    // --- Loan Processing System Sub-menu --- [cite: 28]
    private static void handleLoanProcessing(Scanner scanner) {
        int loanChoice;
        do {
            System.out.println("\n--- Loan Processing System ---");
            System.out.println("1. Apply for Personal Loan (Max: $50,000)"); 
            System.out.println("2. Apply for Home Loan (Max: $500,000)"); 
            System.out.println("3. Apply for Car Loan (Max: $100,000)"); 
            System.out.println("4. Track Loan Status (Not implemented in this simplified version)"); 
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                loanChoice = 0;
                continue;
            }
            loanChoice = scanner.nextInt();
            scanner.nextLine();

            switch (loanChoice) {
                case 1:
                    applyForLoan(scanner, "Personal Loan", 50000.0, false); 
                    break;
                case 2:
                    applyForLoan(scanner, "Home Loan", 500000.0, true); 
                    break;
                case 3:
                    applyForLoan(scanner, "Car Loan", 100000.0, true);
                    break;
                case 4:
                    System.out.println("Loan status tracking is not implemented in this simplified example."); 
                    break;
                case 5:
                    System.out.println("Returning to Main Menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (loanChoice != 5);
    }

    private static void applyForLoan(Scanner scanner, String loanType, double maxAmount, boolean requiresCollateral) {
        System.out.println("\n--- Apply for " + loanType + " ---");

        System.out.print("Enter desired loan amount: $");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric amount.");
            scanner.nextLine();
            return;
        }
        double requestedAmount = scanner.nextDouble();
        scanner.nextLine();

        if (requestedAmount <= 0 || requestedAmount > maxAmount) {
            System.out.println("Invalid loan amount. Must be positive and not exceed $" + String.format("%.2f", maxAmount) + " for " + loanType + ".");
            return;
        }

        // --- Simplified Loan Approval Logic --- [cite: 41]
        boolean loanApproved = false;
        String rejectionReason = "";

        // Credit Score Check [cite: 34]
        if (userCreditScore >= 650) { //[cite: 43]
            // Employment Verification Check [cite: 35]
            if (userEmploymentVerified) { //[cite: 44]
                // Debt-to-Income Ratio Check [cite: 36]
                if (userDebtToIncome < 0.4) { //[cite: 45]
                    // Collateral Check for Home/Car Loans [cite: 37]
                    if (requiresCollateral) {
                        if (collateralProvidedForHomeLoan) { // Assuming this flag covers both for simplicity
                            loanApproved = true; //[cite: 46, 47]
                        } else {
                            rejectionReason = "Collateral not provided for " + loanType + "."; 
                        }
                    } else { // No collateral required (e.g., Personal Loan)
                        loanApproved = true; //[cite: 48, 49]
                    }
                } else {
                    rejectionReason = "Debt-to-income ratio (" + String.format("%.2f", userDebtToIncome * 100) + "%) is too high (must be < 40%).";// [cite: 36]
                }
            } else {
                rejectionReason = "Employment not verified.";// [cite: 35]
            }
        } else {
            rejectionReason = "Credit score (" + userCreditScore + ") is too low (must be >= 650).";// [cite: 34]
        }

        if (loanApproved) {
            double baseInterestRate = 0.08; // Example base rate
            // Simplified special conditions (no customer age or government employee check in this model) [cite: 39, 40]
            System.out.println("\n=== Loan Application Status ==="); //[cite: 78]
            System.out.println("Application ID: L" + System.currentTimeMillis()); // Simple unique ID
            System.out.println("Customer: " + STORED_FULL_NAME); 
            System.out.println("Loan Type: " + loanType); 
            System.out.println("Amount Requested: $" + String.format("%.2f", requestedAmount)); 
            System.out.println("Status: APPROVED"); 
            System.out.println("Interest Rate: " + String.format("%.2f", baseInterestRate * 100) + "%"); 
            System.out.println("Term: 15 years (example)"); 
            // Monthly payment calculation would be complex without math functions, just an example [cite: 86]
            double monthlyPayment = (requestedAmount * (baseInterestRate / 12)) / (1 - Math.pow(1 + (baseInterestRate / 12), -15 * 12));
            System.out.println("Monthly Payment: $" + String.format("%.2f", monthlyPayment)); 
        } else {
            System.out.println("\n=== Loan Application Status ==="); 
            System.out.println("Application ID: L" + System.currentTimeMillis());
            System.out.println("Customer: " + STORED_FULL_NAME);
            System.out.println("Loan Type: " + loanType);
            System.out.println("Amount Requested: $" + String.format("%.2f", requestedAmount));
            System.out.println("Status: REJECTED"); 
            System.out.println("Reason for Rejection: " + rejectionReason); 
        }
    }

    // --- View User Details ---
    private static void displayUserDetails() {
        System.out.println("\n--- Your Profile ---");
        System.out.println("Full Name: " + STORED_FULL_NAME); 
        System.out.println("Username: " + STORED_USERNAME); 
        System.out.println("Address: " + STORED_ADDRESS); 
        System.out.println("Phone Number: " + STORED_PHONE); 
        System.out.println("Annual Income: $" + String.format("%.2f", STORED_ANNUAL_INCOME)); 
        System.out.println("Credit Score: " + userCreditScore);
        System.out.println("Employment Verified: " + (userEmploymentVerified ? "Yes" : "No"));
        System.out.println("Debt-to-Income Ratio: " + String.format("%.2f", userDebtToIncome * 100) + "%"); 
    }
}