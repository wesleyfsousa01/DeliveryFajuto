/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONEXAO.Conexao;
import MODEL.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class DaoCliente {
    Connection conn;
    PreparedStatement pstm;
    
        public void salvarCliente(Cliente c)
    {
    conn= new Conexao().conectarBanco();
    try
    {
        
        pstm = conn.prepareStatement("INSERT INTO cliente(nome,cpf,endereco,id_cidade) VALUES (?,?,?,?)");
        pstm.setString(1, c.nome);
        pstm.setString(2, c.cpf);
        pstm.setString(3, c.endereco);
        pstm.setInt(4, c.id_cidade);
        pstm.execute();
    }   
    catch(SQLException errins)
    {
        JOptionPane.showMessageDialog(null, "Erro ao inserir um usuário no BD "+errins);
    }
    
    
}
        public int verificarIdCidade(String nome){
            conn = new Conexao().conectarBanco();
            int id = 0;
            try {
                pstm = conn.prepareStatement("select id from cidade where nome=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                pstm.setString(1, nome);
                ResultSet rs = pstm.executeQuery();
                if (rs.first()) {

                    id = rs.getInt("id");

                }
                pstm.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao buscar cidade no banco" + e);
            }
            return id;
        }
        
}
