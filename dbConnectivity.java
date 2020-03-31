/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author imamah
 */
public class dbConnectivity {
     Connection con;
    Statement stmt;
    
    dbConnectivity() //cons
    {
        try
        {
             String s = "jdbc:sqlserver://localhost:1433;databaseName=ticTacToe [noorish on db_accessadmin]";
             con = DriverManager.getConnection(s,"noorish","321");

            stmt = con.createStatement(); 
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
     void displayAll()
    {
        try
        {
            ResultSet rs = stmt.executeQuery("select * from UsrRecord");
             while(rs.next())
             {
                 
                System.out.println(rs.getString(1)+"  "+rs.getInt(2));
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
       void insertUser(String name, int score)
    {
        try
        {
            stmt.executeUpdate("insert into candy ("+name+","+score+")" );
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
