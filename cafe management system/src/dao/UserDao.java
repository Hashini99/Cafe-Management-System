/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.User;
/**
 *
 * @author Hashini
 */
public class UserDao {
    public static void save(User user){
        String query="insert into user(name,email,mobilenumber,address,password,security,answer,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobilenumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurity()+"','"+user.getAnswer()+"','false')";
        Dboperations.setDataOrDelete(query,"Registerd successfully wait for admin approval");
    }
    
}
