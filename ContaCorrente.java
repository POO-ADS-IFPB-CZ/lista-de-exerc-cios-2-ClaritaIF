public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public boolean sacar(float valor) {
        if (valor > 10000) {
            System.out.println("Não é permitido sacar mais de R$ 10.000 por operação.");
            return false;
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } 
    }

    public boolean depositar(float valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
            return false;
        } else if (valor > 10000) {
            System.out.println("Não é permitido depositar mais de R$ 10.000 por operação.");
            return false;
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
            return true;
        }
    }

    public float consultarSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }
}
