/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansFilme;
import modeloBeans.BeansUsuario;
import modeloConnection.ConexaoDB;

/**
 *
 * @author backdoors
 */
public class DaoFilme {
    
    ConexaoDB conex = new ConexaoDB();
    BeansFilme modeloFilme = new BeansFilme();
       
    public BeansFilme Ler (int id) throws SQLException{
        
        BeansFilme filme = new BeansFilme();
        
        try {
            conex.conexao();
            PreparedStatement pst = null;
            ResultSet rs = null;        
            String sql = " SELECT *"
                        +" FROM filme"
                        +" WHERE id_filme="+id+"";
            
            pst = conex.connection.prepareStatement(sql);

            rs = pst.executeQuery();  

            while (rs.next()){
                filme.setNome(rs.getString("nome_filme"));
                filme.setDataLancamento(rs.getString("datal_filme"));
                filme.setDirecao(rs.getString("direcao_filme"));
                filme.setClassificacao(rs.getString("classificacao_filme"));
                filme.setGenero(rs.getString("genero_filme"));
                filme.setNacionalidade(rs.getString("nacionalidade_filme"));        
                filme.setIdioma(rs.getString("idioma_filme"));
                filme.setSinopse(rs.getString("sinopse_filme"));        
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao receber dados do banco!\nErro: "+ex.getMessage());
        }
       
        conex.desconecta();
        return filme;        
    }
    
}