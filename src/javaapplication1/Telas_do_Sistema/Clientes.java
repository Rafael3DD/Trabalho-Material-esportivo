
package Telas_do_Sistema;

import Classes_do_Sistema.Clienteclasse;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {

    public Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        Clienteclasse cli= new  Clienteclasse();
        this.setResizable(false);
        this.setSize(655, 444);
        
        
        nomecliente.enable(false);
        telefonecliente.enable(false);
        cpfcliente.enable(false);
        sexo.enable(false);
        cadastrar.setEnabled(false);
         
    }
    
    //Grava os arquivos
    public String gravar(String nome,String cpf,String sex,String telefone){
        try{
            FileWriter fw = new FileWriter("clientes.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome do cliente: " + nome.trim());
            pw.println("Telefone do cliente: " + telefone.trim());
            pw.println("Cpf do cliente: " + cpf.trim());
            pw.println("Produto: " + sex.trim());
            
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
        jproduto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomecliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        cadastrar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        novocad1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cpfcliente = new javax.swing.JFormattedTextField();
        telefonecliente = new javax.swing.JFormattedTextField();

        jproduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jproduto.setForeground(new java.awt.Color(0, 204, 51));
        jproduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproduto.setText("Entrada");
        jproduto.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jproduto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jproduto1.setForeground(new java.awt.Color(0, 204, 51));
        jproduto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproduto1.setText("Cadastro Cliente");
        jproduto1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        nomecliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomecliente.setText("Digite apenas letras.");
        nomecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeclienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Sexo:");

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        cadastrar.setForeground(new java.awt.Color(0, 153, 0));
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        sair.setForeground(new java.awt.Color(204, 0, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        novocad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/cadastro.png"))); // NOI18N
        novocad1.setText("Novo Cadastro");
        novocad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novocad1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "CPF", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        try {
            cpfcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefonecliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonecliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(telefonecliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cpfcliente)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(novocad1)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
            .addComponent(jproduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jproduto1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novocad1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrar)
                            .addComponent(sair)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Clienteclasse cli= new  Clienteclasse();
        
        cli.setNome(nomecliente.getText());
        cli.setCpf(cpfcliente.getText());
        cli.setSexo((String) sexo.getSelectedItem());
        cli.setTelefone(telefonecliente.getText());
        
        DefaultTableModel orcamento = (DefaultTableModel) jTable1.getModel();
        Object [] dados_cliente ={
        cli.getNome(),
        cli.getTelefone(),
        cli.getCpf(),
        cli.getSexo(),
        };

        String nome1;
        String Telefone, cpf;
        try{
        nome1 = cli.getNome();
        Telefone = (cli.getTelefone());
        cpf =(cli.getCpf());
        

        if(cpf.length() > 14 || cpf.length() <14){
            throw new Exception("Digite apenas 11 caracteres");
        }
         if(Telefone.length() > 14 || Telefone.length() <14){
            throw new Exception("Digite apenas 11 caracteres");
        }
        
        for(int i = 0; i < nome1.length(); i++){
                Character caractere = nome1.charAt(i);    
                 if(Character.isDigit(caractere))
                    throw new Exception("Digite apenas letras no nome!!");
        }
        
        orcamento.addRow(dados_cliente); 
        gravar(cli.getNome(), cli.getCpf(), cli.getSexo(), cli.getTelefone());
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!\n");
        
        } catch(Exception ex){

        JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!"
        + "\nClique em Novo cadastro para tentar novamente.","ERRO",JOptionPane.ERROR_MESSAGE);
        
        }

        nomecliente.enable(true);
        telefonecliente.enable(true);
        cpfcliente.enable(true);
        sexo.enable(true);
        novocad1.setEnabled(true);
        
        sexo.setEnabled(false);
        nomecliente.enable(false);
        telefonecliente.enable(false);
        cpfcliente.enable(false);
        sexo.enable(false);
        cadastrar.setEnabled(false);

    }//GEN-LAST:event_cadastrarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
    Object[] options = {"Sim", "Não"};
     String mensagem = "escolha uma opção";
     int resposta = JOptionPane.showOptionDialog(null,"Deseja Sair?",mensagem,
     JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
     if(resposta ==0){
           this.dispose();
     }
      
        
    }//GEN-LAST:event_sairActionPerformed

    private void novocad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novocad1ActionPerformed
        nomecliente.enable(true);
        telefonecliente.enable(true);
        cpfcliente.setEnabled(true);
        sexo.setEnabled(true);
        novocad1.setEnabled(false);
        cadastrar.setEnabled(true);
        nomecliente.requestFocus();
        nomecliente.setText("");
        telefonecliente.setText("");
        cpfcliente.setText("");
    }//GEN-LAST:event_novocad1ActionPerformed

    private void nomeclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeclienteActionPerformed

    public static void main(String args[]) {
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JFormattedTextField cpfcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jproduto;
    private javax.swing.JLabel jproduto1;
    private javax.swing.JTextField nomecliente;
    private javax.swing.JButton novocad1;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JFormattedTextField telefonecliente;
    // End of variables declaration//GEN-END:variables
}
