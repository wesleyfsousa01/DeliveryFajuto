/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VIEW;
import MODEL.Usuario;
import VIEW.FrmPrincipal;
import java.util.Locale;
import CONTROLLER.ControllerUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wesley Ferreira
 */
public class FrmCadastroUsuario extends javax.swing.JInternalFrame {
    ControllerUsuario controle =  new ControllerUsuario();
     List<Usuario> listausu = new ArrayList<Usuario>();
     int indice=0;
    /**
     * Creates new form FrmCadastroUsuario
     */
    public FrmCadastroUsuario() {
        initComponents();
        setLocation(250, 50);
        listausu = controle.recarregarLista();
        if(listausu.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Não existem usuários cadastrados");
        }
        else{
            mostrarDadosTela();
            preencherTabela();
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxGrupo01 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JTextField();
        txtEmailUsuario = new javax.swing.JTextField();
        radioAdmin = new javax.swing.JRadioButton();
        radioComum = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Delivery-Fajuto");

        jScrollPane1.setBackground(new java.awt.Color(67, 66, 67));

        jPanel1.setBackground(new java.awt.Color(4, 41, 64));

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Nome", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuario.setOpaque(false);
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        tblUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblUsuarioKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuario);
        if (tblUsuario.getColumnModel().getColumnCount() > 0) {
            tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblUsuario.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblUsuario.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        jPanel2.setBackground(new java.awt.Color(4, 41, 64));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(168, 255, 140), new java.awt.Color(168, 255, 140), new java.awt.Color(168, 255, 140), new java.awt.Color(168, 255, 140)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(168, 255, 140));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(168, 255, 140));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(168, 255, 140));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Senha");

        txtNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSenhaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenhaUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEmailUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmailUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbxGrupo01.add(radioAdmin);
        radioAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioAdmin.setForeground(new java.awt.Color(168, 255, 140));
        radioAdmin.setText("Admin");
        radioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdminActionPerformed(evt);
            }
        });

        cbxGrupo01.add(radioComum);
        radioComum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioComum.setForeground(new java.awt.Color(168, 255, 140));
        radioComum.setText("Comum");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(168, 255, 140));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tipo");

        btnLimpar.setBackground(new java.awt.Color(159, 193, 49));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(159, 193, 49));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(159, 193, 49));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(159, 193, 49));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(168, 255, 140));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ID");

        txtIdUsuario.setEditable(false);
        txtIdUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioAdmin)
                            .addComponent(radioComum)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(txtEmailUsuario)
                            .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioAdmin))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioComum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(19, 19, 19))
        );

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(168, 255, 140));
        jLabel1.setText("Usuários");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(168, 255, 140));
        jLabel7.setText("Cadastrar Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAdminActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtIdUsuario.setText("");
        txtNomeUsuario.setText("");
        txtEmailUsuario.setText("");
        txtSenhaUsuario.setText("");
        cbxGrupo01.clearSelection();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Usuario usu = new Usuario();
        usu.nome = txtNomeUsuario.getText();
        usu.email =  txtEmailUsuario.getText();
        usu.senha = txtSenhaUsuario.getText();
        if(radioAdmin.isSelected())
        {
            usu.tipo = 1;
        }
        if(radioComum.isSelected())
        {
            usu.tipo =2;
        }
        controle.inserirUsuario(usu);
        listausu = controle.recarregarLista();
        mostrarDadosTela();
        preencherTabela();
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        
        int id = Integer.parseInt(txtIdUsuario.getText());
        String senha = txtSenhaUsuario.getText();
        controle.deletarUsuario(id);
        listausu = controle.recarregarLista();
        mostrarDadosTela();
        preencherTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Usuario usu = new Usuario();
        usu.id = Integer.parseInt(txtIdUsuario.getText());
        usu.nome = txtNomeUsuario.getText();
        usu.email =  txtEmailUsuario.getText();
        usu.senha = txtSenhaUsuario.getText();
        if(radioAdmin.isSelected())
        {
            usu.tipo = 1;
        }
        if(radioComum.isSelected())
        {
            usu.tipo =2;
        }
        controle.editarUsuario(usu);
        listausu = controle.recarregarLista();
        mostrarDadosTela();
        preencherTabela();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        preencherFormByTable();
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void tblUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUsuarioKeyReleased
        if(evt.getKeyCode()== 38 || evt.getKeyCode()==40)
        {
            preencherFormByTable();
        }
    }//GEN-LAST:event_tblUsuarioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup cbxGrupo01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioComum;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

public void mostrarDadosTela(){
    txtIdUsuario.setText(""+listausu.get(indice).id);
    txtNomeUsuario.setText(listausu.get(indice).nome);
    txtEmailUsuario.setText(listausu.get(indice).email);
    //txtSenhaUsuario.setText(listausu.get(indice).senha);
    if(listausu.get(indice).tipo == 1)
    {
        radioAdmin.setSelected(true);
    }
    else{
        radioComum.setSelected(true);
    }
}

public void preencherTabela()
{
    tblUsuario.getColumnModel().getColumn(0);
    tblUsuario.getColumnModel().getColumn(1);
    tblUsuario.getColumnModel().getColumn(2);
    tblUsuario.getColumnModel().getColumn(3);
    
    DefaultTableModel modelo = (DefaultTableModel)tblUsuario.getModel();
    modelo.setNumRows(0);//Limpar Tabela
    
    for(int i=0;i<listausu.size();i++){
        modelo.addRow(new Object[]{
            listausu.get(i).id,
            listausu.get(i).tipo,
            listausu.get(i).nome,
            listausu.get(i).email,
        });
    }
    
       
}
public void preencherFormByTable()
{
    int linechoose = tblUsuario.getSelectedRow();
    txtIdUsuario.setText(tblUsuario.getValueAt(linechoose, 0).toString());
    if(tblUsuario.getValueAt(linechoose, 1).equals(1)){
        radioAdmin.setSelected(true);
    }
    else{
        radioComum.setSelected(true);
    }
    txtNomeUsuario.setText(tblUsuario.getValueAt(linechoose, 2).toString());
    txtEmailUsuario.setText(tblUsuario.getValueAt(linechoose, 3).toString());
    txtSenhaUsuario.setText("");
    
    
}


}
