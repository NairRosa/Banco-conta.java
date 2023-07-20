import java.util.Objects;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Pessoa getTitular() {
        return this.titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }


    // Isso aqui é um molde, uma classe, pois não está instanciada. ^

    // Conta () {
    //Isto é um construtor vazio (Logo abaixo extiste um construtor instaciado.)
    // }

    Conta (Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);

        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }


    void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalStateException("O valor deve ser maior que 0.");
            // Lembrar de sempre validar os metodos.
        } else {
            saldo += valor;
        }
    }

    void sacar(double valor) {
        // Forma mais clean
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que 0.");
        } else if (valor > saldo) {
            throw new IllegalArgumentException("Você não tem saldo suficiente para este saque."); 
        } else {
            valor -= saldo;
        }
        // if (valor <= saldo) {
        //     saldo -= valor;
        //     System.out.println(saldo);
        // } else {
        //     System.out.print("Quantia solicitada para saque indisponível. ");
        //     System.out.print("Saldo: " + saldo);
        // }
    }

}
