package Telas_do_Sistema;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        menuproduto = new javax.swing.JMenuItem();
        menucliente = new javax.swing.JMenuItem();
        menupedido = new javax.swing.JMenuItem();
        Venda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/athlete-bike-black-and-white-cycle-260409 (1).jpg"))); // NOI18N

        Cadastro.setText("Cadastro");

        menuproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/cadastro.png"))); // NOI18N
        menuproduto.setText("Cadastrar produto");
        menuproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuprodutoActionPerformed(evt);
            }
        });
        Cadastro.add(menuproduto);

        menucliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/cliente.png"))); // NOI18N
        menucliente.setText("Cadastrar cliente");
        menucliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuclienteActionPerformed(evt);
            }
        });
        Cadastro.add(menucliente);

        menupedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/pedido.png"))); // NOI18N
        menupedido.setText("cadastrar pedido");
        menupedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupedidoActionPerformed(evt);
            }
        });
        Cadastro.add(menupedido);

        jMenuBar2.add(Cadastro);

        Venda.setText("Orçamento");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/orçamento.png"))); // NOI18N
        jMenuItem1.setText("orçamento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Venda.add(jMenuItem1);

        jMenuBar2.add(Venda);

        jMenu6.setText("Controle de Estoque");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/invet.png"))); // NOI18N
        jMenuItem2.setText("Tabela estoque");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar2.add(jMenu6);

        jMenu7.setText("Inventário");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/inventario.png"))); // NOI18N
        jMenuItem6.setText("Estoque");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuBar2.add(jMenu7);

        jMenu5.setText("Fluxo de caixa");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/entrada.png"))); // NOI18N
        jMenuItem4.setText("Entrada");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/saida.png"))); // NOI18N
        jMenuItem5.setText("Saída");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar2.add(jMenu5);

        jMenu2.setText("Venda");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/vend.png"))); // NOI18N
        jMenuItem3.setText("Venda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuprodutoActionPerformed
        Produtos p = new Produtos();
        p.setVisible(true);
        p.requestFocus();
    }//GEN-LAST:event_menuprodutoActionPerformed

    private void menupedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupedidoActionPerformed
        Pedidos pe = new Pedidos();
        pe.setVisible(true);
        pe.requestFocus();
    }//GEN-LAST:event_menupedidoActionPerformed

    private void menuclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuclienteActionPerformed
        Clientes c = new Clientes();
        c.setVisible(true);
        c.requestFocus();
    }//GEN-LAST:event_menuclienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Orçamentos o = new Orçamentos();
        o.setVisible(true);
        o.requestFocus();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       Venda v = new Venda();
       v.setVisible(true);
       v.requestFocus();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       Entrada en = new Entrada();
       en.setVisible(true);
       en.requestFocus();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Saida sa = new Saida();
        sa.setVisible(true);
        sa.requestFocus();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Estoque est = new Estoque();
        est.setVisible(true);
        est.requestFocus();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     Inventario inv = new Inventario();
     inv.setVisible(true);
     inv.requestFocus();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenu Venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem menucliente;
    private javax.swing.JMenuItem menupedido;
    private javax.swing.JMenuItem menuproduto;
    // End of variables declaration//GEN-END:variables
}
