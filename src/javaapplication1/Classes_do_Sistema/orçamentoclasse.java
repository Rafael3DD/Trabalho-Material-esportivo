
package Classes_do_Sistema;


public class orçamentoclasse {

    public String getEstoque() {
        return estoque;
    }

    
    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
    protected String nome_cliente;
    protected String codigo_orcamento;
    protected String codigo_prod;
    protected String tipo_prod;
    protected String preco;
    protected String quant; 
    protected String desc;
    protected String vendedor;        
    protected String frete;
    protected String sub_total;       
    protected String total;
    protected String forma;
    protected String estoque;
    
    public String getNome_cliente() {
        return nome_cliente;
    }

    
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    
    public String getCodigo_orcamento() {
        return codigo_orcamento;
    }

    
    public void setCodigo_orcamento(String codigo_orcamento) {
        this.codigo_orcamento = codigo_orcamento;
    }

    
    public String getCodigo_prod() {
        return codigo_prod;
    }

    
    public void setCodigo_prod(String codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getTipo_prod() {
        return tipo_prod;
    }

    
    public void setTipo_prod(String tipo_prod) {
        this.tipo_prod = tipo_prod;
    }

    public String getPreco() {
        return preco;
    }

    
    public void setPreco(String preco) {
        this.preco = preco;
    }

    
    public String getQuant() {
        return quant;
    }

    
    public void setQuant(String quant) {
        this.quant = quant;
    }


    public String getDesc() {
        return desc;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getVendedor() {
        return vendedor;
    }

    
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

 
    public String getSub_total() {
        return sub_total;
    }

    
    public void setSub_total(String sub_total) {
        this.sub_total = sub_total;
    }

    public String getTotal() {
        return total;
    }

    
    public void setTotal(String total) {
        this.total = total;
    }

    
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
}
