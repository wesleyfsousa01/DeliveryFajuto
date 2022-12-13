

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import CONEXAO.Conexao;

/**
 *
 * @author ifg
 */
public class DaoUsuario {
    Connection conn;
    PreparedStatement pstm;
    
         public int verificarUsuario(String nome, String senha){
        int resposta =0;
        conn = new Conexao().conectarBanco();
       try{
        pstm = conn.prepareStatement("SELECT tipo FROM usuario WHERE nome=? and senha=?", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        pstm.setString(1, nome);
        pstm.setString(2, senha);
        ResultSet rs = pstm.executeQuery();
        
        if(rs.first()){
         
               resposta = rs.getInt ("tipo");
         
        }
          pstm.close();
        }catch(SQLException err){
                JOptionPane.showMessageDialog(null,"Erro ao buscar dados da tabela de usuário"+err);
                }
       return resposta;
        
     }

}
