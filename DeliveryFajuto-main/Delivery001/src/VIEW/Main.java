/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;
import CONEXAO.Conexao;
import DAO.DaoUsuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ifg
 */
public class Main {
    public static void main (String [] args){
        new Conexao().conectarBanco();
    }
}
