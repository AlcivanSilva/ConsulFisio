/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifrn.edu.br.model.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 20131064110023
 */
public class Conexaobd {
     private String driver = "org.postgresql.Driver";
     private String url = "jdbc:postgresql://localhost/?", user = "postgres", password = "?";
     public Connection getConnection() throws ClassNotFoundException{
         try{
             Class.forName(driver);
             return DriverManager.getConnection(url,user,password);
         }catch(SQLException e){
             throw new RuntimeException(e);
         }
     }
}
