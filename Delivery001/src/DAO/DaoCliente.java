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
 * @author wesley
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
        pstm.execute();
    }   
    catch(SQLException errins)
    {
        JOptionPane.showMessageDialog(null, "Erro ao inserir um usuário no BD "+errins);
    }
    
    
}       
}
