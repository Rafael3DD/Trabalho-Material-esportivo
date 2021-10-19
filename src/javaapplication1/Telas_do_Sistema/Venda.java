
package Telas_do_Sistema;

import Classes_do_Sistema.vendaclasse;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Venda extends javax.swing.JFrame {

    public Venda() {
       initComponents();
       this.setLocationRelativeTo(null);
       Nomecliente1.enable(false);
       codigoprod1.enable(false);
       desconto1.enable(false);
       subtotal1.enable(false);
       frete1.enable(false);
       quantidade1.enable(false);
       codigovenda1.enable(false);
       valor1.enable(false);

       jButtonboleto.setEnabled(false);
       jButtoncartao.setEnabled(false);
       jButtondinheiro.setEnabled(false);
       jComboproduto1.enable(false);
       vendedor1.enable(false);
       jComboproduto1.setEnabled(false);
       vendedor1.setEnabled(false);
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
    
      Nomecliente1.setText("Digite apenas letras");
      quantidade1.setText("Digite apenas números");
    }
    
    //grava os dados
    public String gravar(String cod_orcamento, String cod_prod,String desconto
        ,String forma, String frete, String nome_cliente, String preco
        ,String quant, String sub_total, String tipo_prod, String total
        ,String vendedor){
        try{
            FileWriter fw = new FileWriter("Venda.txt", true);
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
    
    //tipos de cartões
    private void cartao(){
         String cart[]= {
             "Visa", "MasterCard", "Elo", "American Express", "Hipercard"};     
         for(int i = 0; i< cart.length;i++){
             tipocart.addItem(cart[i]);
         }       
     }
           
    
    //dados dos produtos
    private void prod(){
        String prod [] ={
            "Chuteira Nike", "chuteira Adidas", "Camisa seleção brasileira Nike", 
            "bicicleta caloi", "vitamina", "balança"};
        
        for(int i = 0; i<prod.length;i++){
            jComboproduto1.addItem(prod[i]);
         
        }
             
    }
    

    //dados dos vendedor
    private void vendedor(){
         String vendedor[]= {
             "Carlos Silva", "Carolina Japa", "Josealdo Alvaro", "Chico Bento", "Ariana Júnior", "clara lima"};
         
         for(int i = 0; i<vendedor.length;i++){
             vendedor1.addItem(vendedor[i]);
         }
 
     }
    //faz a contagem do estoque
    private void contestoque(){
    int quant2 = Integer.parseInt(quantidade1.getText());
    int esto = Integer.parseInt(estoque.getText());
    int calc = (int) (esto - quant2);
    estoque.setText(String.valueOf(calc));
    
    
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Nomecliente1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigovenda1 = new javax.swing.JTextField();
        vendedor1 = new javax.swing.JComboBox<>();
        jvendedor1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desconto1 = new javax.swing.JTextField();
        subtotal1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        frete1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        paineltotall = new javax.swing.JPanel();
        total1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboproduto1 = new javax.swing.JComboBox<>();
        jproduto = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valor1 = new javax.swing.JTextField();
        quantidade1 = new javax.swing.JTextField();
        codigoprod1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        estoque = new javax.swing.JLabel();
        jButtondinheiro = new javax.swing.JRadioButton();
        jButtonboleto = new javax.swing.JRadioButton();
        jButtoncartao = new javax.swing.JRadioButton();
        jvendedor = new javax.swing.JLabel();
        forma = new javax.swing.JLabel();
        tipocart = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod_Venda", "Cliente", "Produto", "Cod_produto", "Vendedor", "Quantidade", "preço", "Pagamento", "Desconto", "Frete", "Sub-Total", "Total"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        jPanel1.setBackground(new java.awt.Color(126, 225, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/orçamento.png"))); // NOI18N
        jButton1.setText("Nova Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Imagens_do_Sistema/Finalizar.png"))); // NOI18N
        jButton2.setText("Finalizar Venda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Nomecliente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nomecliente1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Nomecliente1FocusGained(evt);
            }
        });
        Nomecliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nomecliente1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome do cliente");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo da venda");
        jLabel2.setToolTipText("");

        codigovenda1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        vendedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedor1ActionPerformed(evt);
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

        desconto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconto1ActionPerformed(evt);
            }
        });

        subtotal1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                subtotal1FocusGained(evt);
            }
        });
        subtotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotal1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sub-Total");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Frete");
        jLabel5.setToolTipText("");

        paineltotall.setBackground(new java.awt.Color(0, 153, 153));
        paineltotall.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        total1.setBackground(new java.awt.Color(0, 153, 153));
        total1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        total1.setForeground(new java.awt.Color(255, 255, 255));
        total1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total1.setText("0");
        total1.setToolTipText("");

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
                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        paineltotallLayout.setVerticalGroup(
            paineltotallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineltotallLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineltotallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jComboproduto1.setToolTipText("");
        jComboproduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboproduto1ActionPerformed(evt);
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

        valor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        quantidade1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantidade1.setToolTipText("");
        quantidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidade1ActionPerformed(evt);
            }
        });

        codigoprod1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        jButtondinheiro.setBackground(new java.awt.Color(126, 225, 216));
        jButtondinheiro.setText("Dinheiro");
        jButtondinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondinheiroActionPerformed(evt);
            }
        });

        jButtonboleto.setBackground(new java.awt.Color(126, 225, 216));
        jButtonboleto.setText("Boleto");
        jButtonboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonboletoActionPerformed(evt);
            }
        });

        jButtoncartao.setBackground(new java.awt.Color(126, 225, 216));
        jButtoncartao.setText("Cartão");
        jButtoncartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncartaoActionPerformed(evt);
            }
        });

        jvendedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jvendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jvendedor.setText("Forma de pagamento");
        jvendedor.setToolTipText("");

        forma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        forma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forma.setText("Forma");

        tipocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipocartActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Compras acima de R$100 tem frete grátis!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(desconto1))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frete1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtotal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(Nomecliente1)
                            .addComponent(valor1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigovenda1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantidade1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboproduto1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jproduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jvendedor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(vendedor1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(codigoprod1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(49, 49, 49)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jvendedor)
                                                .addGap(134, 134, 134)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonboleto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtondinheiro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtoncartao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(105, 105, 105)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tipocart, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(paineltotall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nomecliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigovenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jComboproduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jvendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(quantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigoprod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(frete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(subtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(desconto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(97, 97, 97))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonboleto)
                                    .addComponent(jButtondinheiro)
                                    .addComponent(jButtoncartao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipocart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(forma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(paineltotall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Nomecliente1.enable(true);
        Nomecliente1.requestFocus();
        codigovenda1.enable(false);

        valor1.enable(false);

        Nomecliente1.setEnabled(true);

        desconto1.setEnabled(true);
        subtotal1.setEnabled(true);
        frete1.setEnabled(true);
        quantidade1.setEnabled(true);

        jButtonboleto.setEnabled(true);
        jButtoncartao.setEnabled(true);
        jButtondinheiro.setEnabled(true);

        jComboproduto1.enable(true);
        vendedor1.enable(true);
        jComboproduto1.setEnabled(true);
        vendedor1.setEnabled(true);
        tipocart.setEnabled(false);
        jButton2.setEnabled(true);

        jButtonboleto.setEnabled(true);
        jButtoncartao.setEnabled(true);
        jButtondinheiro.setEnabled(true);

        quantidade1.setText("");

        String[] sequencia= {"0","1","2","3","4","5","6","7","8","9"};
        String cod ="";
        for(int x=0; x<4; x++){
            int j = (int) (Math.random()*sequencia.length);
            cod += sequencia[j];
        }
        codigovenda1.setText(cod);
        Nomecliente1.setText("");
        jproduto.setText("");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel venda = (DefaultTableModel) tabela.getModel();
        vendaclasse ven = new vendaclasse();
        
        ven.setCodigo_orcamento(codigovenda1.getText());
        ven.setCodigo_prod(codigoprod1.getText());
        ven.setDesc(desconto1.getText());
        ven.setForma(forma.getText());
        ven.setFrete(frete1.getText());
        ven.setNome_cliente(Nomecliente1.getText());
        ven.setPreco(valor1.getText());
        ven.setQuant(quantidade1.getText());
        ven.setSub_total(subtotal1.getText());
        ven.setTipo_prod((String)jComboproduto1.getSelectedItem());
        ven.setTotal(total1.getText());
        ven.setVendedor((String) vendedor1.getSelectedItem());
        ven.setEstoque(estoque.getText());
        
        //Mostra os dados na tabela
        Object [] dados_orcamento ={
           codigovenda1.getText(),
            Nomecliente1.getText(),
            jComboproduto1.getSelectedItem(),
            codigoprod1.getText(),
            vendedor1.getSelectedItem(),
            quantidade1.getText(),
            valor1.getText(),
            forma.getText(),
            desconto1.getText(),
            frete1.getText(),
            subtotal1.getText(),
            total1.getText(),
        };
       
        String nomec ;
        int quant;
        float desc;
        int esto;

    try{
        nomec = ven.getNome_cliente();
        quant = Integer.parseInt(ven.getQuant());
        desc =Float.parseFloat(ven.getDesc());
        esto = Integer.parseInt(ven.getEstoque());
        
        for(int i = 0; i < nomec.length(); i++){
                Character caractere = nomec.charAt(i);    
                 if(Character.isDigit(caractere))
                    throw new Exception("Digite apenas letras no nome!!");
        }
        if(quant > esto){
            throw new Exception("A quantidade é maior");
        }
        gravar(ven.getCodigo_orcamento(), ven.getCodigo_prod(), ven.getDesc()
        ,ven.getForma(), ven.getFrete(), ven.getNome_cliente(), ven.getPreco()
        ,ven.getQuant(), ven.getSub_total(), ven.getTipo_prod(), ven.getTotal()
        , ven.getVendedor()
        );
        venda.addRow(dados_orcamento);
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!\n");

    } catch(Exception ex){

        JOptionPane.showMessageDialog(null, "Digite todos os dados corretamente!"
        + "\nClique em Novo Orçamento para tentar novamente.","ERRO",JOptionPane.ERROR_MESSAGE);
 
        }
        contestoque();
        
        Nomecliente1.setText("Digite apenas letras");
        quantidade1.setText("Digite apenas números");
        codigovenda1.setText("");
        jproduto.setText("");
      
        desconto1.setText("0");
        frete1.setText("0");
        subtotal1.setText("0");
        total1.setText("0");

        jButton1.enable(true);
        jButton1.requestFocus();
        jButton1.setEnabled(true);
        Nomecliente1.enable(false);
        codigovenda1.enable(false);
        desconto1.enable(false);
        subtotal1.enable(false);
        frete1.enable(false);
        jButtonboleto.setEnabled(false);
        jButtoncartao.setEnabled(false);
        tipocart.setEnabled(false);
        jButtondinheiro.setEnabled(false);
        jComboproduto1.enable(false);
        vendedor1.enable(false);
        valor1.enable(false);
        jComboproduto1.setEnabled(false);
        vendedor1.setEnabled(false);
        quantidade1.setEnabled(false);
        jButton2.setEnabled(false);
      
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void Nomecliente1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nomecliente1FocusGained
        // Nomecliente.setBackground(Color.LIGHT_GRAY);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_Nomecliente1FocusGained

    private void Nomecliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nomecliente1ActionPerformed

    }//GEN-LAST:event_Nomecliente1ActionPerformed

    private void subtotal1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subtotal1FocusGained
        double quant = Double.parseDouble(quantidade1.getText());
        double val = Double.parseDouble(valor1.getText());
        double porcent = Double.parseDouble(desconto1.getText());
       
        
        float soma = (float) (quant*val);
        float calculo_p = (float) ((soma*porcent)/100);
        float tota = (float)(soma - calculo_p);
        
        //se o total for maior que 100 ele acrescenta 30 reais de frete
        if(tota > 100){
            frete1.setText("");
        }else{
            frete1.setText(String.valueOf(30));
            tota = tota + 30;
        }
        
        subtotal1.setText(String.valueOf(tota));
        total1.setText(String.valueOf(tota));
    }//GEN-LAST:event_subtotal1FocusGained

    private void jComboproduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboproduto1ActionPerformed
        switch(jComboproduto1.getSelectedIndex()){
            case 0:
            valor1.setText("299.99");
            estoque.setText("100");
            quantidade1.setText("");
            quantidade1.requestFocus();
            codigoprod1.setText("112");
            desconto1.setText("0");
            frete1.setText("0");
            subtotal1.setText("0");

            break;
            case 1:
            valor1.setText("259.90");
            estoque.setText("103");
            quantidade1.setText("");
            quantidade1.requestFocus();
            codigoprod1.setText("223");
            desconto1.setText("0");
            frete1.setText("0");
            subtotal1.setText("0");
            break;
            case 2:
            valor1.setText("200.99");
            estoque.setText("1000");
            quantidade1.setText("");
            quantidade1.requestFocus();
            codigoprod1.setText("333");
            desconto1.setText("0");
            frete1.setText("0");
            subtotal1.setText("0");
            break;
            case 3:
            valor1.setText("299.99");
            estoque.setText("20");
            quantidade1.setText("");
            quantidade1.requestFocus();
            codigoprod1.setText("555");
            desconto1.setText("0");
            frete1.setText("0");
            subtotal1.setText("0");
            break;
            case 4:
            valor1.setText("89.99");
            estoque.setText("500");
            quantidade1.setText("");
            quantidade1.requestFocus();
            codigoprod1.setText("888");
            desconto1.setText("0");
            frete1.setText("0");
            subtotal1.setText("0");
            break;
            case 5:
            valor1.setText("299.99");
            estoque.setText("30");
            quantidade1.setText("");
            quantidade1.requestFocus();
            codigoprod1.setText("101");
            desconto1.setText("0");
            frete1.setText("0");
            subtotal1.setText("0");
            break;
        }

    }//GEN-LAST:event_jComboproduto1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Object[] options = {"Sim", "Não"};
     String mensagem = "escolha uma opção";
     int resposta = JOptionPane.showOptionDialog(null,"Deseja Sair?",mensagem,
     JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
     if(resposta ==0){
           this.dispose();
     }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void quantidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidade1ActionPerformed

    private void vendedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedor1ActionPerformed
     
    }//GEN-LAST:event_vendedor1ActionPerformed

    private void jButtondinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondinheiroActionPerformed
        forma.setText("15% de desconto com dinheiro");
        tipocart.setEnabled(false);
    }//GEN-LAST:event_jButtondinheiroActionPerformed

    private void jButtonboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonboletoActionPerformed
        forma.setText("10% de desconto com boleto");
        tipocart.setEnabled(false);
    }//GEN-LAST:event_jButtonboletoActionPerformed

    private void jButtoncartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncartaoActionPerformed
       String ca = "5% de desconto com cartão ";
        forma.setText(ca);
        tipocart.setEnabled(true);
    }//GEN-LAST:event_jButtoncartaoActionPerformed

    private void subtotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotal1ActionPerformed

    private void tipocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipocartActionPerformed
       String ca = "5% de desconto com cartão ";
       String concat = ca.concat((String) tipocart.getSelectedItem());
       forma.setText(concat);
    }//GEN-LAST:event_tipocartActionPerformed

    private void desconto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desconto1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nomecliente1;
    private javax.swing.JTextField codigoprod1;
    private javax.swing.JTextField codigovenda1;
    private javax.swing.JTextField desconto1;
    private javax.swing.JLabel estoque;
    private javax.swing.JLabel forma;
    private javax.swing.JTextField frete1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JRadioButton jButtonboleto;
    private javax.swing.JRadioButton jButtoncartao;
    private javax.swing.JRadioButton jButtondinheiro;
    private javax.swing.JComboBox<String> jComboproduto1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jproduto;
    private javax.swing.JLabel jvendedor;
    private javax.swing.JLabel jvendedor1;
    private javax.swing.JPanel paineltotall;
    private javax.swing.JTextField quantidade1;
    private javax.swing.JTextField subtotal1;
    private javax.swing.JTable tabela;
    private javax.swing.JComboBox<String> tipocart;
    private javax.swing.JLabel total1;
    private javax.swing.JTextField valor1;
    private javax.swing.JComboBox<String> vendedor1;
    // End of variables declaration//GEN-END:variables
}
