/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DaoCliente;
import MODEL.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class ControllerCliente {
        DaoCliente cliente  = new DaoCliente();

    List<Cliente> lista = new ArrayList<Cliente>();

    public void inserirUsuario(Cliente c) {
        
        if (!c.nome.isBlank() && !c.cpf.isBlank()&& !c.endereco.isBlank() && c.id_cidade!=0) {
            cliente.salvarCliente(c);
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios");
        }

    }
}
