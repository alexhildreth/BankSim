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
public class Account {
    
    //class variables
    private String name; //account holder name
    private int accountNum;
    static int totalAccounts;
    
    //counstruct
    Account(String _name){
        name = _name;
        ++totalAccounts;
        accountNum = totalAccounts;
    }
    
    
    //getters
    public String getName(){
        return name;
    }
    
    public int getTotalAccounts(){
        return totalAccounts;
    }
    
    //setters
    public void setName(String newName){
        name = newName;
    }
    
}
    

