/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author nhduo
 */
public class DBConnect {
    String connectionUrl = "jdbc:sqlserver://URIFALLON\\MSSQLSERVER01:1433;databaseName=QuanNet;user=sa;password=admin123;encrypt= false" ;
    Connection con;
    public DBConnect(){
        try {
            con = DriverManager.getConnection(connectionUrl);
            if(con != null){
                System.out.print("success");
            }
        } catch (Exception e) {
            System.out.print("Error\n");
        }
    }
    // get values
    public ResultSet ExcuteQueryGet(String query){
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            return rs;
        } catch (Exception e) {
                System.out.print("Error Get");
        }
        return null;
    }
    // insert edit add ...
    public void ExcuteQuerySet(String query){
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
        } catch (Exception e) {
                System.out.print("Error Set");
        }
    }
}

