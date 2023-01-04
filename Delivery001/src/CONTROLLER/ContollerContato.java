/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.Daocontato;
import java.util.ArrayList;
import MODEL.Contato;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Ferreira <Wesleyfsousa01@gmail.com>
 */
public class ContollerContato {
    Daocontato daoCtt = new Daocontato();
    ArrayList<Contato> ctt = new ArrayList<>();
    
    public void inserirContato(Contato c){
        if (!c.tel.isBlank() && c.id_cliente!=0) {
            daoCtt.SalvarContato(c);
        } else {
            JOptionPane.showConfirmDialog(null, "Erro ao inserir na tabela contato <ControllerContato>");
        }
    }
}
