/*
 * Juliano Bernardi - Todos os direitos reservados
 */
package telas;

import dao.ServicoDAO;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vo.ServicoVO;

/**
 * Trabalho de Desenvolvimento de Sistemas 1
 *
 * @author Juliano Bernardi
 */
public class CadastroServico extends javax.swing.JFrame {

    private ResultSetTableModel tableModel;
    private final String QUERY_DEFAULT = "SELECT idservico, nome, tempopadrao, custopadrao FROM servico";

    /**
     * Formulario CadastroServico com agendamentos Seta o tableModel que da
     * visibilidade aos itens armazenados no banco Inicia os componentes
     */
    public CadastroServico() {
        initComponents();
        try {
            this.tableModel = new ResultSetTableModel(QUERY_DEFAULT);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL de montagem da tabela falhou!" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
        }
        this.jTable1.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_descricao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_custo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField_tempo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Usuário");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CADASTRO SERVICO");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        jTextField_Nome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NomeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Descrição:");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField_ID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_descricao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_descricaoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ID:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("Preço:");

        jTextField_custo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_custo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_custoActionPerformed(evt);
            }
        });
        jTextField_custo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_custoKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setText("Tempo padrão (min):");

        jTextField_tempo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_tempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tempoActionPerformed(evt);
            }
        });
        jTextField_tempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_tempoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Nome))
                            .addComponent(jTextField_descricao))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jTextField_custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jTextField_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que atualiza os dados dos campos conforme a ID selecionada na
     * jTable Faz uso da biblioteca externa
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            // TODO add your handling code here:
            ServicoVO vo = new ServicoVO();
            ServicoDAO dao = new ServicoDAO();

            int row = jTable1.getSelectedRow(); //Use getSelectedRows se vc permite seleção múltipla
            vo.setServico_id((int) jTable1.getValueAt(row, 0));
            dao.buscar(vo);

            jTextField_ID.setText(String.valueOf(vo.getServico_id()));
            jTextField_descricao.setText(String.valueOf(vo.getServico_descricao()));
            jTextField_Nome.setText(String.valueOf(vo.getServico_nome()));
            jTextField_tempo.setText(String.valueOf(vo.getServico_tempo()));
            jTextField_custo.setText(String.valueOf(vo.getServico_custo()));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * Ação do Botão Novo Zera os campos setando-os como vazio
     */
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextField_ID.setText("");
        jTextField_descricao.setText("");
        jTextField_Nome.setText("");
        jTextField_tempo.setText("");
        jTextField_custo.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    /**
     * Ação do Botão Salvar Cria um novo ou altera de acordo com o campo ID
     */
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        ServicoVO vo = new ServicoVO();

        vo.setServico_descricao(jTextField_descricao.getText());
        vo.setServico_nome(jTextField_Nome.getText());
        vo.setServico_tempo(Integer.parseInt(jTextField_tempo.getText()));
        vo.setServico_custo(Integer.parseInt(jTextField_custo.getText()));

        ServicoDAO dao = new ServicoDAO();

        if (jTextField_ID.getText().isEmpty()) {
            try {
                System.out.println("criando novo servico");
                dao.criar(vo);
                tableModel.setQuery(QUERY_DEFAULT);
            } catch (Exception e) {
                System.out.println(e);
            }

        } else {
            try {
                System.out.println("alterando servico");
                vo.setServico_id(Integer.parseInt(jTextField_ID.getText()));
                dao.alterar(vo);
                tableModel.setQuery(QUERY_DEFAULT);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    /**
     * Ação do Botão Excluir conforme serviço carregado Solicita confirmação de
     * exclusão
     */
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        ServicoVO vo = new ServicoVO();
        ServicoDAO dao = new ServicoDAO();
        vo.setServico_id(Integer.parseInt(jTextField_ID.getText()));
        int confirma = JOptionPane.showConfirmDialog(rootPane, "Confirma a exclusão?");
        if (confirma == 0) {
            try {
                dao.excluir(vo);
                tableModel.setQuery(QUERY_DEFAULT);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
        jTextField_ID.setText("");
        jTextField_descricao.setText("");
        jTextField_Nome.setText("");
        jTextField_tempo.setText("");
        jTextField_custo.setText("");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextField_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NomeActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_descricaoActionPerformed

    private void jTextField_custoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_custoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_custoActionPerformed

    private void jTextField_tempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tempoActionPerformed

    /**
     * Leitor de alterações no jTextField para limitação dados de entrada
     */
    private void jTextField_custoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_custoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        } else if (jTextField_custo.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_custoKeyTyped

    /**
     * Leitor de alterações no jTextField para limitação dados de entrada
     */
    private void jTextField_tempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tempoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        } else if (jTextField_tempo.getText().length() > 4) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_tempoKeyTyped

    /**
     * Da visibilidade ao frame CadastroServico()
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_custo;
    private javax.swing.JTextField jTextField_descricao;
    private javax.swing.JTextField jTextField_tempo;
    // End of variables declaration//GEN-END:variables
}
