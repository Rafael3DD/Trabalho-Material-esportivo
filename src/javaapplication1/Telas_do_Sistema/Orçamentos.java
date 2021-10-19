
package Telas_do_Sistema;

import Classes_do_Sistema.orçamentoclasse;
import java.awt.Color;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Orçamentos extends javax.swing.JFrame {

    public Orçamentos() {
       initComponents();
       
       this.setLocationRelativeTo(null);
       Nomecliente.enable(false);
       codigoprod.enable(false);
       desconto.enable(false);
       subtotal.enable(false);
       frete.enable(false);
       quantidade.enable(false);
       codigoorcamento.enable(false);
       valor.enable(false);

       jButtonboleto.setEnabled(false);
       jButtoncartao.setEnabled(false);
       jButtondinheiro.setEnabled(false);
       jComboproduto.enable(false);
       jCombovendedor.enable(false);
       jComboproduto.setEnabled(false);
       jCombovendedor.setEnabled(false);
       tipocart.setEnabled(false);
       jButton2.setEnabled(false);
       
       ButtonGroup btg = new ButtonGroup();
       btg.add(jButtonboleto);
       btg.add(jButtoncartao);
       btg.add(jButtondinheiro);
       jButtonboleto.setSelected(true);
       
       prod();
       vendedor();
       cartao();
       Nomecliente.setText("Digite apenas letras");
       quantidade.setText("Digite apenas números");
    }

    
    //grava os dados
    public String gravar(String cod_orcamento, String cod_prod,String desconto
        ,String forma, String frete, String nome_cliente, String preco
        ,String quant, String sub_total, String tipo_prod, String total
        ,String vendedor){
        try{
            FileWriter fw = new FileWriter("Orçamentos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println("Nome do cliente: " + nome_cliente);
            pw.println("Código do orçamento: " + cod_orcamento.trim());
            pw.println("Código do produto: " + cod_prod.trim());
            pw.println("Produto: " + tipo_prod.trim());
            pw.println("Quantidade: " + quant.trim());
            pw.println("Preço: R$" + preco.trim());
            pw.println("Forma de pagamento: " + forma.trim());
            pw.println("Desconto: " + desconto.trim());
            pw.println("Frete: " + frete.trim());
            pw.println("Sub-Total: R$" + sub_total.trim());
            pw.println("Total: R$" + total.trim());
            pw.println("Vendedor: " + vendedor.trim());
            pw.println("-------------------------------------------");
            pw.flush();
            pw.close();
            fw.close();
   
        }catch(Exception e){
            return null;
        }
        return null;
    }
   
    
    private void prod(){
        String prod [] ={
            "Chuteira Nike", "chuteira Adidas", "Camisa seleção brasileira Nike", 
            "bicicleta caloi", "vitamina", "balança"};
        
        for(int i = 0; i<prod.length;i++){
            jComboproduto.addItem(prod[i]);
        
        } 
    }

    private void cartao(){
         String cart[]= {
             "Visa", "MasterCard", "Elo", "American Express", "Hipercard"};
         
         for(int i = 0; i< cart.length;i++){
             tipocart.addItem(cart[i]);
         }     
         
     }
    
    
    private void vendedor(){
         String vendedor[]= {
             "Carlos Silva", "Carolina Japa", "Josealdo Alvaro", "Chico Bento", "Ariana Júnior", "clara lima"};
         
         for(int i = 0; i<vendedor.length;i++){
             jCombovendedor.addItem(vendedor[i]);
         }
         
     }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Nomecliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoorcamento = new javax.swing.JTextField();
        jCombovendedor = new javax.swing.JComboBox<>();
        jvendedor1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desconto = new javax.swing.JTextField();
        subtotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        frete = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        paineltotall = new javax.swing.JPanel();
        total = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboproduto = new javax.swing.JComboBox<>();
        jproduto = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        quantidade = new javax.swing.JTextField();
        codigoprod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        estoque = new javax.swing.JLabel();
        jButtonboleto = new javax.swing.JRadioButton();
        jButtondinheiro = new javax.swing.JRadioButton();
        jButtoncartao = new javax.swing.JRadioButton();
        tipocart = new javax.swing.JComboBox<>();
        jvendedor = new javax.swing.JLabel();
        forma = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(126, 225, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orçamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/orçamento.png"))); // NOI18N
        jButton1.setText("Novo Orçamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/Finalizar.png"))); // NOI18N
        jButton2.setText("Finalizar Orçamento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Nomecliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nomecliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NomeclienteFocusGained(evt);
            }
        });
        Nomecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeclienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome do cliente");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo do orçamento");
        jLabel2.setToolTipText("");

        codigoorcamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jCombovendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombovendedorActionPerformed(evt);
            }
        });

        jvendedor1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jvendedor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jvendedor1.setText("Vendedor");
        jvendedor1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Desconto %");
        jLabel3.setToolTipText("");

        desconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        subtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                subtotalFocusGained(evt);
            }
        });
        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sub-Total");
        jLabel4.setToolTipText("");

        frete.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Frete");
        jLabel5.setToolTipText("");

        paineltotall.setBackground(new java.awt.Color(0, 153, 153));
        paineltotall.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        total.setBackground(new java.awt.Color(0, 153, 153));
        total.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("0");
        total.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("R$:");

        javax.swing.GroupLayout paineltotallLayout = new javax.swing.GroupLayout(paineltotall);
        paineltotall.setLayout(paineltotallLayout);
        paineltotallLayout.setHorizontalGroup(
            paineltotallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineltotallLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        paineltotallLayout.setVerticalGroup(
            paineltotallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineltotallLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineltotallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jComboproduto.setToolTipText("");
        jComboproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboprodutoActionPerformed(evt);
            }
        });

        jproduto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jproduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jproduto.setText("Produto");
        jproduto.setToolTipText("");

        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Sair");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Preço do produto");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quantidade");
        jLabel7.setToolTipText("");

        valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        quantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantidadeFocusGained(evt);
            }
        });
        quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeActionPerformed(evt);
            }
        });

        codigoprod.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Código do produto:");
        jLabel9.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        estoque.setBackground(new java.awt.Color(0, 153, 153));
        estoque.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        estoque.setForeground(new java.awt.Color(255, 255, 255));
        estoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estoque.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(estoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jButtonboleto.setBackground(new java.awt.Color(126, 225, 216));
        jButtonboleto.setText("Boleto");
        jButtonboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonboletoActionPerformed(evt);
            }
        });

        jButtondinheiro.setBackground(new java.awt.Color(126, 225, 216));
        jButtondinheiro.setText("Dinheiro");
        jButtondinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondinheiroActionPerformed(evt);
            }
        });

        jButtoncartao.setBackground(new java.awt.Color(126, 225, 216));
        jButtoncartao.setText("Cartão");
        jButtoncartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncartaoActionPerformed(evt);
            }
        });

        tipocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipocartActionPerformed(evt);
            }
        });

        jvendedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jvendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jvendedor.setText("Forma de pagamento");
        jvendedor.setToolTipText("");

        forma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        forma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forma.setText("Forma");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Compras acima de R$100 tem frete grátis!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desconto)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Nomecliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoorcamento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantidade, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboproduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jproduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jvendedor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jCombovendedor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(codigoprod, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(49, 49, 49)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonboleto)
                                        .addGap(16, 16, 16)
                                        .addComponent(jButtondinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tipocart, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtoncartao)))
                                    .addComponent(jvendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(paineltotall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoorcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jComboproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jvendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCombovendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonboleto)
                                            .addComponent(jButtondinheiro)
                                            .addComponent(jButtoncartao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tipocart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(forma)
                                .addGap(15, 15, 15)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(paineltotall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(codigoprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(frete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(97, 97, 97)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton4)
                        .addGap(111, 111, 111))))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod_orçamento", "Nome do cliente", "Produto", "Cod_produto", "Quantidade", "preço", "Pagamento", "Desconto", "Frete", "Sub-Total", "Total"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncartaoActionPerformed
        String ca = "5% de desconto com cartão ";
        forma.setText(ca);
        tipocart.setEnabled(true);
    }//GEN-LAST:event_jButtoncartaoActionPerformed

    private void jButtondinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondinheiroActionPerformed
        forma.setText("15% de desconto com dinheiro");
        tipocart.setEnabled(false);
    }//GEN-LAST:event_jButtondinheiroActionPerformed

    private void jButtonboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonboletoActionPerformed
        forma.setText("10% de desconto com boleto");
        tipocart.setEnabled(false);
    }//GEN-LAST:event_jButtonboletoActionPerformed

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
        
        
    }//GEN-LAST:event_quantidadeActionPerformed

    private void quantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantidadeFocusGained

    }//GEN-LAST:event_quantidadeFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object[] options = {"Sim", "Não"};
        String mensagem = "escolha uma opção";
        int resposta = JOptionPane.showOptionDialog(null,"Deseja Sair?",mensagem,
            JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(resposta ==0){
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboprodutoActionPerformed
        switch(jComboproduto.getSelectedIndex()){
            case 0:
            valor.setText("299.99");
            estoque.setText("100");
            quantidade.setText("");
            quantidade.requestFocus();
            codigoprod.setText("112");
            desconto.setText("0");
            frete.setText("0");
            subtotal.setText("0");

            break;
            case 1:
            valor.setText("259.90");
            estoque.setText("103");
            quantidade.setText("");
            quantidade.requestFocus();
            codigoprod.setText("223");
            desconto.setText("0");
            frete.setText("0");
            subtotal.setText("0");
            break;
            case 2:
            valor.setText("200.99");
            estoque.setText("1000");
            quantidade.setText("");
            quantidade.requestFocus();
            codigoprod.setText("333");
            desconto.setText("0");
            frete.setText("0");
            subtotal.setText("0");
            break;
            case 3:
            valor.setText("299.99");
            estoque.setText("20");
            quantidade.setText("");
            quantidade.requestFocus();
            codigoprod.setText("555");
            desconto.setText("0");
            frete.setText("0");
            subtotal.setText("0");
            break;
            case 4:
            valor.setText("80.99");
            estoque.setText("500");
            quantidade.setText("");
            quantidade.requestFocus();
            codigoprod.setText("888");
            desconto.setText("0");
            frete.setText("0");
            subtotal.setText("0");
            break;
            case 5:
            valor.setText("299.99");
            estoque.setText("30");
            quantidade.setText("");
            quantidade.requestFocus();
            codigoprod.setText("101");
            desconto.setText("0");
            frete.setText("0");
            subtotal.setText("0");
            break;
        }

    }//GEN-LAST:event_jComboprodutoActionPerformed

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalActionPerformed

    private void subtotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subtotalFocusGained
        double quant = Double.parseDouble(quantidade.getText());
        double val = Double.parseDouble(valor.getText());
        double porcent = Double.parseDouble(desconto.getText());
        double val1 = Double.parseDouble(valor.getText());
       
        float soma = (float) (quant*val);
        float calculo_p = (float) ((soma*porcent)/100);
        float tota = (float)(soma - calculo_p);
        
       
        //se o total for maior que 100 ele acrescenta 30 reais de frete
        if(tota > 100){
            frete.setText("");
        }else{
            frete.setText(String.valueOf(30));
            tota = tota +30;
        }

        subtotal.setText(String.valueOf(tota));
        total.setText(String.valueOf(tota));
 
    }//GEN-LAST:event_subtotalFocusGained

    private void jCombovendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombovendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombovendedorActionPerformed

    private void NomeclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeclienteActionPerformed

    }//GEN-LAST:event_NomeclienteActionPerformed

    private void NomeclienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NomeclienteFocusGained
        // Nomecliente.setBackground(Color.LIGHT_GRAY);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_NomeclienteFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        orçamentoclasse orca = new orçamentoclasse();

        
        
        orca.setCodigo_orcamento(codigoorcamento.getText());
        orca.setCodigo_prod(codigoprod.getText());
        orca.setDesc(desconto.getText());
        orca.setForma(forma.getText());
        orca.setFrete(frete.getText());
        orca.setNome_cliente(Nomecliente.getText());
        orca.setPreco(valor.getText());
        orca.setQuant(quantidade.getText());
        orca.setSub_total(subtotal.getText());
        orca.setTipo_prod((String)jComboproduto.getSelectedItem());
        orca.setTotal(total.getText());
        orca.setVendedor((String) jCombovendedor.getSelectedItem());
        orca.setEstoque(estoque.getText());
       

        DefaultTableModel orcamento = (DefaultTableModel) tabela.getModel();
        Object [] dados_orcamento ={
        codigoorcamento.getText(),
        Nomecliente.getText(),
        jComboproduto.getSelectedItem(),
        codigoprod.getText(),
        quantidade.getText(),
        valor.getText(),
        forma.getText(),
        desconto.getText(),
        frete.getText(),
        subtotal.getText(),
        total.getText(), 
        };
     
       
        String nomec ;
        int quant;
        float desc;
        int esto;

        try{
        nomec = orca.getNome_cliente();
        quant = Integer.parseInt(orca.getQuant());
        desc =Float.parseFloat(orca.getDesc());
        esto = Integer.parseInt(orca.getEstoque());
        for(int i = 0; i < nomec.length(); i++){
                Character caractere = nomec.charAt(i);    
                 if(Character.isDigit(caractere))
                    throw new Exception("Digite apenas letras no nome!!");
        }
        
        if(quant > esto){
            throw new Exception("A quantidade é maior");
        }
        
        orcamento.addRow(dados_orcamento); 
        gravar(orca.getCodigo_orcamento(), orca.getCodigo_prod(), orca.getDesc()
            ,orca.getForma(), orca.getFrete(), orca.getNome_cliente(), orca.getPreco()
            ,orca.getQuant(), orca.getSub_total(), orca.getTipo_prod(), orca.getTotal()
            , orca.getVendedor()
        );
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!\n");
       
        
        
        } catch(Exception ex){

        JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!"
        + "\nClique em Novo Orçamento para tentar novamente.","ERRO",JOptionPane.ERROR_MESSAGE);
        
        
        }
        
       
        Nomecliente.setText("Digite apenas letras");
        quantidade.setText("Digite apenas números");
        codigoorcamento.setText("");
        jproduto.setText("");
       
        desconto.setText("0");
        frete.setText("0");
        subtotal.setText("0");
        total.setText("0");
        
        jButton1.enable(true);
        jButton1.requestFocus();
        jButton1.setEnabled(true);
        Nomecliente.enable(false);
        codigoorcamento.enable(false);
        desconto.enable(false);
        subtotal.enable(false);
        frete.enable(false);
        jButtonboleto.setEnabled(false);
        jButtoncartao.setEnabled(false);
        jButtondinheiro.setEnabled(false);
        jComboproduto.enable(false);
        jCombovendedor.enable(false);
        valor.enable(false);
        jComboproduto.setEnabled(false);
        jCombovendedor.setEnabled(false);
        quantidade.enable(false);
        
        jButton2.setEnabled(false);
        tipocart.setEnabled(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Nomecliente.enable(true);
        Nomecliente.requestFocus();
        codigoorcamento.enable(false);

        valor.enable(false);

        Nomecliente.setEnabled(true);

        desconto.setEnabled(true);
        subtotal.setEnabled(true);
        frete.setEnabled(true);
        quantidade.setEnabled(true);

        jButtonboleto.setEnabled(true);
        jButtoncartao.setEnabled(true);
        jButtondinheiro.setEnabled(true);

        jComboproduto.enable(true);
        jCombovendedor.enable(true);
        jComboproduto.setEnabled(true);
        jCombovendedor.setEnabled(true);
        jButton2.setEnabled(true);

        jButtonboleto.setEnabled(true);
        jButtoncartao.setEnabled(true);
        jButtondinheiro.setEnabled(true);

        quantidade.setText("");

        String[] sequencia= {"0","1","2","3","4","5","6","7","8","9"};
        String cod ="";
        for(int x=0; x<4; x++){
            int j = (int) (Math.random()*sequencia.length);
            cod += sequencia[j];
        }
        codigoorcamento.setText(cod);
        Nomecliente.setText("");
        jproduto.setText("");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tipocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipocartActionPerformed
     String ca = "5% de desconto com cartão ";
        String concat = ca.concat((String) tipocart.getSelectedItem());
        forma.setText(concat);
    }//GEN-LAST:event_tipocartActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orçamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nomecliente;
    private javax.swing.JTextField codigoorcamento;
    private javax.swing.JTextField codigoprod;
    private javax.swing.JTextField desconto;
    private javax.swing.JLabel estoque;
    private javax.swing.JLabel forma;
    private javax.swing.JTextField frete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JRadioButton jButtonboleto;
    private javax.swing.JRadioButton jButtoncartao;
    private javax.swing.JRadioButton jButtondinheiro;
    private javax.swing.JComboBox<String> jComboproduto;
    private javax.swing.JComboBox<String> jCombovendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jproduto;
    private javax.swing.JLabel jvendedor;
    private javax.swing.JLabel jvendedor1;
    private javax.swing.JPanel paineltotall;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabela;
    private javax.swing.JComboBox<String> tipocart;
    private javax.swing.JLabel total;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
