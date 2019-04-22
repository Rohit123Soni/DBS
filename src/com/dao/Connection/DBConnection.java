/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutaher Affan
 */
public class DBConnection {
    private static Connection con = null;
    public static Connection getConnection(){
            try {
                if(con==null){
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/academy_management","root","admin");
                }
            } catch (Exception e) {
                e.printStackTrace();
                }
        return con;
    }
}