/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;

/**
 *
 * @author imamah
 */
public class Board {

     int boardToPlayOn=1;
     
      void setBoardToPlayOn(int boardToPlayOn)
   {
      this.boardToPlayOn=boardToPlayOn;
   }
   int getBoardToPlayOn()
   {
       return boardToPlayOn;
   }
     
}
