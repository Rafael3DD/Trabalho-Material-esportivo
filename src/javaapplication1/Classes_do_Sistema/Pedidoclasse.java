package Classes_do_Sistema;

public class Pedidoclasse {

    protected String Nome_cliente;
    protected String cpf_cliente;
    protected String id_pedido;
    protected String tipo;

    
    public String getNome_cliente() {
        return Nome_cliente;
    }

    public void setNome_cliente(String Nome_cliente) {
        this.Nome_cliente = Nome_cliente;
    }

    

    
    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    
    public String getCpf_cliente() {
        return cpf_cliente;
    }

   
    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
