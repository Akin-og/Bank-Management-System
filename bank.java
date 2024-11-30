import java.util.Scanner;
import java.util.Random;

public class bank{
    private String name;
    private long AcctNum;
    private long balance;
    
    
    public bank(String name, long AcctNum, long balance){
        this.name = name;
        this.AcctNum = AcctNum;
        this.balance = balance;
    }
    
    public void setBalance (long balance){
        this.balance = balance;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setAcct (long AcctNum){
        //Random rand = new Random();
        this.AcctNum = AcctNum;
        //Acctnum = rand.nextInt(1000);
    }
    public String getName() {
        return name;
    }
    public long getBalance() {
        return balance;
    }
    public long getAcctNum(){
        return AcctNum;
    }
    public void display(){
        System.out.println("Username: " + name);
        System.out.println("Account Number: " + AcctNum);
        System.out.println("Balance: $"+ balance);
    }
    
    public static void main(String [] args) {
        Random rand = new Random();
       long randAcctNum = rand.nextInt();
       bank testbank = new bank("",0,0);
       testbank.setAcct(randAcctNum);
       while(true){
            System.out.println("Main Menu");
            System.out.println("Select from the following options:");
            System.out.println("1 to deposit");
            System.out.println("2 to Withdraw");
            System.out.println("3 to view balance");
            System.out.println("4 to exit");
            Scanner input = new Scanner (System.in);
            int userInput = input.nextInt();
            
             if(userInput == 1){
                System.out.println("Enter deposit amount: ");
                long userDep = input.nextLong();
                long formerB = testbank.getBalance();
                long result = formerB + userDep;
                testbank.setBalance(result);
                testbank.display();
            }
            if(userInput == 2){
                System.out.println("Enter withdraw amount: ");
                long userWith = input.nextLong();
                long formerB = testbank.getBalance();
                if (userWith > formerB){
                    System.out.println("Insufficient funds, current balance: $" + testbank.getBalance());
                }else {
                long result = formerB - userWith;
                testbank.setBalance(result);
                testbank.display();
                }
            }
            if(userInput == 3){
                testbank.display();
            }
            if(userInput == 4){
                System.out.println("Thank you, bye");
                break;
            }
        }
        //input.close();
    }
}
