package pessoa;

public class Cliente extends Pessoa{
    private String dataDeCompra;
    private String formaDePagamento;

    public Cliente(String dataDeCompra, String formaDePagamento, String idade, String nome) {
        super(idade, nome);
        this.dataDeCompra = dataDeCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("dataDeCompra=").append(dataDeCompra);
        sb.append(", formaDePagamento=").append(formaDePagamento);
        sb.append('}');
        return sb.toString();
    }


}
