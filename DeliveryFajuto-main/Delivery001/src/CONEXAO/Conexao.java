/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ifg
 */
public class Conexao {
    Connection conexao;
    
    private final String driver = "org.postgresql.Driver";
                                   //org.postgresql.Driver
    private final String url="jdbc:postgresql://localhost:5432/deliveyfajuto";
                              //jdbc:postgresql://localhost:5432/db_tadsifg
    private final String usuario="postgres";
    private final String senha="12345";
    
    public Connection conectarBanco()
    {
       
       try
       {
          Class.forName(driver);
         conexao = DriverManager.getConnection(url,usuario,senha);
          JOptionPane.showMessageDialog(null, "Conectado com sucesso!!");
       }catch(ClassNotFoundException drive)
        {
             JOptionPane.showMessageDialog(null, "Driver não encontrado "+drive);
        }
       catch(SQLException fonte)
       {
           JOptionPane.showMessageDialog(null,"Banco de Dados não encontrado "+fonte);
       }
       return conexao;
    }
    
}
