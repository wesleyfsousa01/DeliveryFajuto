

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
import MODEL.Usuario;

/**
 *
 * @author ifg
 */
public class DaoUsuario {
    Connection conn;
    PreparedStatement pstm;
    

         
    public int verificarUsuario(String nome, String senha)
    {
     int resposta =0;
     conn = new Conexao().conectarBanco();
     try{
     pstm = conn.prepareStatement("SELECT tipo FROM usuario WHERE nome=? and senha=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     pstm.setString(1,nome);
     pstm.setString(2, senha);
     ResultSet rs = pstm.executeQuery();
     if(rs.first())
     {
         
       resposta = rs.getInt("tipo");
         
     }
     pstm.close();
     }catch(SQLException err)
     {
         JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela usuário: "+err);
     }
     return resposta;
    }
    
    public void salvarUsuario(Usuario u)
    {
    conn= new Conexao().conectarBanco();
    try
    {
        
        pstm = conn.prepareStatement("INSERT INTO usuario(email,senha,nome,tipo) VALUES (?,?,?,?)");
        pstm.setString(1, u.email);
        pstm.setString(2, u.senha);
        pstm.setString(3, u.nome);
        pstm.setInt(4, u.tipo);
        pstm.execute();
    }   
    catch(SQLException errins)
    {
        JOptionPane.showMessageDialog(null, "Erro ao inserir um usuário no BD "+errins);
    }
    
    
}
    
   public void alterarUsuario(Usuario u)
{
    conn= new Conexao().conectarBanco();
    try
    {
        pstm = conn.prepareStatement("UPDATE usuario SET nome=?, senha=?,email=?,tipo=? WHERE id= ?");
        pstm.setString(1, u.nome);
        pstm.setString(2, u.senha);
        pstm.setString(3, u.email);
        pstm.setInt(4, u.tipo);
        pstm.setInt(5, u.id);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "O usuário "+u.nome+" foi alterado com sucesso!!!");
        
    }catch(SQLException erralt)
    {
        JOptionPane.showMessageDialog(null, "Erro ao alterar um usuário no BD "+erralt);
    }
    
    
}
   public void excluirUsuario(int id)
{
    conn= new Conexao().conectarBanco();
    
    
    try
    {
        pstm = conn.prepareStatement("DELETE FROM usuario WHERE id = ?");
        pstm.setInt(1, id);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "O usuário foi exlcuído com sucesso!!!");
        
    }catch(SQLException errexc)
    {
        JOptionPane.showMessageDialog(null, "Erro ao excluir um usuário no BD "+errexc);
    }
    
    
}

 public List<Usuario> getUsuarios(){
     List<Usuario> lista = new ArrayList<Usuario>();
     conn = new Conexao().conectarBanco();
     try{
     pstm = conn.prepareStatement("SELECT * FROM usuario order by id",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     ResultSet rs = pstm.executeQuery();
     if(rs.first())
     {
         do{
            Usuario usuario = new Usuario();
            usuario.id = rs.getInt("id");
            usuario.email = rs.getString("email");
            usuario.senha = rs.getString(("senha"));
            usuario.nome = rs.getString("nome");
            usuario.tipo = rs.getInt("tipo");
         
            lista.add(usuario);

         }while(rs.next());
     }
     pstm.close();
     }catch(SQLException err)
     {
         JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela usuário: "+err);
     }
     return lista;
    }
 }
