/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifrn.edu.br.model.dao;

import ifrn.edu.br.model.bean.ClienteBean;
import ifrn.edu.br.model.conexao.Conexaobd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20131064110023
 */
public class ClienteDao {
    private Connection conexao;
    
    public ClienteDao()throws ClassNotFoundException{
        this.conexao = new Conexaobd().getConnection();
        System.out.println("Deu Tudo Certo!");
    }
    public boolean cadastroCliente(ClienteBean cliente){
        String bd = "INSERT INTO cliente (nome,telefone)"
                +"VALUES(?,?)";
        try(PreparedStatement ps = conexao.prepareStatement(bd)){
            ps.setString(1,cliente.getNome());
            ps.setString(2,cliente.getTelefone());
             int testar = ps.executeUpdate();
                 if(testar == 1){
            return true;
        }
        
        }catch(SQLException e){
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            if(conexao!=null){
                try{
                    conexao.close();
                }catch(SQLException ex){
                     Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE,null,ex);
                }
                System.out.println("Desconectado!");
            }
        }
            return false;
    }
  }
    

