/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
/**
 *
 * @author imamah
 */
public class ticTacToeUI extends javax.swing.JFrame {
  int player1Sign;
  String firstSign;
  String secondSign;
  int unhighlight;
  int turn;
  boolean moveCompleted=false;
  Board b=new Board();
  boolean winnerFound=false;

  List<Integer> player1= new ArrayList<Integer>();
  List<Integer> player2= new ArrayList<Integer>();
   void setTurn()
   {
       this.turn++;
   }
 
   public void setBoard()
   {
      
    unhighlightPrevBoard(1);  
    unhighlightPrevBoard(2);
    unhighlightPrevBoard(3);
    unhighlightPrevBoard(4);
    unhighlightPrevBoard(5);  
    unhighlightPrevBoard(6);
    unhighlightPrevBoard(7);
    unhighlightPrevBoard(8);
    unhighlightPrevBoard(9);
        
                if(player1Sign==1 )
                {
                    firstSign="X";
                    secondSign="O";
                }
                else
                {
                    firstSign="O";
                    secondSign="X";
                }
                
          
    
   }
    /**
     * Creates new form ticTacToeUI
     */
    public ticTacToeUI(int player1Sign) {
      this.player1Sign=player1Sign;
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
         setBoard();
        while(!winnerFound){
        addAction(moveCompleted);
       
        if(moveCompleted==true)
        {
              setTurn();
              moveCompleted=false;
              unhighlightPrevBoard(unhighlight);
            
        }
       
        if((turn %2)!=0)
        {
          int num =b.getBoardToPlayOn();
          System.out.println("help"+ num);
          generateNextMove(num,secondSign);
          setTurn();
 
        }
         getplayerWinner();
        }
    }
 
