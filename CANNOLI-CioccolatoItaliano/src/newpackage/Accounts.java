/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
//NAME-SURNAME: RUKİYE SUEDA AKKUŞ
//NUMBER: 20212022041
//DEPARTMENT: SOFTWARE ENGINEERING
/**
 *
 * @author RUKIYE
 */

//i created this class to use inheritance and connect accounts between themselves 
public class Accounts {

    private String Username;
    private String Password;
    static ArrayList<Accounts> user_list = new ArrayList<>();//An array list for user accounts
    
    public Accounts() {
        //default constructor
    }

    public Accounts(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    //getter and setter method
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}
