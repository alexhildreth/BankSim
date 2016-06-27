/*
 * savings account object type that inherits from Account.java
 * adds a savings balance, along with withdraw and deposit functions
 */
package banksim;


public class SavingsAccount extends Account {
    //class variables
    private double savingsBal;
    
    //construct
    SavingsAccount(String _name, double bal){
        super(_name);
        savingsBal = bal;
    }
    
    //getter
    double getSavBal(){
        return savingsBal;
    }
    
    //setter
    void setSavBal(double bal){
        savingsBal = bal;
    }
    
    //class functions to deposit or withdraw
    void withdrawSav(double amount){
        savingsBal = this.getSavBal() - amount;
    }
    
    void depositSav(double amount){
        savingsBal = this.getSavBal() + amount;
    }
    
}
