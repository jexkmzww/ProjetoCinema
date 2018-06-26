/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConnection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author backdoors
 */
public class ConexaoDB {
    
    public Statement statement;
    public ResultSet resultSet;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/projetocinema";
    private String usuario = "postgres";
    private String senha = "dudu";
    public Connection connection;
    
    public void conexao (){
        try {
            System.setProperty("jdbc.Drivers", driver);
            connection = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados:\n" + ex.getMessage());
        }
    }
    
    public void executaSql (String sql){
        try {
            statement = connection.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o SQL:\n" + ex.getMessage());
        }
    }
    
    
    public void desconecta (){
        try {
            connection.close();
            //JOptionPane.showMessageDialog(null, "Database desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar com database:\n" +ex.getMessage());
        }
    }
    
}
