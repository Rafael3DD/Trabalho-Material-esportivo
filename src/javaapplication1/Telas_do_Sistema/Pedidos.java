
package Telas_do_Sistema;

import Classes_do_Sistema.Pedidoclasse;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pedidos extends javax.swing.JFrame {
    public Pedidos() {
        initComponents();
        this.setLocationRelativeTo(null);
        nomecliente.enable(false);
        idpedido.enable(false);
        cpfcliente.setEnabled(false);
        tipoproduto.setEnabled(false);
        Cadastrar.setEnabled(false);
        this.setSize(655, 444);
    }
    
    public String gravar(String nome,String id_pedido,String cpf_cliente,String tipo){
        try{
            FileWriter fw = new FileWriter("Pedidos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome do cliente: " + nome.trim());
            pw.println("Id do pedido:" + id_pedido.trim());
            pw.println("Cpf do cliente: " + cpf_cliente.trim());
            pw.println("Produto: " + tipo.trim());
            
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
        jLabel3 = new javax.swing.JLabel();
        tipoproduto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomecliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        novocad2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        cpfcliente = new javax.swing.JFormattedTextField();
        idpedido = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jproduto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jproduto1.setForeground(new java.awt.Color(0, 204, 51));
        jproduto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproduto1.setText("Cadastro Pedido");
        jproduto1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Id do pedido:");

        tipoproduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "camisas", "chuteiras", "Balança", "Bicicleta", "Tênis", "vitaminas", " ", " " }));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tipo do produto");

        Cadastrar.setForeground(new java.awt.Color(0, 153, 0));
        Cadastrar.setText("Confirmar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        sair.setForeground(new java.awt.Color(204, 0, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nome do cliente");

        nomecliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomecliente.setText("Digite apenas letras.");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("CPF do cliente:");

        novocad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/cadastro.png"))); // NOI18N
        novocad2.setText("Novo Cadastro");
        novocad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novocad2ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Do Cliente", "CPF Do Cliente", "Id Do Pedido", "Tipo do produto"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        try {
            cpfcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            idpedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jproduto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(nomecliente, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(idpedido))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipoproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(cpfcliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(novocad2)))
                        .addGap(43, 43, 43))))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jproduto1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(novocad2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cadastrar)
                            .addComponent(sair)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
    Pedidoclasse ped = new Pedidoclasse();
    ped.setNome_cliente(nomecliente.getText());
    ped.setCpf_cliente(cpfcliente.getText());
    ped.setId_pedido(idpedido.getText());
    ped.setTipo((String)tipoproduto.getSelectedItem());
   
    //gravar(ped.getNome_cliente(), ped.getCpf_cliente(), ped.getId_pedido(), ped.getTipo());
    
      DefaultTableModel orcamento = (DefaultTableModel) jTable3.getModel();
        Object [] dados_pedido ={
        ped.getNome_cliente(),
        ped.getCpf_cliente(),
        ped.getId_pedido(),
        ped.getTipo()
        };
     
   
     String nomec;
        String idprod, cpfc;
        try{
        nomec =  ped.getNome_cliente();
        idprod =(ped.getId_pedido());
        cpfc = (ped.getCpf_cliente());
       
      
        if(cpfc.length() > 14 || cpfc.length() <14){
            throw new Exception("Digite apenas 11 caracteres");
        }
        
        
        for(int i = 0; i < nomec.length(); i++){
                Character caractere = nomec.charAt(i);    
                 if(Character.isDigit(caractere))
                    throw new Exception("Digite apenas letras no nome!!");
        }
        
        orcamento.addRow(dados_pedido);
        gravar(ped.getNome_cliente(), ped.getCpf_cliente(), ped.getId_pedido(), ped.getTipo());
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!\n");
        
        } catch(Exception ex){

        JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!"
        + "\nClique em Novo cadastro para tentar novamente.","ERRO",JOptionPane.ERROR_MESSAGE);
       
        
        }
     
     
     nomecliente.enable(true);
     idpedido.enable(true);
     cpfcliente.setEnabled(true);
     tipoproduto.setEnabled(true);
     novocad2.setEnabled(true);
     
             
     nomecliente.setText("Digite apenas letras.");
     idpedido.setText("Digite apenas números.");
     cpfcliente.setText("Digite apenas números.");
     
     nomecliente.enable(false);
     idpedido.enable(false);
     cpfcliente.setEnabled(false);
     tipoproduto.setEnabled(false);
     Cadastrar.setEnabled(false);

    }//GEN-LAST:event_CadastrarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
    Object[] options = {"Sim", "Não"};
     String mensagem = "escolha uma opção";
     int resposta = JOptionPane.showOptionDialog(null,"Deseja Sair?",mensagem,
     JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
     if(resposta ==0){
           this.dispose();
     }
    }//GEN-LAST:event_sairActionPerformed

    private void novocad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novocad2ActionPerformed
        nomecliente.setText("");
        idpedido.setText("");
        cpfcliente.setText("");
        nomecliente.enable(true);
        nomecliente.requestFocus();
        idpedido.enable(true);
        cpfcliente.setEnabled(true);
        tipoproduto.setEnabled(true);
        novocad2.setEnabled(false);
        Cadastrar.setEnabled(true);
    }//GEN-LAST:event_novocad2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JFormattedTextField cpfcliente;
    private javax.swing.JFormattedTextField idpedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel jproduto1;
    private javax.swing.JTextField nomecliente;
    private javax.swing.JButton novocad2;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> tipoproduto;
    // End of variables declaration//GEN-END:variables
}
