
package Telas_do_Sistema;

import Classes_do_Sistema.Saidaclasse;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Saida extends javax.swing.JFrame {

    public Saida() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(655, 444);
        data2.enable(false);
        jComboBox2.enable(false);
        valor2.enable(false);
        confirmar2.setEnabled(false);
    }
    public String gravar(String data, String valor, String tipo){
        try{
            
            
            FileWriter fw = new FileWriter("Saida.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Data: " + data.trim());
            pw.println("Preço: R$" + valor.trim());
            pw.println("Tipo: " + tipo.trim());

            pw.println("-------------------------------------------");
            pw.flush();
            pw.close();
            fw.close();
            
        }catch(Exception e){
            return null;
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jproduto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jproduto1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        confirmar2 = new javax.swing.JButton();
        sair2 = new javax.swing.JButton();
        novocad4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        data2 = new javax.swing.JFormattedTextField();
        valor2 = new javax.swing.JFormattedTextField();

        jproduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jproduto.setForeground(new java.awt.Color(0, 204, 51));
        jproduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproduto.setText("Entrada");
        jproduto.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Escolha o tipo de entrada:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagamento", "venda" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jproduto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jproduto1.setForeground(new java.awt.Color(0, 204, 51));
        jproduto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproduto1.setText("Entrada");
        jproduto1.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Escolha o tipo de entrada:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagamento", "venda" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Data:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Valor:");

        confirmar2.setForeground(new java.awt.Color(0, 153, 0));
        confirmar2.setText("Confirmar");
        confirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar2ActionPerformed(evt);
            }
        });

        sair2.setForeground(new java.awt.Color(204, 0, 0));
        sair2.setText("Sair");
        sair2.setMaximumSize(new java.awt.Dimension(79, 23));
        sair2.setMinimumSize(new java.awt.Dimension(79, 23));
        sair2.setPreferredSize(new java.awt.Dimension(79, 23));
        sair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair2ActionPerformed(evt);
            }
        });

        novocad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/saida.png"))); // NOI18N
        novocad4.setText("Nova Saida");
        novocad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novocad4ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Valor", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTable4);

        try {
            data2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            valor2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        valor2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jproduto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(data2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(novocad4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sair2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jproduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(novocad4)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmar2)
                            .addComponent(sair2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addGap(51, 51, 51)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void confirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar2ActionPerformed
       //JOptionPane.showMessageDialog(null,"Entrada cadastrada com sucesso!\n");
    
        Saidaclasse sai = new Saidaclasse();
        sai.setData(data2.getText());
        sai.setTipo((String)jComboBox2.getSelectedItem());
        sai.setValor(valor2.getText());
        
        DefaultTableModel orcamento = (DefaultTableModel) jTable4.getModel();
        Object [] dados_saida ={
        sai.getData(), 
        sai.getValor(), 
        sai.getTipo()
        };

        String data1;
        String val;
        
        try{
        data1 = sai.getData();
        val = (sai.getValor());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        Date date = formatter.parse(data1);
        
        orcamento.addRow(dados_saida);
        gravar(sai.getData(), sai.getValor(), sai.getTipo());
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!\n");
       
        } catch(Exception ex){

        JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!"
        + "\nClique em Novo cadastro para tentar novamente.","ERRO",JOptionPane.ERROR_MESSAGE);
       
        } 
     
        
        data2.enable(true);
        jComboBox2.enable(true);
        valor2.enable(true);
        novocad4.setEnabled(true);
        
        
    
        data2.setText("00/00/0000");
        jComboBox2.setSelectedItem("");
        valor2.setText("Digite apenas números");
        
        
        data2.setEnabled(false);
        jComboBox2.enable(false);
        valor2.enable(false);
        confirmar2.setEnabled(false);
    }//GEN-LAST:event_confirmar2ActionPerformed

    private void sair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair2ActionPerformed
    Object[] options = {"Sim", "Não"};
     String mensagem = "escolha uma opção";
     int resposta = JOptionPane.showOptionDialog(null,"Deseja Sair?",mensagem,
     JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
     if(resposta ==0){
           this.dispose();
     }
    }//GEN-LAST:event_sair2ActionPerformed

    private void novocad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novocad4ActionPerformed
        data2.setText("");
        jComboBox2.setSelectedItem("");
        valor2.setText("");
        
        data2.enable(true);
        jComboBox2.enable(true);
        valor2.enable(true);
        novocad4.setEnabled(false);
        confirmar2.setEnabled(true);
        
    }//GEN-LAST:event_novocad4ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Saida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar2;
    private javax.swing.JFormattedTextField data2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel jproduto;
    private javax.swing.JLabel jproduto1;
    private javax.swing.JButton novocad4;
    private javax.swing.JButton sair2;
    private javax.swing.JFormattedTextField valor2;
    // End of variables declaration//GEN-END:variables
}
