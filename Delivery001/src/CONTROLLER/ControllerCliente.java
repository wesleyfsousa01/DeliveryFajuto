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

    public int inserirCliente(Cliente c) {
        int id =0;
        if (!c.nome.isBlank() && !c.cpf.isBlank() && !c.email.isBlank() && !c.senha.isBlank()) {
            id = cliente.salvarCliente(c);
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Dados do cliente em branco <ControllerCliente>!");
        }
        return id;

    }
    
    public List<Cliente> recarregarLista() {
    lista.clear();
    lista = cliente.getClientes();
    return lista;
    }

}
