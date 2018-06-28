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
import javax.swing.JOptionPane;

/**
 *
 * @author backdoors
 */
public class DaoUsuario {
    
    ConexaoDB conex = new ConexaoDB();
    BeansUsuario modeloUsuario = new BeansUsuario();
    
    public void Gravar (BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("INSERT INTO usuario (nome_usu, sobrenome_usu, cpf_usu, login_usu, senha_usu, email_usu, telefone_usu) "
                    + "                                                VALUES (?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSobrenome());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getLogin());
            pst.setString(5, mod.getSenha());
            pst.setString(6, mod.getEmail());
            pst.setString(7, mod.getTelefone());         
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário gravado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados do usuário!\nErro: "+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public BeansUsuario buscaUsuario (BeansUsuario mod){
        conex.conexao();
        conex.executaSql("SELECT * "
                + "       FROM usuario "
                + "       WHERE cpf_usu LIKE '%" + mod.getPesquisa()+"%'");
        try {
            conex.resultSet.first();
            mod.setId(conex.resultSet.getInt("id_usu"));
            mod.setNome(conex.resultSet.getString("nome_usu"));
            mod.setSobrenome(conex.resultSet.getString("sobrenome_usu"));
            mod.setCpf(conex.resultSet.getString("cpf_usu"));
            mod.setLogin(conex.resultSet.getString("login_usu"));
            mod.setSenha(conex.resultSet.getString("senha_usu"));
            mod.setEmail(conex.resultSet.getString("email_usu"));
            mod.setTelefone(conex.resultSet.getString("telefone_usu"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
        }        
        conex.desconecta();
        return mod;
    }
    
    public void Editar (BeansUsuario mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.connection.prepareStatement("UPDATE usuario"
                    + "                                                SET nome_usu=?, sobrenome_usu=?, cpf_usu=?, login_usu=?, senha_usu=?, email_usu=?, telefone_usu=?"
                    + "                                                WHERE id_usu=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSobrenome());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getLogin());
            pst.setString(5, mod.getSenha());
            pst.setString(6, mod.getEmail());
            pst.setString(7, mod.getTelefone());
            pst.setInt(8, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar usuário!\nErro: "+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void Excluir (BeansUsuario mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.connection.prepareStatement("DELETE FROM usuario"
                    + "                                                WHERE id_usu =?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\nErro: "+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
}
