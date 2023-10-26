/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author nhduo
 */
public class DBConnect {
    protected Connection connection;
    public DBConnect(){
        try{
            String user ="sa";
            String password ="admin123";
            String url ="jdbc:sqlserver://URIFALLON\\MSSQLSERVER01:1433;databaseName=QuanNet;encrypt=true;trustServerCertificate=true"; 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException | SQLException e){
            Object ex = null;
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    
}
