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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selection;
        boolean running = true;
        HashMap accountList = new HashMap();
        
        while(running){
            System.out.println("\n**********************************");
            System.out.println("Welcome to BankSim!");
            System.out.println("1 - Create Account");
            System.out.println("2 - Access Account");
            System.out.println("3 - Quit");
            System.out.print("Enter Selection: ");
            selection = in.nextInt();
            
            //process selection
            if(selection == 1){
                makeAcct(accountList);
            }
            else if(selection == 2){
                accessAcct(accountList);
            }
            else if(selection == 3){
                running = false;
            }
        }
    }
    
    
    //account creation function
    public static void makeAcct(HashMap accountList){
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
    public static void accessAcct(HashMap accountList){
        Scanner in = new Scanner(System.in);
        String acctName;
        int selection;
        
        System.out.println("\n**********************************");
        System.out.println("Enter account name: ");
        acctName = in.nextLine();
        
        System.out.println("1. Print Account Info");
      
        selection = in.nextInt();
        
        if(selection == 1){
            printInfo(acctName, accountList);
        }
        
    }
    
    public static void printInfo(String name, HashMap accountList){
        System.out.println("\n**********************************");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Balance: ");
        System.out.println(accountList.get(name).getSavBal());
        
    }
}
