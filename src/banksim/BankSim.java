/*
 * BankSim by Alex Hildreth
 * A short banking simulator utilizing parent and child classes
 * stored in a hashmap
 */
package banksim;
import java.util.*;

public class BankSim {
    
    //main
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int selection;
        boolean running = true;
        //hashmap to store account objects in
        HashMap<String, SavingsAccount> accountList = new HashMap<>();
        
        //main program menu loop
        while(running){
            System.out.println("\n**********************************");
            System.out.println("Welcome to BankSim!");
            System.out.println("1 - Create Account");
            System.out.println("2 - Access Account");
            System.out.println("3 - Quit");
            System.out.print("Enter Selection: ");
            selection = in.nextInt();
            
            //process selection
            switch(selection){
                case 1: makeAcct(accountList);
                        break;
                case 2: accessAcct(accountList);
                        break;
                case 3: running = false;
                        break;
            }
        }
    }
    
    
    //account creation function
    //accepts a name for the new account and an initial balance and
    //creates a new hashmap key value pair containing the account
    public static void makeAcct(HashMap<String, SavingsAccount> accountList){
        Scanner in = new Scanner(System.in);
        String newName;
        double newBal;
        
        System.out.println("\n**********************************");
        System.out.println("Enter New Account Name: ");
        newName = in.nextLine();
        System.out.println("Enter initial balance: ");
        newBal = in.nextDouble();
        
        //create new account
        accountList.put(newName, new SavingsAccount(newName, newBal));
        
        System.out.println("Creation successful, returning to menu...");
    }
    
    
    //access and edit account function
    //provides a menu to jump to other account option functions
    public static void accessAcct(HashMap<String, SavingsAccount> accountList){
        Scanner in = new Scanner(System.in);
        String acctName;
        int selection;
        
        System.out.println("\n**********************************");
        System.out.println("Enter account name: ");
        acctName = in.nextLine();
        
        System.out.println("1. Print Account Info");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
      
        selection = in.nextInt();
        
        switch(selection){
            case 1: printInfo(acctName, accountList);
                    break;
            case 2: withdraw(acctName, accountList);
                    break;
            case 3: deposit(acctName, accountList);
                    break;
        }
        
    }
    
    
    //print account info function
    //accepts the account name and account hashmap
    //pulls the basic account info from the hashmap and prints it
    public static void printInfo(String name, HashMap<String, SavingsAccount> accountList){
        if(accountList.containsKey(name)){
            System.out.println("\n**********************************");
            System.out.printf("Name: ");
            System.out.println(accountList.get(name).getName());
            System.out.printf("Balance: ");
            System.out.println(accountList.get(name).getSavBal());
            System.out.println("\nReturning to main menu...");
        }
    }
    
    
    //withdraw function
    //gets a withdrawal amount and calls the account class withdraw function
    //then prints the new balance
    public static void withdraw(String name, HashMap<String, SavingsAccount> accountList){
        Scanner in = new Scanner(System.in);
        double amt;
        System.out.println("Enter windrawal amount: ");
        amt = in.nextDouble();
        
        accountList.get(name).withdrawSav(amt);
        System.out.printf("Success, new balance: ");
        System.out.println(accountList.get(name).getSavBal());
    }
    
    
    //deposit function
    //gets a deposit amount and calls the account class deposit function
    //then prints the new balance
    public static void deposit(String name, HashMap<String, SavingsAccount> accountList){
        Scanner in = new Scanner(System.in);
        double amt;
        System.out.println("Enter deposit amount: ");
        amt = in.nextDouble();
        
        accountList.get(name).depositSav(amt);
        System.out.printf("Success, new balance: ");
        System.out.println(accountList.get(name).getSavBal());
    }
}
