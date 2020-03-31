/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author imamah
 */
public class highlight extends JPanel{
    
    
    public void drawing()
    {
         System.out.println("in paint");
        //paintComponent(null);
    }
    public void paintComponent(Graphics g)
    {
        //super.paintComponent(g);
        System.out.println("in bocx");
        g.drawRect(10, 10, 25, 10);
        g.setColor(Color.red);
        
    }
}
