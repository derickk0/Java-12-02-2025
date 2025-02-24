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
        return "----------------"+ "\n" + "Nome: " + nome + "\n" +
        "Data da compra: " + dataDeCompra + "\n" +
        "Idade: " + idade + "\n" +
        "Forma de pagamento: " + formaDePagamento;
    }

    
}
