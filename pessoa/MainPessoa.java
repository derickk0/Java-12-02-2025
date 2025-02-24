package pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("20/10", "cartao", "26", "nome");

        System.out.println(cliente1.toString());
    }
}
