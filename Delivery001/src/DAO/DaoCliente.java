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
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author wesley
 */
public class DaoCliente {
    Connection conn;
    PreparedStatement pstm;
    
    public int salvarCliente(Cliente c) {
        int id = 0;
        conn = new Conexao().conectarBanco();
        try {
            pstm = conn.prepareStatement("INSERT INTO cliente(nome,cpf,email) VALUES (?,?,?) returning id");
            pstm.setString(1, c.nome);
            pstm.setString(2, c.cpf);
            pstm.setString(3, c.email);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");

                JOptionPane.showMessageDialog(null, "O do cliente " + c.nome + " é: " + id);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir na tabela cliente <DaoCliente> " + e);
        } 
        return id;
    } 
     public List<Cliente> getClientes(){
     List<Cliente> lista = new ArrayList<Cliente>();
     conn = new Conexao().conectarBanco();
     try{
     pstm = conn.prepareStatement("SELECT * FROM cliente order by id",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     ResultSet rs = pstm.executeQuery();
     if(rs.first())
     {
         do{
            Cliente cliente = new Cliente();
            cliente.id = rs.getInt("id");
            cliente.email = rs.getString("email");
            cliente.nome = rs.getString(("nome"));
            cliente.cpf = rs.getString("cpf");
            
            lista.add(cliente);

         }while(rs.next());
     }
     pstm.close();
     }catch(SQLException e)
     {
         JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela Cliente: "+ e);
     }
     return lista;
    }
}
