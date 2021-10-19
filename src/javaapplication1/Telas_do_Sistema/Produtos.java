
package Telas_do_Sistema;

import Classes_do_Sistema.Produtoclasse;
import java.awt.Color;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Produtos extends javax.swing.JFrame {

    public Produtos() {
        initComponents();
        this.setLocationRelativeTo(null);
        nomeproduto.enable(false);
        codproduto.enable(false); 
        nomeproduto.requestFocus();
        tipoprod.setEnabled(false);
        Cadastrar.setEnabled(false);
        this.setSize(655, 444);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

    }
   

    public String gravar(String nome,String codigo,String tipo){
        try{
            FileWriter fw = new FileWriter("Produtos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome do Produto: " + nome.trim());
            pw.println("Código do Produto: " + codigo.trim());
            pw.println("Tipo do Produto: " + tipo.trim());
            
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

        jproduto1 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        tipoprod = new javax.swing.JComboBox<>();
        nomeproduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        novocad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        codproduto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jproduto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jproduto1.setForeground(new java.awt.Color(0, 204, 51));
        jproduto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproduto1.setText("Cadastro Produto");
        jproduto1.setToolTipText("");

        sair.setForeground(new java.awt.Color(204, 0, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        Cadastrar.setForeground(new java.awt.Color(0, 153, 0));
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        tipoprod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "camisas", "chuteiras", "Balança", "Bicicleta", "Tênis", "vitaminas", " ", " " }));

        nomeproduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeproduto.setText("Digite apenas letras.");
        nomeproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeprodutoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Código do produto");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nome do produto:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tipo");

        novocad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/cadastro.png"))); // NOI18N
        novocad.setText("Novo Cadastro");
        novocad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novocadActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do produto", "Código do produto", "Tipo do produto"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        try {
            codproduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jproduto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(codproduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(novocad)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipoprod, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jproduto1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(novocad))
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipoprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sair)
                            .addComponent(Cadastrar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
    Object[] options = {"Sim", "Não"};
     String mensagem = "escolha uma opção";
     int resposta = JOptionPane.showOptionDialog(null,"Deseja Sair?",mensagem,
     JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
     if(resposta ==0){
           this.dispose();
     }
    }//GEN-LAST:event_sairActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
     Produtoclasse prod = new Produtoclasse();

     prod.setNome_produto(nomeproduto.getText());
     prod.setId_produto(codproduto.getText());
     prod.setTipo((String)tipoprod.getSelectedItem());

      DefaultTableModel orcamento = (DefaultTableModel) jTable2.getModel();
        Object [] dados_produto ={
        prod.getNome_produto(),
        prod.getId_produto(),
        prod.getTipo()
        };
      
        String nomep;
        int idprod;
        try{
        nomep = prod.getNome_produto();
        idprod = Integer.parseInt(prod.getId_produto());

        for(int i = 0; i < nomep.length(); i++){
                Character caractere = nomep.charAt(i);    
                 if(Character.isDigit(caractere))
                    throw new Exception("Digite apenas letras no nome!!");
        }
        
        orcamento.addRow(dados_produto);
        gravar(prod.getNome_produto(), prod.getId_produto(), prod.getTipo());
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!\n");
        
        } catch(Exception ex){

        JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!"
        + "\nClique em Novo cadastro para tentar novamente.","ERRO",JOptionPane.ERROR_MESSAGE);

        } 

    nomeproduto.enable(false);
    codproduto.enable(false);
    tipoprod.setEnabled(false);
    Cadastrar.setEnabled(false);
    nomeproduto.setText("Digite apenas letras.");
    codproduto.setText("Digite apenas números.");
    novocad.setEnabled(true);
     
     
     
    }//GEN-LAST:event_CadastrarActionPerformed

    private void novocadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novocadActionPerformed
    nomeproduto.setText("");
    codproduto.setText("");
    nomeproduto.enable(true);
    codproduto.enable(true);
    tipoprod.setEnabled(true);
    novocad.setEnabled(false);
    Cadastrar.setEnabled(true);
    
    }//GEN-LAST:event_novocadActionPerformed

    private void nomeprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeprodutoActionPerformed
        
    
    }//GEN-LAST:event_nomeprodutoActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JFormattedTextField codproduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jproduto1;
    private javax.swing.JTextField nomeproduto;
    private javax.swing.JButton novocad;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> tipoprod;
    // End of variables declaration//GEN-END:variables
}
