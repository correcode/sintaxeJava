public class Conta {
    double saldo = 10.0;

    public void sacar(Double valor) {
        Double novoSaldo = saldo - valor;
        System.out.println("O saldo atual e de : " + novoSaldo + " $ Dolares.");
    }
}
 