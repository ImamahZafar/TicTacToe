/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author imamah
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int player1=0;
        dbConnectivity db = new dbConnectivity();
      
        System.out.println("Enter your name");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
          db.insertUser(s, 0);
         System.out.println("Choose your Sign ");
         System.out.println("Press 1 for X");
         System.out.println("Press 2 for O");
         Scanner in= new Scanner(System.in);
         int num=in.nextInt();
         if(num==1)
             player1=1;//has X sign
         else
             player1=2;
         
                System.out.println("player 1 has sign x");
        ticTacToeUI board=new ticTacToeUI(player1);
    }
    
}
