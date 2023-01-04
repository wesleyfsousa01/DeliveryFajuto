/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import CONEXAO.Conexao;
import java.sql.*;
import MODEL.Contato;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Ferreira <Wesleyfsousa01@gmail.com>
 */
public class Daocontato {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void SalvarContato(Contato c){
        conn = new Conexao().conectarBanco();
        
        try {
            pstm = conn.prepareStatement("INSERT INTO contato(tel, id_cliente)VALUES (?, ?)");
        
        pstm.setString(1, c.tel);
        pstm.setInt(2, c.id_cliente);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir na tabela endereço <DaoEndereco>" + e);
        }
    }
   
}
