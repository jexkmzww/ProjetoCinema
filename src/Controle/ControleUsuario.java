/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author backdoors
 */
public class ControleUsuario {
    
    ConexaoDB conex = new ConexaoDB();
    ModeloUsuario modeloUsuario = new ModeloUsuario();
    
    public void Gravar (ModeloUsuario modeloUsu){
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
    
}
