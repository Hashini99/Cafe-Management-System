/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
/**
 *
 * @author Hashini
 */
public class tables {
    public static void main(String[]args)
    {
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobilenumber varchar(10),address varchar(200),password varchar(200),security varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
                   
                   
            Dboperations.setDataOrDelete(userTable,"User Table Created successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
