/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksim;

/**
 *
 * @author Alex
 */
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
    void setSavBal(float bal){
        savingsBal = bal;
    }
    
    //class functions to deposit or withdraw
    void withdrawSav(float amount){
        savingsBal = this.getSavBal() - amount;
    }
    
    void depositSav(float amount){
        savingsBal = this.getSavBal() + amount;
    }
    
}
