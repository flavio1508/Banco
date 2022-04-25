public class Conta {
    private double saldo;
    String tipo;
    String numero;
    String agencia;
    double limite;
    boolean ativa;
    Data datadeabertura;
    
    Cliente cliente;

    boolean sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        if (novoSaldo >= 0) {
            this.saldo = novoSaldo;
            return true;

        } else {
            System.out.println("saldo insuficiente!");
            return false;
        }
    }

    void depositar(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("valor invalido!");
          
        } else {

             this.saldo += quantidade;
        }
    }
    void pix(double valorPix, Conta contadestino){
        if(this.sacar(valorPix)){ 
        contadestino.depositar(valorPix);
         } else { 
             System.out.println("saldo insuficiente!");
         }
    }
          
    double CaucularRendimento(double taxa){
        return this.saldo * taxa;
    }
       String recuperarDadosParaImpressao(){
           return "nome do titular:" + this.cliente.nomecompleto + "\n" +
                "AG:" + this.agencia + "\n" + 
                "CC:" + this.numero + "\n" + 
                "Data de abertura:" + this.datadeabertura.toString() + "\n" +
                "Saldo" + String.format("%.2f", this.saldo); 
       }
}

