/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DaoProduto;
import MODEL.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author Wesley Ferreira <Wesleyfsousa01@gmail.com>
 */
public class ControllerProduto {
    DAO.DaoProduto daoproduto = new DaoProduto();
    
    List<Produto> lista = new ArrayList<>();
    
    public void inserirProduto(Produto p){
        if (!p.urlFoto.isBlank() && !p.nome.isBlank() && !p.categoria.isBlank() && p.preco != 0 && !p.descricao.isBlank()) {
            daoproduto.salvarProduto(p);
            JOptionPane.showMessageDialog(null, "Produto "+p.nome+" cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Campos Obrigatórios em branco");
        }
}
    
    public List<Produto> recarregarListaProdutos(){
        lista.clear();
        lista = daoproduto.buscarProdutos();
        return lista;
    }
}