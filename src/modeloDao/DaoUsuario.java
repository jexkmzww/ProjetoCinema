/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConnection.ConexaoDB;
import modeloBeans.BeansUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author backdoors
 */
public class DaoUsuario {
    
    ConexaoDB conex = new ConexaoDB();
    BeansUsuario modeloUsuario = new BeansUsuario();
    
    public void Gravar (BeansUsuario modeloUsu){
        conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("INSERT INTO usuario (nome_usu, sobrenome_usu, cpf_usu, login_usu, senha_usu, email_usu, telefone_usu) "
                    + "                                                VALUES (?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, modeloUsu.getNome());
            pst.setString(2, modeloUsu.getSobrenome());
            pst.setString(3, modeloUsu.getCpf());
            pst.setString(4, modeloUsu.getLogin());
            pst.setString(5, modeloUsu.getSenha());
            pst.setString(6, modeloUsu.getEmail());
            pst.setString(7, modeloUsu.getTelefone());         
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário gravado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados do usuário!\nErro: "+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public BeansUsuario buscaUsuario (BeansUsuario mod){
        conex.conexao();
        conex.executaSql("SELECT * FROM USUARIO WHERE cpf_usu LIKE '%" + mod.getPesquisa()+"%'");
        try {
            conex.resultSet.first();
            mod.setNome(conex.resultSet.getString("nome_usu"));
            mod.setSobrenome(conex.resultSet.getString("sobrenome_usu"));
            mod.setCpf(conex.resultSet.getString("cpf_usu"));
            mod.setLogin(conex.resultSet.getString("login_usu"));
            mod.setSenha(conex.resultSet.getString("senha_usu"));
            mod.setEmail(conex.resultSet.getString("email_usu"));
            mod.setTelefone(conex.resultSet.getString("telefone_usu"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário!\nErro: "+ex.getMessage());
        }        
        conex.desconecta();
        return mod;
    }
    
}
