/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;
import CONEXAO.Conexao;
import java.util.ArrayList;
import MODEL.Endereco;
import DAO.DaoEndereco;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Ferreira <Wesleyfsousa01@gmail.com>
 */
public class ConrollerEndereco {
    DaoEndereco endereco = new DaoEndereco();
    ArrayList<Endereco> edr = new ArrayList<Endereco>();
    
    public void inserirEndereco(Endereco e){
        if(!e.cep.isBlank() && !e.numero.isBlank() && !e.complemento.isBlank()){
            endereco.salvarEndereco(e);
        }
        else{
            JOptionPane.showMessageDialog(null,"Erro ao transferir dadaos de endereço ControllerEndereco");
        }
    }
}
