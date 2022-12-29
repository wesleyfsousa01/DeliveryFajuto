/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import CONEXAO.Conexao;
import MODEL.Endereco;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author wesle
 */
public class DaoEndereco {
    Connection conn ;
    PreparedStatement pstm;
    
    
    public void salvarEndereco(Endereco e){
        conn = new Conexao().conectarBanco();
        try {
            
        } catch (Exception e) {
            
        }
    }
}
