/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.services;

import ca.servlets.models.User;

/**
 *service providers for account
 * @author Bruno
 */
public class AccountService {
    public User login(String username, String password){
        if (username == null)
            return null;
        
        if (username.equals("abe") && password.equals("password")) {
            User user = new User(username, password);
            return user;
        } else if (username.equals("barb") && password.equals("password")){
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }
    }
}
    