    public ActionListener createAction(javax.swing.JButton button)
    {
        ActionListener a1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
                if(button.getText().equals("1") || button.getText().equals("2") || button.getText().equals("3")||button.getText().equals("4")||button.getText().equals("5")||button.getText().equals("6")||button.getText().equals("7")||button.getText().equals("8")||button.getText().equals("9")){
               { 
                   b.setBoardToPlayOn(Integer.valueOf(button.getText()));
                    button.setForeground(Color.BLACK);
                   button.setText(firstSign);
                   moveCompleted=true;
                  
               }      
                }
            }
            
        };
        return a1;
    }
    
    void winEffect(javax.swing.JButton b1,javax.swing.JButton b2,javax.swing.JButton b3,int num)
    {
        b1.setBackground(new java.awt.Color(50,205,50));
        b2.setBackground(new java.awt.Color(50,205,50));
        b3.setBackground(new java.awt.Color(50,205,50));    
        
        if(b1.getText().equals(firstSign))
        {
           if(num==1)
           {
            if(!player1.contains(1))
            player1.add(1);
           }
           else if(num==2)
           {
            if(!player1.contains(2))
            player1.add(2); 
           }
           else if(num==3)
           {
            if(!player1.contains(3))
            player1.add(3);       
           }
             else if(num==4)
           {
            if(!player1.contains(4))
            player1.add(4); 
           }
           else if(num==5)
           {
            if(!player1.contains(5))
            player1.add(5);       
           }
             else if(num==6)
           {
            if(!player1.contains(6))
            player1.add(6);       
           }
             else if(num==7)
           {
            if(!player1.contains(7))
            player1.add(7); 
           }
           else if(num==8)
           {
            if(!player1.contains(8))
            player1.add(8);       
           }
             else if(num==9)
           {
            if(!player1.contains(9))
            player1.add(9);       
           }
       
                if(player1.contains(1) && player1.contains(2)&& player1.contains(3) || player1.contains(1) && player1.contains(5)&& player1.contains(9) 
                   ||player1.contains(1) && player1.contains(4)&& player1.contains(7) || player1.contains(2) && player1.contains(5)&& player1.contains(8) 
                   ||player1.contains(3) && player1.contains(5)&& player1.contains(7) || player1.contains(3) && player1.contains(6)&& player1.contains(9) 
                   ||player1.contains(4) && player1.contains(5)&& player1.contains(6) || player1.contains(7) && player1.contains(8)&& player1.contains(9)) 
                        {
                            winnerFound=true;
                     System.out.println(firstSign+ "is the winner ");
                        }
            
        }
         else if(b1.getText().equals(secondSign))
        {
           if(num==1)
           {
            if(!player2.contains(1))
            player2.add(1);
           }
           else if(num==2)
           {
            if(!player2.contains(2))
            player2.add(2); 
           }
           else if(num==3)
           {
            if(!player2.contains(3))
            player2.add(3);       
           }
             else if(num==4)
           {
            if(!player2.contains(4))
            player2.add(4); 
           }
           else if(num==5)
           {
            if(!player2.contains(5))
            player2.add(5);       
           }
             else if(num==6)
           {
            if(!player2.contains(6))
            player2.add(6);       
           }
             else if(num==7)
           {
            if(!player2.contains(7))
            player2.add(7); 
           }
           else if(num==8)
           {
            if(!player2.contains(8))
            player2.add(8);       
           }
             else if(num==9)
           {
            if(!player2.contains(9))
            player2.add(9);       
           }
      
                if(player2.contains(1) && player2.contains(2)&& player2.contains(3) || player2.contains(1) && player2.contains(5)&& player2.contains(9) 
                   ||player2.contains(1) && player2.contains(4)&& player2.contains(7) || player2.contains(2) && player2.contains(5)&& player2.contains(8) 
                   ||player2.contains(3) && player2.contains(5)&& player2.contains(7) || player2.contains(3) && player2.contains(6)&& player2.contains(9) 
                   ||player2.contains(4) && player2.contains(5)&& player2.contains(6) || player2.contains(7) && player2.contains(8)&& player2.contains(9) )
                        {
                     System.out.println(secondSign+ "is the winner ");
                     winnerFound=true;
                        }
        }
    }
    
    void getplayerWinner()
    {
      getWinnerFromBoard1();
      getWinnerFromBoard2();
      getWinnerFromBoard3();
      getWinnerFromBoard4();
      getWinnerFromBoard5();
      getWinnerFromBoard6();
      getWinnerFromBoard7();
      getWinnerFromBoard8();
      getWinnerFromBoard9(); 
 
    }
  
    int getWinnerFromBoard1()
    {
        if( jButton1.getText().equals(jButton2.getText()) && jButton1.getText().equals(jButton3.getText()))
        {
            winEffect(jButton1,jButton2,jButton3,1);
            return 1;
        }
         if( jButton1.getText().equals(jButton5.getText()) && jButton1.getText().equals(jButton9.getText()))
        {
            winEffect(jButton1,jButton5,jButton9,1);
            return 1;
        }
          if( jButton1.getText().equals(jButton4.getText()) && jButton1.getText().equals(jButton7.getText()))
        {
            winEffect(jButton1,jButton4,jButton7,1);
            return 1;
        }
           if( jButton2.getText().equals(jButton5.getText()) && jButton2.getText().equals(jButton8.getText()))
        {
            winEffect(jButton2,jButton5,jButton8,1);
            return 1;
        }
            if( jButton3.getText().equals(jButton6.getText()) && jButton3.getText().equals(jButton9.getText()))
        {
            winEffect(jButton3,jButton6,jButton9,1);
            return 1;
        }
            if( jButton3.getText().equals(jButton5.getText()) && jButton3.getText().equals(jButton7.getText()))
        {
            winEffect(jButton3,jButton5,jButton7,1);
            return 1;
        }
            if( jButton4.getText().equals(jButton5.getText()) && jButton4.getText().equals(jButton6.getText()))
        {
            winEffect(jButton4,jButton5,jButton6,1);
            return 1;
        }
            if( jButton7.getText().equals(jButton8.getText()) && jButton7.getText().equals(jButton9.getText()))
        {
            winEffect(jButton7,jButton8,jButton9,1);
            return 1;
        }
         
         else
            return 0;
           
    }
      int getWinnerFromBoard2()
    {
        if( jButton21.getText().equals(jButton22.getText()) && jButton21.getText().equals(jButton23.getText()))
        {
            winEffect(jButton21,jButton22,jButton23,2);
            return 2;
        }
         if( jButton21.getText().equals(jButton25.getText()) && jButton21.getText().equals(jButton29.getText()))
        {
            winEffect(jButton21,jButton25,jButton29,2);
            return 2;
        }
          if( jButton21.getText().equals(jButton24.getText()) && jButton21.getText().equals(jButton27.getText()))
        {
            winEffect(jButton21,jButton24,jButton27,2);
            return 2;
        }
           if( jButton22.getText().equals(jButton25.getText()) && jButton22.getText().equals(jButton28.getText()))
        {
            winEffect(jButton22,jButton25,jButton28,2);
            return 2;
        }
            if( jButton23.getText().equals(jButton26.getText()) && jButton23.getText().equals(jButton29.getText()))
        {
            winEffect(jButton23,jButton26,jButton29,2);
            return 2;
        }
            if( jButton23.getText().equals(jButton25.getText()) && jButton23.getText().equals(jButton27.getText()))
        {
            winEffect(jButton23,jButton25,jButton27,2);
            return 2;
        }
            if( jButton25.getText().equals(jButton24.getText()) && jButton25.getText().equals(jButton26.getText()))
        {
            winEffect(jButton24,jButton25,jButton26,2);
            return 2;
        }
            if( jButton27.getText().equals(jButton28.getText()) && jButton27.getText().equals(jButton29.getText()))
        {
            winEffect(jButton27,jButton28,jButton29,2);
            return 2;
        }
         
         else
            return 0;
           
    }
        int getWinnerFromBoard3()
    {
        if( jButton31.getText().equals(jButton32.getText()) && jButton31.getText().equals(jButton33.getText()))
        {
            winEffect(jButton31,jButton32,jButton33,3);
            return 3;
        }
         if( jButton31.getText().equals(jButton35.getText()) && jButton31.getText().equals(jButton39.getText()))
        {
            winEffect(jButton31,jButton35,jButton39,3);
            return 3;
        }
          if( jButton31.getText().equals(jButton34.getText()) && jButton31.getText().equals(jButton37.getText()))
        {
            winEffect(jButton31,jButton34,jButton37,3);
            return 3;
        }
           if( jButton32.getText().equals(jButton35.getText()) && jButton32.getText().equals(jButton38.getText()))
        {
            winEffect(jButton32,jButton35,jButton38,3);
            return 3;
        }
            if( jButton33.getText().equals(jButton36.getText()) && jButton33.getText().equals(jButton39.getText()))
        {
            winEffect(jButton33,jButton36,jButton39,3);
            return 3;
        }
            if( jButton33.getText().equals(jButton35.getText()) && jButton33.getText().equals(jButton37.getText()))
        {
            winEffect(jButton33,jButton35,jButton37,3);
            return 3;
        }
            if( jButton34.getText().equals(jButton35.getText()) && jButton34.getText().equals(jButton36.getText()))
        {
            winEffect(jButton34,jButton35,jButton36,3);
            return 3;
        }
            if( jButton37.getText().equals(jButton38.getText()) && jButton37.getText().equals(jButton39.getText()))
        {
            winEffect(jButton37,jButton38,jButton39,3);
            return 3;
        }
         
         else
            return 0;
           
    }
          int getWinnerFromBoard4()
    {
        if( jButton41.getText().equals(jButton42.getText()) && jButton41.getText().equals(jButton43.getText()))
        {
            winEffect(jButton41,jButton42,jButton43,4);
            return 4;
        }
         if( jButton1.getText().equals(jButton5.getText()) && jButton1.getText().equals(jButton9.getText()))
        {
            winEffect(jButton1,jButton5,jButton9,4);
            return 4;
        }
          if( jButton41.getText().equals(jButton44.getText()) && jButton41.getText().equals(jButton47.getText()))
        {
            winEffect(jButton41,jButton44,jButton47,4);
            return 4;
        }
           if( jButton42.getText().equals(jButton45.getText()) && jButton42.getText().equals(jButton48.getText()))
        {
            winEffect(jButton42,jButton45,jButton48,4);
            return 4;
        }
            if( jButton43.getText().equals(jButton46.getText()) && jButton43.getText().equals(jButton49.getText()))
        {
            winEffect(jButton43,jButton46,jButton49,4);
            return 4;
        }
            if( jButton43.getText().equals(jButton45.getText()) && jButton43.getText().equals(jButton47.getText()))
        {
            winEffect(jButton43,jButton45,jButton47,4);
            return 4;
        }
            if( jButton44.getText().equals(jButton45.getText()) && jButton44.getText().equals(jButton46.getText()))
        {
            winEffect(jButton44,jButton45,jButton46,4);
            return 4;
        }
            if( jButton47.getText().equals(jButton48.getText()) && jButton47.getText().equals(jButton49.getText()))
        {
            winEffect(jButton47,jButton48,jButton49,4);
            return 4;
        }
         
         else
            return 0;
           
    }
            int getWinnerFromBoard5()
    {
        if( jButton51.getText().equals(jButton52.getText()) && jButton51.getText().equals(jButton53.getText()))
        {
            winEffect(jButton51,jButton52,jButton53,5);
            return 5;
        }
         if( jButton51.getText().equals(jButton55.getText()) && jButton51.getText().equals(jButton59.getText()))
        {
            winEffect(jButton51,jButton55,jButton59,5);
            return 5;
        }
          if( jButton51.getText().equals(jButton54.getText()) && jButton51.getText().equals(jButton57.getText()))
        {
            winEffect(jButton51,jButton54,jButton57,5);
            return 5;
        }
           if( jButton52.getText().equals(jButton55.getText()) && jButton52.getText().equals(jButton58.getText()))
        {
            winEffect(jButton2,jButton5,jButton8,5);
            return 5;
        }
            if( jButton53.getText().equals(jButton56.getText()) && jButton53.getText().equals(jButton59.getText()))
        {
            winEffect(jButton53,jButton56,jButton59,5);
            return 5;
        }
            if( jButton53.getText().equals(jButton55.getText()) && jButton53.getText().equals(jButton57.getText()))
        {
            winEffect(jButton53,jButton55,jButton57,5);
            return 5;
        }
            if( jButton54.getText().equals(jButton55.getText()) && jButton54.getText().equals(jButton56.getText()))
        {
            winEffect(jButton54,jButton55,jButton56,5);
            return 5;
        }
            if( jButton57.getText().equals(jButton58.getText()) && jButton57.getText().equals(jButton59.getText()))
        {
            winEffect(jButton57,jButton58,jButton59,5);
            return 5;
        }
         
         else
            return 0;
           
    }
              int getWinnerFromBoard6()
    {
        if( jButton61.getText().equals(jButton62.getText()) && jButton61.getText().equals(jButton63.getText()))
        {
            winEffect(jButton61,jButton62,jButton63,6);
            return 6;
        }
         if( jButton61.getText().equals(jButton65.getText()) && jButton61.getText().equals(jButton69.getText()))
        {
            winEffect(jButton61,jButton65,jButton69,6);
            return 6;
        }
          if( jButton61.getText().equals(jButton64.getText()) && jButton61.getText().equals(jButton67.getText()))
        {
            winEffect(jButton61,jButton64,jButton67,6);
            return 6;
        }
           if( jButton62.getText().equals(jButton65.getText()) && jButton62.getText().equals(jButton68.getText()))
        {
            winEffect(jButton62,jButton65,jButton68,6);
            return 6;
        }
            if( jButton63.getText().equals(jButton66.getText()) && jButton63.getText().equals(jButton69.getText()))
        {
            winEffect(jButton63,jButton66,jButton69,6);
            return 6;
        }
            if( jButton63.getText().equals(jButton65.getText()) && jButton63.getText().equals(jButton67.getText()))
        {
            winEffect(jButton63,jButton65,jButton67,6);
            return 6;
        }
            if( jButton64.getText().equals(jButton65.getText()) && jButton64.getText().equals(jButton66.getText()))
        {
            winEffect(jButton64,jButton65,jButton66,6);
            return 6;
        }
            if( jButton67.getText().equals(jButton68.getText()) && jButton67.getText().equals(jButton69.getText()))
        {
            winEffect(jButton67,jButton68,jButton69,6);
            return 6;
        }
         
         else
            return 0;
           
    }
                int getWinnerFromBoard7()
    {
        if( jButton71.getText().equals(jButton72.getText()) && jButton71.getText().equals(jButton73.getText()))
        {
            winEffect(jButton71,jButton72,jButton73,7);
            return 7;
        }
         if( jButton71.getText().equals(jButton75.getText()) && jButton71.getText().equals(jButton79.getText()))
        {
            winEffect(jButton71,jButton75,jButton79,7);
            return 7;
        }
          if( jButton71.getText().equals(jButton74.getText()) && jButton71.getText().equals(jButton77.getText()))
        {
            winEffect(jButton71,jButton74,jButton77,7);
            return 7;
        }
           if( jButton72.getText().equals(jButton75.getText()) && jButton72.getText().equals(jButton78.getText()))
        {
            winEffect(jButton72,jButton75,jButton78,7);
            return 7;
        }
            if( jButton73.getText().equals(jButton76.getText()) && jButton73.getText().equals(jButton79.getText()))
        {
            winEffect(jButton73,jButton76,jButton79,7);
            return 7;
        }
            if( jButton73.getText().equals(jButton75.getText()) && jButton73.getText().equals(jButton77.getText()))
        {
            winEffect(jButton73,jButton75,jButton77,7);
            return 7;
        }
            if( jButton74.getText().equals(jButton75.getText()) && jButton74.getText().equals(jButton76.getText()))
        {
            winEffect(jButton74,jButton75,jButton76,7);
            return 7;
        }
            if( jButton77.getText().equals(jButton78.getText()) && jButton77.getText().equals(jButton79.getText()))
        {
            winEffect(jButton77,jButton78,jButton79,7);
            return 7;
        }
         
         else
            return 0;
           
    }
    int getWinnerFromBoard8()
    {
        if( jButton81.getText().equals(jButton82.getText()) && jButton81.getText().equals(jButton83.getText()))
        {
            winEffect(jButton81,jButton82,jButton83,8);
            return 8;
        }
         if( jButton81.getText().equals(jButton85.getText()) && jButton81.getText().equals(jButton89.getText()))
        {
            winEffect(jButton81,jButton85,jButton89,8);
            return 8;
        }
          if( jButton81.getText().equals(jButton84.getText()) && jButton81.getText().equals(jButton87.getText()))
        {
            winEffect(jButton81,jButton84,jButton87,8);
            return 8;
        }
           if( jButton82.getText().equals(jButton85.getText()) && jButton82.getText().equals(jButton88.getText()))
        {
            winEffect(jButton82,jButton85,jButton88,8);
            return 8;
        }
            if( jButton83.getText().equals(jButton86.getText()) && jButton83.getText().equals(jButton89.getText()))
        {
            winEffect(jButton83,jButton86,jButton89,8);
            return 8;
        }
            if( jButton83.getText().equals(jButton85.getText()) && jButton83.getText().equals(jButton87.getText()))
        {
            winEffect(jButton83,jButton85,jButton87,8);
            return 8;
        }
            if( jButton84.getText().equals(jButton85.getText()) && jButton84.getText().equals(jButton86.getText()))
        {
            winEffect(jButton84,jButton85,jButton86,8);
            return 8;
        }
            if( jButton87.getText().equals(jButton88.getText()) && jButton87.getText().equals(jButton89.getText()))
        {
            winEffect(jButton87,jButton88,jButton89,8);
            return 8;
        }
         
         else
            return 0;
           
    }
    int getWinnerFromBoard9()
    {
        if( jButton91.getText().equals(jButton92.getText()) && jButton91.getText().equals(jButton93.getText()))
        {
            winEffect(jButton91,jButton92,jButton93,9);
            return 9;
        }
         if( jButton91.getText().equals(jButton95.getText()) && jButton91.getText().equals(jButton99.getText()))
        {
            winEffect(jButton91,jButton95,jButton99,9);
            return 9;
        }
          if( jButton91.getText().equals(jButton94.getText()) && jButton91.getText().equals(jButton97.getText()))
        {
            winEffect(jButton91,jButton94,jButton97,9);
            return 9;
        }
           if( jButton92.getText().equals(jButton95.getText()) && jButton92.getText().equals(jButton98.getText()))
        {
            winEffect(jButton92,jButton95,jButton98,9);
            return 9;
        }
            if( jButton93.getText().equals(jButton96.getText()) && jButton93.getText().equals(jButton99.getText()))
        {
            winEffect(jButton93,jButton96,jButton99,9);
            return 9;
        }
            if( jButton93.getText().equals(jButton95.getText()) && jButton93.getText().equals(jButton97.getText()))
        {
            winEffect(jButton93,jButton95,jButton97,9);
            return 9;
        }
            if( jButton94.getText().equals(jButton95.getText()) && jButton94.getText().equals(jButton96.getText()))
        {
            winEffect(jButton94,jButton95,jButton96,9);
            return 9;
        }
            if( jButton97.getText().equals(jButton98.getText()) && jButton97.getText().equals(jButton99.getText()))
        {
            winEffect(jButton97,jButton98,jButton99,9);
            return 9;
        }
         
         else
            return 0;
           
    }
    public void generateNextMove(int boardNum,String secondSign)
    {
        Random rand=new Random();
        int randomNum=rand.nextInt(((9+1)-1)+1);
        if(boardNum==1)
        {
            int i=0;
            while(true)
            {
             if(player1.contains(randomNum)|| player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
            if(randomNum==1 && !jButton1.getText().equals("X") && !jButton1.getText().equals("O"))
        {  jButton1.setForeground(Color.BLUE);
             jButton1.setText(secondSign);
             break;
        }
         else if(randomNum==2 && !jButton2.getText().equals("X") &&!jButton2.getText().equals("O"))
         {
              jButton2.setForeground(Color.BLUE);
             jButton2.setText(secondSign);
               break;
         }  
         else if(randomNum==6 && !jButton6.getText().equals("X")&& !jButton6.getText().equals("0"))
         {
              jButton6.setForeground(Color.BLUE);
             jButton6.setText(secondSign);
               break;
         }   
        else if(randomNum==3 && !jButton3.getText().equals("X")&& !jButton3.getText().equals("O") )
        {
             jButton3.setForeground(Color.BLUE);
            jButton3.setText(secondSign);
              break;
        }  
        else if(randomNum==4 && !jButton4.getText().equals("X")&& !jButton4.getText().equals("O") )
        {
             jButton4.setForeground(Color.BLUE);
            jButton4.setText(secondSign);
              break;
        }  
        else if(randomNum==5 && !jButton5.getText().equals("X") &&!jButton5.getText().equals("O"))
        {
            jButton5.setForeground(Color.BLUE);
            jButton5.setText(secondSign);
              break;
        } 
        else if(randomNum==7 && !jButton7.getText().equals("X") && !jButton7.getText().equals("O"))
        {
            jButton7.setForeground(Color.BLUE);
            jButton7.setText(secondSign);
              break;
        }  
        else if(randomNum==8 && !jButton8.getText().equals("X")&& !jButton8.getText().equals("O"))
        {
             jButton8.setForeground(Color.BLUE);
            jButton8.setText(secondSign);
              break;
        }  
        else if(randomNum==9 && !jButton9.getText().equals("X") && !jButton9.getText().equals("O"))
        {
             jButton9.setForeground(Color.BLUE);
            jButton9.setText(secondSign);
              break;
        }  
         else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
         i++;
        }
           unhighlight=highlightNextBoard(randomNum);
        }
        
        else if(boardNum==2)
        {
            int i=0;
            while(true){
                 if(player1.contains(randomNum) || player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
         if(randomNum==1 && !jButton21.getText().equals("X") && !jButton21.getText().equals("O"))
         {
            jButton21.setForeground(Color.BLUE);
            jButton21.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
         }
         else if(randomNum==2 && !jButton22.getText().equals("X") && !jButton22.getText().equals("O") )
         {
            jButton22.setForeground(Color.BLUE);
           highlightNextBoard(randomNum);
             jButton22.setText(secondSign);
             break;
         }  
         else if(randomNum==6 && !jButton26.getText().equals("X") && !jButton26.getText().equals("O"))
         {
            jButton26.setForeground(Color.BLUE);
             jButton26.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }   
        else if(randomNum==3 && !jButton23.getText().equals("X")&& !jButton23.getText().equals("O"))
        {
             jButton23.setForeground(Color.BLUE);
            jButton23.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==4 && !jButton24.getText().equals("X")&& !jButton24.getText().equals("O"))
        {
             jButton24.setForeground(Color.BLUE);
            jButton24.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==5 && !jButton25.getText().equals("X") && !jButton25.getText().equals("O"))
        {
            jButton25.setForeground(Color.BLUE);
            jButton25.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        } 
        else if(randomNum==7 && !jButton27.getText().equals("X")&& !jButton27.getText().equals("O"))
        {
            jButton27.setForeground(Color.BLUE);
            jButton27.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==8 && !jButton28.getText().equals("X")&& !jButton28.getText().equals("O"))
        {
            jButton28.setForeground(Color.BLUE);
            jButton28.setText(secondSign);
   
            break;
        }  
        else if(randomNum==9 && !jButton29.getText().equals("X")&& !jButton29.getText().equals("O"))
        {
             jButton29.setForeground(Color.BLUE);
            jButton29.setText(secondSign);
             
            break;
        }  
               else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
           
         i++;
            }
                     unhighlight=highlightNextBoard(randomNum);
        }
         else if(boardNum==3)
        {
            int i=0;
            while(true){
                 if(player1.contains(randomNum)|| player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
         if(randomNum==1 && !jButton31.getText().equals("X") && !jButton31.getText().equals("O"))
         {
            jButton31.setForeground(Color.BLUE);
             jButton31.setText(secondSign);
           
             break;
         }
         else if(randomNum==2 && !jButton32.getText().equals("X")  && !jButton32.getText().equals("O"))
         {
           jButton32.setForeground(Color.BLUE);  
             jButton32.setText(secondSign);
           
             break;
         }  
         else if(randomNum==6 && !jButton36.getText().equals("X")&& !jButton36.getText().equals("O"))
         {
             jButton36.setForeground(Color.BLUE); 
             jButton36.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }   
        else if(randomNum==3 && !jButton33.getText().equals("X")&& !jButton33.getText().equals("O"))
        {
            jButton33.setForeground(Color.BLUE); 
            jButton33.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==4 && !jButton34.getText().equals("X") && !jButton34.getText().equals("O"))
        {
            jButton34.setForeground(Color.BLUE); 
            jButton34.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==5 && !jButton35.getText().equals("X")&& !jButton35.getText().equals("O"))
        {
            jButton35.setForeground(Color.BLUE); 
            jButton35.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        } 
        else if(randomNum==7 && !jButton37.getText().equals("X")&& !jButton37.getText().equals("O"))
        {
            jButton37.setForeground(Color.BLUE); 
            jButton37.setText(secondSign);      highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==8 && !jButton38.getText().equals("X")&& !jButton38.getText().equals("O"))
        {
           jButton38.setForeground(Color.BLUE); 
            jButton38.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==9 && !jButton39.getText().equals("X")&& !jButton39.getText().equals("O"))
        {
            jButton39.setForeground(Color.BLUE); 
            jButton39.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
               else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
         i++;
        }
                     unhighlight=highlightNextBoard(randomNum);
        }
         else if(boardNum==4)
        {
            int i=0;
            while(true){
            if(player1.contains(randomNum)|| player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
         if(randomNum==1 && !jButton41.getText().equals("X") && !jButton41.getText().equals("O"))
         {
             jButton41.setForeground(Color.BLUE); 
             jButton41.setText(secondSign);
            highlightNextBoard(randomNum);
             break;
         }
         else if(randomNum==2 && !jButton42.getText().equals("X")&& !jButton42.getText().equals("O"))
         {
            jButton42.setForeground(Color.BLUE); 
             jButton42.setText(secondSign);
            highlightNextBoard(randomNum);
             break;
         }  
         else if(randomNum==6 && !jButton46.getText().equals("X")&& !jButton46.getText().equals("O"))
         {
            jButton46.setForeground(Color.BLUE);  
             jButton46.setText(secondSign);
                  highlightNextBoard(randomNum);
             break;
         }   
        else if(randomNum==3 && !jButton43.getText().equals("X")&& !jButton43.getText().equals("O"))
        {
            jButton43.setForeground(Color.BLUE); 
            jButton43.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==4 && !jButton44.getText().equals("X")&& !jButton44.getText().equals("O"))
        {
            jButton44.setForeground(Color.BLUE); 
            jButton44.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==5 && !jButton45.getText().equals("X")&& !jButton45.getText().equals("O"))
        {
            jButton45.setForeground(Color.BLUE); 
            jButton45.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        } 
        else if(randomNum==7 && !jButton47.getText().equals("X")&& !jButton47.getText().equals("O"))
        {
            jButton47.setForeground(Color.BLUE); 
            jButton47.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==8 && !jButton48.getText().equals("X") && !jButton48.getText().equals("O"))
        {
            jButton48.setForeground(Color.BLUE); 
            jButton48.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==9 && !jButton49.getText().equals("X")&& !jButton49.getText().equals("O"))
        {
            jButton49.setForeground(Color.BLUE); 
            jButton49.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
              else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
         i++;
            }
                     unhighlight=highlightNextBoard(randomNum);
        }
         else if(boardNum==5)
        {
            int i=0;
            while(true){
            if(player1.contains(randomNum)|| player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
         if(randomNum==1 && !jButton51.getText().equals("X")&& !jButton51.getText().equals("O"))
         {
             jButton51.setForeground(Color.BLUE); 
             jButton51.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }
         else if(randomNum==2 && !jButton52.getText().equals("X") && !jButton52.getText().equals("O"))
         {
            jButton52.setForeground(Color.BLUE); 
            jButton52.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
         }  
         else if(randomNum==6 && !jButton56.getText().equals("X")&& !jButton56.getText().equals("O"))
         {
             jButton56.setForeground(Color.BLUE); 
             jButton56.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }   
        else if(randomNum==3 && !jButton53.getText().equals("X")&& !jButton53.getText().equals("O"))
        {
            jButton53.setForeground(Color.BLUE); 
            jButton53.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==4 && !jButton54.getText().equals("X")&& !jButton54.getText().equals("O"))
        {
            jButton54.setForeground(Color.BLUE); 
            jButton54.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==5 && !jButton55.getText().equals("X") && !jButton55.getText().equals("O"))
        {
           jButton55.setForeground(Color.BLUE);  
            jButton55.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        } 
        else if(randomNum==7 && !jButton57.getText().equals("X")&& !jButton57.getText().equals("O"))
        {
            jButton57.setForeground(Color.BLUE); 
            jButton57.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==8 && !jButton58.getText().equals("X")&& !jButton58.getText().equals("O"))
        {
            jButton58.setForeground(Color.BLUE); 
            jButton58.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==9 && !jButton59.getText().equals("X")&& !jButton59.getText().equals("O"))
        {
            jButton59.setForeground(Color.BLUE); 
            jButton59.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
               else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
         i++;
            }
        unhighlight=highlightNextBoard(randomNum);
        }
         else if(boardNum==6)
        {
            int i=0;
         while(true){
            if(player1.contains(randomNum)|| player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
         if(randomNum==1 && !jButton61.getText().equals("X")&& !jButton61.getText().equals("O"))
         {
             jButton61.setForeground(Color.BLUE); 
             jButton61.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }
         else if(randomNum==2 && !jButton62.getText().equals("X")&& !jButton62.getText().equals("O"))
         {
             jButton62.setForeground(Color.BLUE); 
             jButton62.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }  
         else if(randomNum==6 && !jButton66.getText().equals("X")&& !jButton66.getText().equals("O"))
         {
             jButton66.setForeground(Color.BLUE); 
             jButton66.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }   
        else if(randomNum==3 && !jButton63.getText().equals("X")&& !jButton63.getText().equals("O"))
        {
            jButton63.setForeground(Color.BLUE); 
            jButton63.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==4 && !jButton64.getText().equals("X")&& !jButton64.getText().equals("O"))
        {
           jButton64.setForeground(Color.BLUE); 
                 highlightNextBoard(randomNum);
            jButton64.setText(secondSign);break;
        }  
        else if(randomNum==5 && !jButton65.getText().equals("X")&& !jButton65.getText().equals("O"))
        {
            jButton65.setForeground(Color.BLUE); 
            jButton65.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        } 
        else if(randomNum==7 && !jButton67.getText().equals("X")&& !jButton67.getText().equals("O"))
        {
            jButton67.setForeground(Color.BLUE); 
            jButton67.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==8 && !jButton68.getText().equals("X")&& !jButton68.getText().equals("O"))
        {
            jButton68.setForeground(Color.BLUE); 
            jButton68.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==9 && !jButton69.getText().equals("X")&& !jButton69.getText().equals("O"))
        {
            jButton69.setForeground(Color.BLUE); 
            jButton69.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
               else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
         i++;
         }
         
        unhighlight=highlightNextBoard(randomNum);
        }
          else if(boardNum==7)
        {
            int i=0;
            while(true){
            if(player1.contains(randomNum)|| player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
         if(randomNum==1 && !jButton71.getText().equals("X")&& !jButton71.getText().equals("O"))
         {
             jButton71.setForeground(Color.BLUE);
             jButton71.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }
         else if(randomNum==2 && !jButton72.getText().equals("X")&& !jButton72.getText().equals("O"))
         {
             jButton72.setForeground(Color.BLUE);
             jButton72.setText(secondSign);
                   highlightNextBoard(randomNum);
             break;
         }  
         else if(randomNum==6 && !jButton76.getText().equals("X")&& !jButton76.getText().equals("O"))
         {
             jButton76.setForeground(Color.BLUE);      highlightNextBoard(randomNum);
             jButton76.setText(secondSign);break;
         }   
        else if(randomNum==3 && !jButton73.getText().equals("X")&& !jButton73.getText().equals("O"))
        {
            jButton73.setForeground(Color.BLUE);
                  highlightNextBoard(randomNum);
            jButton73.setText(secondSign);
            break;
        }  
        else if(randomNum==4 &&!jButton74.getText().equals("X")&& !jButton74.getText().equals("O"))
        {
            jButton74.setForeground(Color.BLUE);
            jButton74.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==5 && !jButton75.getText().equals("X")&& !jButton75.getText().equals("O"))
        {
            jButton75.setForeground(Color.BLUE);
            jButton75.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        } 
        else if(randomNum==7 && !jButton77.getText().equals("X")&& !jButton77.getText().equals("O"))
        {
            jButton77.setForeground(Color.BLUE);
            jButton77.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==8 && !jButton78.getText().equals("X")&& !jButton78.getText().equals("O"))
        {
            jButton78.setForeground(Color.BLUE);
            jButton78.setText(secondSign);
                  highlightNextBoard(randomNum);
            break;
        }  
        else if(randomNum==9 && !jButton79.getText().equals("X")&& !jButton79.getText().equals("O"))
        {
            jButton79.setForeground(Color.BLUE);
            jButton79.setText(secondSign);      highlightNextBoard(randomNum);
            break;
        } 
               else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
         i++;
            }
             unhighlight=highlightNextBoard(randomNum);
        }
          else if(boardNum == 8)
        {
            int i=0;
            while(true){
                
           if(player1.contains(randomNum)|| player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
         if(randomNum==1 && !jButton81.getText().equals("X")&& !jButton81.getText().equals("O"))
         {
             jButton81.setForeground(Color.BLUE);
             jButton81.setText(secondSign);
             break;
         }
         else if(randomNum==2 && !jButton82.getText().equals("X")&& !jButton82.getText().equals("O"))
         {
             jButton82.setForeground(Color.BLUE);
             jButton82.setText(secondSign);
             break;
         }  
         else if(randomNum==6 && !jButton86.getText().equals("X")&& !jButton86.getText().equals("O"))
         {
             jButton86.setForeground(Color.BLUE);
             jButton86.setText(secondSign);
             break;
         }   
        else if(randomNum==3 && !jButton83.getText().equals("X")&& !jButton83.getText().equals("O"))
        {
            jButton83.setForeground(Color.BLUE);
            jButton83.setText(secondSign);
            break;
        }  
        else if(randomNum==4 &&!jButton84.getText().equals("X")&& !jButton84.getText().equals("O"))
        {
            jButton84.setForeground(Color.BLUE);
            jButton84.setText(secondSign);
            break;
        }  
        else if(randomNum==5 && !jButton85.getText().equals("X")&& !jButton85.getText().equals("O"))
        {
            jButton85.setForeground(Color.BLUE);
            jButton85.setText(secondSign);
            break;
        } 
        else if(randomNum==7 && !jButton87.getText().equals("X")&& !jButton87.getText().equals("O"))
        {
            jButton87.setForeground(Color.BLUE);
            jButton87.setText(secondSign);
            break;
        }  
        else if(randomNum==8 && !jButton88.getText().equals("X")&& !jButton88.getText().equals("O"))
        {
            jButton88.setForeground(Color.BLUE);
            jButton88.setText(secondSign);
            break;
        }  
        else if(randomNum==9 && !jButton89.getText().equals("X")&& !jButton89.getText().equals("O"))
        {
            jButton89.setForeground(Color.BLUE);
            jButton89.setText(secondSign);
            break;
        }   
               else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
         i++;
            }
                 unhighlight=highlightNextBoard(randomNum);
       }
          else if(boardNum==9)
               {
                int i=0;
                 while(true)
                 {
            if(player1.contains(randomNum)|| player2.contains(randomNum))
             {
                randomNum=rand.nextInt(((9+1)-1)+1);
             }
         if(randomNum==1 && !jButton91.getText().equals("X")&& !jButton91.getText().equals("O"))
         {
             jButton91.setForeground(Color.BLUE);
             jButton91.setText(secondSign);
             break;
         }
         else if(randomNum==2 && !jButton92.getText().equals("X")&& !jButton92.getText().equals("O"))
         {
             jButton92.setForeground(Color.BLUE);
             jButton92.setText(secondSign);
             break;
         }  
         else if(randomNum==6 && !jButton96.getText().equals("X")&& !jButton96.getText().equals("O"))
         {
             jButton96.setForeground(Color.BLUE);
             jButton96.setText(secondSign);
             break;
         }   
        else if(randomNum==3 && !jButton93.getText().equals("X")&& !jButton93.getText().equals("O"))
        {
            jButton93.setForeground(Color.BLUE);
            jButton93.setText(secondSign);
            break;
        }  
        else if(randomNum==4 &&!jButton94.getText().equals("X")&& !jButton94.getText().equals("O"))
        {
            jButton94.setForeground(Color.BLUE);
            jButton94.setText(secondSign);
            break;
        }  
        else if(randomNum==5 && !jButton95.getText().equals("X")&& !jButton95.getText().equals("O"))
        {
            jButton95.setForeground(Color.BLUE);
            jButton95.setText(secondSign);
            break;
        } 
        else if(randomNum==7 && !jButton97.getText().equals("X")&& !jButton97.getText().equals("O"))
        {
            jButton97.setForeground(Color.BLUE);
            jButton97.setText(secondSign);
            break;
        }  
        else if(randomNum==8 && !jButton98.getText().equals("X")&& !jButton98.getText().equals("O"))
        {
            jButton98.setForeground(Color.BLUE);
            jButton98.setText(secondSign);
            break;
        }  
        else if(randomNum==9 && !jButton99.getText().equals("X")&& !jButton99.getText().equals("O"))
        {
            jButton99.setForeground(Color.BLUE);
            jButton99.setText(secondSign);
            break;
        }  
               else
        {
              rand=new Random();
        randomNum=rand.nextInt(9)-1;
        }
         i++;
                 }
       unhighlight= highlightNextBoard(randomNum);
               }
    }
    public int highlightNextBoard(int num){
            if(player1.contains(num)|| player2.contains(num))
             {
                
             }
            else{
      switch (num) {
          case 1:
              highlightBoard(jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9);
              break;
          case 2:
              highlightBoard(jButton21,jButton22,jButton23,jButton24,jButton25,jButton26,jButton27,jButton28,jButton29);
              break;
          case 3:
              highlightBoard(jButton31,jButton32,jButton33,jButton34,jButton35,jButton36,jButton37,jButton38,jButton39);
              break;
          case 4:
              highlightBoard(jButton41,jButton42,jButton43,jButton44,jButton45,jButton46,jButton47,jButton48,jButton49);
              break;
          case 5:
              highlightBoard(jButton51,jButton52,jButton53,jButton54,jButton55,jButton56,jButton57,jButton58,jButton59);
              break;
          case 6:
              highlightBoard(jButton61,jButton62,jButton63,jButton64,jButton65,jButton66,jButton67,jButton68,jButton69);
              break;
          case 7:
              highlightBoard(jButton71,jButton72,jButton73,jButton74,jButton75,jButton76,jButton77,jButton78,jButton79);
              break;
          case 8:
              highlightBoard(jButton81,jButton82,jButton83,jButton84,jButton85,jButton86,jButton87,jButton88,jButton89);
              break;
          case 9:
              highlightBoard(jButton91,jButton92,jButton93,jButton94,jButton95,jButton96,jButton97,jButton98,jButton99);
              break;
      }}
        return num;
    }
  public void unhighlightPrevBoard(int num){
      switch (num) {
          case 1:
              unhighlightBoard(jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9);
              break;
          case 2:
              unhighlightBoard(jButton21,jButton22,jButton23,jButton24,jButton25,jButton26,jButton27,jButton28,jButton29);
              break;
          case 3:
              unhighlightBoard(jButton31,jButton32,jButton33,jButton34,jButton35,jButton36,jButton37,jButton38,jButton39);
              break;
          case 4:
              unhighlightBoard(jButton41,jButton42,jButton43,jButton44,jButton45,jButton46,jButton47,jButton48,jButton49);
              break;
          case 5:
              unhighlightBoard(jButton51,jButton52,jButton53,jButton54,jButton55,jButton56,jButton57,jButton58,jButton59);
              break;
          case 6:
              unhighlightBoard(jButton61,jButton62,jButton63,jButton64,jButton65,jButton66,jButton67,jButton68,jButton69);
              break;
          case 7:
              unhighlightBoard(jButton71,jButton72,jButton73,jButton74,jButton75,jButton76,jButton77,jButton78,jButton79);
              break;
          case 8:
              unhighlightBoard(jButton81,jButton82,jButton83,jButton84,jButton85,jButton86,jButton87,jButton88,jButton89);
              break;
          case 9:
              unhighlightBoard(jButton91,jButton92,jButton93,jButton94,jButton95,jButton96,jButton97,jButton98,jButton99);
              break;
      }
      
    }

    public void highlightBoard(javax.swing.JButton b1, javax.swing.JButton b2,javax.swing.JButton b3, javax.swing.JButton b4,javax.swing.JButton b5,javax.swing.JButton b6, javax.swing.JButton b7,javax.swing.JButton b8,javax.swing.JButton b9)
    {
       
       Border border = BorderFactory.createLineBorder(Color.RED);
       b1.setBorder(border);
       b2.setBorder(border);
       b3.setBorder(border);
       b4.setBorder(border);
       b5.setBorder(border);
       b6.setBorder(border);
       b7.setBorder(border);
       b8.setBorder(border);
       b9.setBorder(border);
        
    }
     public void unhighlightBoard(javax.swing.JButton b1, javax.swing.JButton b2,javax.swing.JButton b3, javax.swing.JButton b4,javax.swing.JButton b5,javax.swing.JButton b6, javax.swing.JButton b7,javax.swing.JButton b8,javax.swing.JButton b9)
    {
       
       Border border = BorderFactory.createLineBorder(Color.BLACK);
       b1.setBorder(border);
       b2.setBorder(border);
       b3.setBorder(border);
       b4.setBorder(border);
       b5.setBorder(border);
       b6.setBorder(border);
       b7.setBorder(border);
       b8.setBorder(border);
       b9.setBorder(border);
        
    }
   
    public void addAction(boolean moveCompleted)
    {
        Component[] comps= jPanel1.getComponents();
        for(Component comp :comps)
            if(comp instanceof javax.swing.JButton){
               javax.swing.JButton button = (javax.swing.JButton)comp;
               button.addActionListener(createAction(button));
            }
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton33.setBackground(new java.awt.Color(255, 255, 255));
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("3");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(255, 255, 255));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("1");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(255, 255, 255));
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("2");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(255, 255, 255));
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("6");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(255, 255, 255));
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("5");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(255, 255, 255));
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("4");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton61.setBackground(new java.awt.Color(255, 255, 255));
        jButton61.setForeground(new java.awt.Color(255, 255, 255));
        jButton61.setText("1");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(255, 255, 255));
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("8");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(255, 255, 255));
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("9");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(255, 255, 255));
        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jButton37.setText("7");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(255, 255, 255));
        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setText("4");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton67.setBackground(new java.awt.Color(255, 255, 255));
        jButton67.setForeground(new java.awt.Color(255, 255, 255));
        jButton67.setText("7");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton91.setBackground(new java.awt.Color(255, 255, 255));
        jButton91.setForeground(new java.awt.Color(255, 255, 255));
        jButton91.setText("1");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton94.setBackground(new java.awt.Color(255, 255, 255));
        jButton94.setForeground(new java.awt.Color(255, 255, 255));
        jButton94.setText("4");
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });

        jButton97.setBackground(new java.awt.Color(255, 255, 255));
        jButton97.setForeground(new java.awt.Color(255, 255, 255));
        jButton97.setText("7");
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("2");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("3");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setForeground(java.awt.Color.white);
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(java.awt.Color.white);
        jButton6.setForeground(java.awt.Color.white);
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("4");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("5");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("6");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton5.setBackground(java.awt.Color.white);
        jButton5.setForeground(java.awt.Color.white);
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.Color.white);
        jButton4.setForeground(java.awt.Color.white);
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(java.awt.Color.white);
        jButton7.setForeground(java.awt.Color.white);
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(java.awt.Color.white);
        jButton8.setForeground(java.awt.Color.white);
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(java.awt.Color.white);
        jButton9.setForeground(java.awt.Color.white);
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("7");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(255, 255, 255));
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("8");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(255, 255, 255));
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("9");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton51.setBackground(new java.awt.Color(255, 255, 255));
        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jButton51.setText("1");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setBackground(new java.awt.Color(255, 255, 255));
        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setText("2");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(255, 255, 255));
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setText("3");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(255, 255, 255));
        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setText("3");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(255, 255, 255));
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("2");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(255, 255, 255));
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("1");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(255, 255, 255));
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("4");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(255, 255, 255));
        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setText("5");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(255, 255, 255));
        jButton46.setForeground(new java.awt.Color(255, 255, 255));
        jButton46.setText("6");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(255, 255, 255));
        jButton56.setForeground(new java.awt.Color(255, 255, 255));
        jButton56.setText("6");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton54.setBackground(new java.awt.Color(255, 255, 255));
        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setText("4");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setBackground(new java.awt.Color(255, 255, 255));
        jButton55.setForeground(new java.awt.Color(255, 255, 255));
        jButton55.setText("5");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton71.setBackground(new java.awt.Color(255, 255, 255));
        jButton71.setForeground(new java.awt.Color(255, 255, 255));
        jButton71.setText("1");
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jButton72.setBackground(new java.awt.Color(255, 255, 255));
        jButton72.setForeground(new java.awt.Color(255, 255, 255));
        jButton72.setText("2");
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.setBackground(new java.awt.Color(255, 255, 255));
        jButton73.setForeground(new java.awt.Color(255, 255, 255));
        jButton73.setText("3");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setBackground(new java.awt.Color(255, 255, 255));
        jButton74.setForeground(new java.awt.Color(255, 255, 255));
        jButton74.setText("4");
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setBackground(new java.awt.Color(255, 255, 255));
        jButton75.setForeground(new java.awt.Color(255, 255, 255));
        jButton75.setText("5");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.setBackground(new java.awt.Color(255, 255, 255));
        jButton76.setForeground(new java.awt.Color(255, 255, 255));
        jButton76.setText("6");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.setBackground(new java.awt.Color(255, 255, 255));
        jButton77.setForeground(new java.awt.Color(255, 255, 255));
        jButton77.setText("7");
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.setBackground(new java.awt.Color(255, 255, 255));
        jButton78.setForeground(new java.awt.Color(255, 255, 255));
        jButton78.setText("8");
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton79.setBackground(new java.awt.Color(255, 255, 255));
        jButton79.setForeground(new java.awt.Color(255, 255, 255));
        jButton79.setText("9");
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(255, 255, 255));
        jButton47.setForeground(new java.awt.Color(255, 255, 255));
        jButton47.setText("7");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton57.setBackground(new java.awt.Color(255, 255, 255));
        jButton57.setForeground(new java.awt.Color(255, 255, 255));
        jButton57.setText("7");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(255, 255, 255));
        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setText("8");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setBackground(new java.awt.Color(255, 255, 255));
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setText("9");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton58.setBackground(new java.awt.Color(255, 255, 255));
        jButton58.setForeground(new java.awt.Color(255, 255, 255));
        jButton58.setText("8");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(255, 255, 255));
        jButton59.setForeground(new java.awt.Color(255, 255, 255));
        jButton59.setText("9");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton84.setBackground(new java.awt.Color(255, 255, 255));
        jButton84.setForeground(new java.awt.Color(255, 255, 255));
        jButton84.setText("4");
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });

        jButton81.setBackground(new java.awt.Color(255, 255, 255));
        jButton81.setForeground(new java.awt.Color(255, 255, 255));
        jButton81.setText("1");
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jButton87.setBackground(new java.awt.Color(255, 255, 255));
        jButton87.setForeground(new java.awt.Color(255, 255, 255));
        jButton87.setText("7");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        jButton82.setBackground(new java.awt.Color(255, 255, 255));
        jButton82.setForeground(new java.awt.Color(255, 255, 255));
        jButton82.setText("2");
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(255, 255, 255));
        jButton83.setForeground(new java.awt.Color(255, 255, 255));
        jButton83.setText("3");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton85.setBackground(new java.awt.Color(255, 255, 255));
        jButton85.setForeground(new java.awt.Color(255, 255, 255));
        jButton85.setText("5");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jButton86.setBackground(new java.awt.Color(255, 255, 255));
        jButton86.setForeground(new java.awt.Color(255, 255, 255));
        jButton86.setText("6");
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        jButton88.setBackground(new java.awt.Color(255, 255, 255));
        jButton88.setForeground(new java.awt.Color(255, 255, 255));
        jButton88.setText("8");
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton89.setBackground(new java.awt.Color(255, 255, 255));
        jButton89.setForeground(new java.awt.Color(255, 255, 255));
        jButton89.setText("9");
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton62.setBackground(new java.awt.Color(255, 255, 255));
        jButton62.setForeground(new java.awt.Color(255, 255, 255));
        jButton62.setText("2");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(255, 255, 255));
        jButton65.setForeground(new java.awt.Color(255, 255, 255));
        jButton65.setText("5");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton68.setBackground(new java.awt.Color(255, 255, 255));
        jButton68.setForeground(new java.awt.Color(255, 255, 255));
        jButton68.setText("8");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton92.setBackground(new java.awt.Color(255, 255, 255));
        jButton92.setForeground(new java.awt.Color(255, 255, 255));
        jButton92.setText("2");
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        jButton95.setBackground(new java.awt.Color(255, 255, 255));
        jButton95.setForeground(new java.awt.Color(255, 255, 255));
        jButton95.setText("5");
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });

        jButton98.setBackground(new java.awt.Color(255, 255, 255));
        jButton98.setForeground(new java.awt.Color(255, 255, 255));
        jButton98.setText("8");
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });

        jButton99.setBackground(new java.awt.Color(255, 255, 255));
        jButton99.setForeground(new java.awt.Color(255, 255, 255));
        jButton99.setText("9");
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });

        jButton96.setBackground(new java.awt.Color(255, 255, 255));
        jButton96.setForeground(new java.awt.Color(255, 255, 255));
        jButton96.setText("6");
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });

        jButton93.setBackground(new java.awt.Color(255, 255, 255));
        jButton93.setForeground(new java.awt.Color(255, 255, 255));
        jButton93.setText("3");
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        jButton69.setBackground(new java.awt.Color(255, 255, 255));
        jButton69.setForeground(new java.awt.Color(255, 255, 255));
        jButton69.setText("9");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton66.setBackground(new java.awt.Color(255, 255, 255));
        jButton66.setForeground(new java.awt.Color(255, 255, 255));
        jButton66.setText("6");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton63.setBackground(new java.awt.Color(255, 255, 255));
        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setText("3");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jButton99, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(126, 126, 126)
                                        .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
    
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
        int num=4;
    
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
        int num=1;
        
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
  
       
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
   
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
 
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
   
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
       
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed

    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
  
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
      
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
    
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
     
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
    
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
      
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton63ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ticTacToeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticTacToeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticTacToeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticTacToeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
               
                
            }
        });
    }


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
