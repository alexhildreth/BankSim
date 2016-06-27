/*
 * Base bank account class that other account types can inherit from
 */
package banksim;

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
    

