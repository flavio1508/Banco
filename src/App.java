public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        conta.agencia = "1000";
        conta.ativa = true;
        conta.limite = 100;
        conta.numero = "383839";
        conta.depositar(50);

        Conta novaConta = new Conta();
        novaConta.agencia = "1890";
        novaConta.ativa = true;
        novaConta.limite = 100;
        novaConta.numero = "66639";
        novaConta.tipo = "conta corremte";
        novaConta.depositar(5);

        conta.pix(60, novaConta);

        System.out.println("saldo da conta eh:" + conta.saldo);
        System.out.println("saldo da nova conta eh:" + novaConta.saldo);

        System.out.println("tenho" + conta.saldo); 
        conta.sacar(10);
        System.out.println("depois do saque eu tenho" + conta.saldo); 

        conta.tipo = "conta poupança";
        Cliente cliente = new Cliente();
        cliente.nomecompleto = "Flavio";
        cliente.cpf = "989869857467";
        cliente.datanascimento = "15/08/2050";
        Endereco endereco = new Endereco();
        endereco.cep ="84798758437";
        endereco.bairro = "seí lá";
        endereco.rua = "qualquer uma";
        cliente.endereco = endereco; 

        conta.cliente = cliente;
        System.out.println("o nome do cliente eh:" + conta.cliente.nomecompleto);
        System.out.println("a sua data de nascimento eh:" + conta.cliente.datanascimento);
        System.out.println("o seu saldo é esse:R$" + String.format("%.2f", conta.saldo));
        System.out.println("o endereço eh:" + conta.cliente.endereco.rua);
        System.out.println("o seu bairro eh:" + conta.cliente.endereco.bairro);
        System.out.println("seu cep é:" + conta.cliente.endereco.cep);
    }
}
