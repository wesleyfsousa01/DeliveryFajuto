/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DaoUsuario;
import java.util.ArrayList;
import java.util.List;
import MODEL.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class ControllerUsuario {
    DaoUsuario daouser = new DaoUsuario();

    List<Usuario> lista = new ArrayList<Usuario>();

    public void inserirUsuario(Usuario u) {

        if (!u.nome.equals("") && !u.senha.equals("") && !u.email.equals("") && u.tipo != 0) {
            daouser.salvarUsuario(u);
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios");
        }

    }

    public void editarUsuario(Usuario u) {

        if (!u.nome.equals("") && !u.senha.equals("") && !u.email.equals("") && u.tipo != 0) {
            daouser.alterarUsuario(u);
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!!!");
        }

    }

    public void deletarUsuario(int id) {

        //if()
        Object[] options = {"Confirmar", "Cancelar"};
        JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir este registro?", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if (options[0].equals("Confirmar")) {
            daouser.excluirUsuario(id);
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!!!! ");
        } else {
            //JOptionPane.showMessageDialog(null, "Escolha = "+options+"");
            return;
        }

    }

    public List<Usuario> recarregarLista() {
        lista.clear();
        lista = daouser.getUsuarios();
        return lista;
    }

}
