/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksim;
import java.util.Scanner;

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
        
        while(running){
            System.out.println("\n**********************************");
            System.out.println("Welcome to BankSim!");
            System.out.println("1 - Create Account");
            System.out.println("2 - Access Account");
            System.out.println("3 - Quit");
            System.out.print("Enter Selection: ");
            selection = in.nextInt();
            
            //process selection
            if(selection == 3){
                running = false;
            }
        }
    }
    
}
