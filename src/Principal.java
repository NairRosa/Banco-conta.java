public class Principal {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Joaquim França");
        titular1.setDocumento("12197942199");

        Pessoa titular2 = new Pessoa();
        titular2.setNome ("Nilo José");
        titular2.setDocumento("12197942199");


        Conta minhaConta = new Conta(titular1, 123, 555);
        // minhaConta.titular = titular1;    \\ Com argumentos do construtor
        // minhaConta.agencia = 123;
        // minhaConta.numero = 555;
        // (Para fazer sem argumentos), cria-se um Construtor vazio na classe conta (suaConta)
        minhaConta.depositar(250);


        Conta suaConta = new Conta(titular2, 125, 562); 
        // suaConta.setTitular(titular2);
        // suaConta.setAgencia(125);
        // suaConta.setNumero(562);
        suaConta.depositar(500);


        minhaConta.sacar(100);
        suaConta.sacar(1200);

        System.out.println("Nome do titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Nome do titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());

    }
}
