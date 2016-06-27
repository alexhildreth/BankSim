/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksim;
import java.util.*;


/**
 *
 * @author Alex
 */

public class BankSim {
    
    //this has to be global and static for now, will figure out why passing it
    //as an argument was not working
    //public static HashMap<String, SavingsAccount> accountList = new HashMap<>();
    
    //main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selection;
        boolean running = true;
        HashMap<String, SavingsAccount> accountList = new HashMap<>();
        
        
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
    public static void makeAcct(HashMap<String, SavingsAccount> accountList){
        Scanner in = new Scanner(System.in);
        String newName;
        double newBal;
        
        System.out.println("\n**********************************");
        System.out.println("Enter New Account Name: ");
        newName = in.nextLine();
        System.out.println("Enter initial balance: ");
        newBal = in.nextDouble();
        
        accountList.put(newName, new SavingsAccount(newName, newBal));
        
        System.out.println("Creation successful, returning to menu...");
    }
    
    
    //access and edit account function
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
    
    
    public static void withdraw(String name, HashMap<String, SavingsAccount> accountList){
        Scanner in = new Scanner(System.in);
        double amt;
        System.out.println("Enter windrawal amount: ");
        amt = in.nextDouble();
        
        accountList.get(name).withdrawSav(amt);
        System.out.printf("Success, new balance: ");
        System.out.println(accountList.get(name).getSavBal());
    }
    
    
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
