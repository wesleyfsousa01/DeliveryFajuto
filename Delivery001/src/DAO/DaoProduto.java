/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import MODEL.Produto;
import java.sql.*;
import CONEXAO.Conexao;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Ferreira <Wesleyfsousa01@gmail.com>
 */
public class DaoProduto {
    
    Connection conn = null;
    PreparedStatement pstm = null;
    
    public void salvarProduto(Produto p){
        
        conn = new Conexao().conectarBanco();
        
        try {
            pstm = conn.prepareStatement("insert into produto (nome,descricao,preco,qtd,foto,categoria) values (?,?,?,?,?,?)");
            pstm.setString(1, p.nome);
            pstm.setString(2, p.descricao);
            pstm.setDouble(3, p.preco);
            pstm.setInt(4, p.qtd);
            pstm.setString(5, p.urlFoto);
            pstm.setString(6, p.categoria);
            pstm.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir produto no banco de dados <DaoProduto>" + e);
        }
    }
    
}
