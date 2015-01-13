/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifrn.edu.br.managedbean;

import ifrn.edu.br.model.bean.ClienteBean;
import ifrn.edu.br.model.dao.ClienteDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author 20131064110023
 */
@ManagedBean
public class ClienteManagedBean {
   private ClienteBean cliente;
   private ClienteDao  clientedao;

    public ClienteBean getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBean cliente) {
        this.cliente = cliente;
    }

    public ClienteDao getClientedao() {
        return clientedao;
    }

    public void setClientedao(ClienteDao clientedao) {
        this.clientedao = clientedao;
    }
    public void cadastrar(){
    try{
        this.clientedao = new ClienteDao();
        boolean chamacadastro = clientedao.cadastroCliente(cliente);
        if(chamacadastro){
            
        }
    }catch(ClassNotFoundException ex) {
        Logger.getLogger(ClienteManagedBean.class.getName()).log(Level.SEVERE,null , ex);
        }this.cliente = new ClienteBean();
    }
}
