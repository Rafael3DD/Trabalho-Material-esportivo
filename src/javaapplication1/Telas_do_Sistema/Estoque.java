
package Telas_do_Sistema;

import Classes_do_Sistema.inventarioclasse;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Estoque extends javax.swing.JFrame {

    public Estoque() {
        initComponents();
        this.setLocationRelativeTo(null);
        prod();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jproduto1 = new javax.swing.JLabel();
        sair1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jproduto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jproduto1.setForeground(new java.awt.Color(0, 204, 51));
        jproduto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproduto1.setText("Estoque");
        jproduto1.setToolTipText("");

        sair1.setForeground(new java.awt.Color(204, 0, 0));
        sair1.setText("Sair");
        sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do produto", "Quantidade", "Código do produto"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jproduto1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jproduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair1ActionPerformed
        Object[] options = {"Sim", "Não"};
        String mensagem = "escolha uma opção";
        int resposta = JOptionPane.showOptionDialog(null,"Deseja Sair?",mensagem,
            JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(resposta ==0){
            this.dispose();
        }
    }//GEN-LAST:event_sair1ActionPerformed

    
    private void prod(){
        inventarioclasse invent = new inventarioclasse();

        String tipo[] = {"Camisa", "chuteira", "Balança", "Bicicleta", "Tênis", "Vitamina", "Mochila esportiva", "Camisa", "Camisa"};
        String quant[] = {"100","150","15","10","200","80", "89.90", "250.50", "199.99"};
        String cod[] = {"112", "554", "665","878", "988","228", "333", "121", "111"};
        String nome[] = {
        "Camisa Seleção Brasileira", "chuteira Nike", "Balança", "Bicicleta ", "Tênis Esportivo Adidas", " whey protein ", "Mochila Olympikus","Camisa Cruzeiro", "Camisa Atlético Mineiro" };
        for(int i = 0;i < nome.length; i++){
        invent.setNomeproduto(nome[i]);
        invent.setQuantidade(quant[i]);
        invent.setIdproduto(cod[i]);
       
        DefaultTableModel orcamento = (DefaultTableModel) jTable2.getModel();
        Object [] dados_produto ={
        invent.getNomeproduto(),
        invent.getQuantidade(),
        invent.getIdproduto(),
        };
        orcamento.addRow(dados_produto);

        }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jproduto1;
    private javax.swing.JButton sair1;
    // End of variables declaration//GEN-END:variables
}
