public class TestaConta { 
    public static void main(String[] args) { 
        Cliente cliente = new Cliente();
        cliente.nomecompleto = "Flávio"; 

        Data hoje = new Data();
        hoje.dia = 25;
        hoje.ano = 2021;
        hoje.mes = 4;


        Conta contaCorrente = new Conta();
        contaCorrente.agencia = "0001";
        contaCorrente.numero = "9809898-990";
        contaCorrente.ativa = true;
        contaCorrente.cliente = cliente;
        contaCorrente.datadeabertura = hoje;
        contaCorrente.limite  = 300;
        contaCorrente.saldo = 100;
        contaCorrente.tipo = "Conta Corrente";

        double rendimentoApri1 = contaCorrente.CaucularRendimento( 0.1);
        System.out.println("o rendimento de agosto eh" + rendimentoApri1);
        System.out.println(contaCorrente.recuperarDadosParaImpressao()); 

        Conta contaPoupanca = new Conta(); 

        
        contaPoupanca.agencia = "0001";
        contaPoupanca.numero = "9809898-990";
        contaPoupanca.ativa = true;
        contaPoupanca.cliente = cliente;
        contaPoupanca.datadeabertura = hoje;
        contaPoupanca.limite  = 0;
        contaPoupanca.saldo = 100;
        contaPoupanca.tipo = "poupanca"; 

        if(contaCorrente == contaPoupanca){
            System.out.println("contas iguais.");
        } else {
            System.out.println("contas diferentes.");
        }

    }
    
}
