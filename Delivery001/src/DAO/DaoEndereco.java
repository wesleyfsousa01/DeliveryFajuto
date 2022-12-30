/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import CONEXAO.Conexao;
import MODEL.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class DaoEndereco {
    
    Connection conn = null;
    PreparedStatement pstm = null;
    
    
    
    public void salvarEndereco(Endereco e){
        conn = new Conexao().conectarBanco();
        
        try {
            conn.prepareStatement("insert into table endereco(cep,bairro,rua,numero,complemento,uf,cidade,id_cliente values (?,?,?,?,?,?,?,?)");
            pstm.setString(1, e.cep);
            pstm.setString(2, e.bairro);
            pstm.setString(3, e.rua);
            pstm.setString(4, e.numero);
            pstm.setString(5, e.complemento);
            pstm.setString(6, e.uf);
            pstm.setString(7, e.cidade);
            pstm.setInt(8, e.id_cliente);
            pstm.execute();
            
            JOptionPane.showMessageDialog(null,"Endereço salvo com sucesso"+e);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar dados na tabela endereco Dao.endereco"+ erro);
        }
    }
}
