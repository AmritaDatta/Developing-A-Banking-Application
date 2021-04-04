package developbankingapplication;

import java.util.Scanner;

public class DevelopBankingApplication {

    public static void main(String[] args) {
        
        AccountCreation account = null;
        Scanner in = new Scanner(System.in);
        
        while (true) {            
            System.out.println("Press 1: Creat Account");
            System.out.println("Press 2: Deposit");
            System.out.println("Press 3: Withdraw Amount");
            System.out.println("Press 4: Account Details");
            System.out.println("Press 5: Exit");
            System.out.println("-----------------------------");
            
            System.out.println("Enter an option: ");
            int option = in.nextInt();
            
            switch (option){
                case 1:
                    if (account == null){
                        System.out.println("Please Enter A/C No: ");
                        long accountNo = in.nextLong();
                        
                        System.out.println("Please Enter The Name: ");
                        String name = in.next();
                                
                        System.out.println("Please Enter The Initial Deposit: ");
                        float balance = in.nextFloat();
                        
                        account = new AccountCreation(accountNo, name, balance);
                        System.out.println("Account Created");
                        System.out.println("-----------------------------");
                    }
                    else {
                        System.out.println("Account Is Already Created");
                        System.out.println("-----------------------------");
                    }
                    break;
                
                case 2:
                    if (account != null){
                        System.out.println("Please Enter The Amount To Deposit: ");
                        float amount = in.nextFloat();
                        account.deposit(amount);
                        System.out.println("-----------------------------");
                    }
                    else {
                        System.out.println("Error: Please Create Account");
                        System.out.println("-----------------------------");
                    }
                    break;
                    
                case 3:
                    if (account != null){
                        System.out.println("Please Enter the Withdraw amount: ");
                        float amount = in.nextFloat();
                        account.withdraw(amount);
                        System.out.println("-----------------------------");
                    }
                    else {
                        System.out.println("Error: Please Create Account");
                        System.out.println("-----------------------------");
                    }
                    break;
                    
                case 4:
                    if (account != null){
                        account.getAccountDetails();
                        System.out.println("-----------------------------");
                    }
                    else {
                        System.out.println("Error: Please Create Account");
                        System.out.println("-----------------------------");
                    }
                    break;
                    
                case 5:
                    System.out.println("***Bye Bye***");
                    System.out.println("-----------------------------");
                    System.exit(0); // to terminate the application execution
                    break;
                    
                default:
                    System.out.println("Invalid option....Please try again....");
                    System.out.println("-----------------------------");
            }
        }
    }   
}