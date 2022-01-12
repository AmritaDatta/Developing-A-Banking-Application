package developbankingapplication;

public class AccountCreation {
    long accountNo;
    String name;
    float balance;
    
    public AccountCreation (long accountNo, String name, float balance){
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
    
    //deposite methode
    //deposite methode
    void deposit(float amount) {
        this.balance = this.balance + amount;
        System.out.println("Euro " + amount + " has been Credited | Balance: " + this.balance);
    }
    
    //Withdraw methode
    void withdraw(float amount) {
        
        if(this.balance>=amount){
        this.balance = this.balance - amount;
        System.out.println("Euro " + amount + " Debited | Balance: " + this.balance);
        }
        
        else {
            System.out.println("Erro: Insufficient balance");
        }
    }
    
    // method definition to get account details
    void getAccountDetails(){
        System.out.println("A/C No. " + this.accountNo + " || Name: " + 
                this.name + " || Current Balance: " + this.balance);
    }
}
