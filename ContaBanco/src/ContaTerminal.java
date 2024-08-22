import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Seja Bem-vindo ");

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu numero da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo : ");
        double saldo = scanner.nextDouble();


        System.out.println("Ola " + nomeCliente + ", Obrigado por criar uma conta no nosso banco, sua agencia é "
                + agencia + ", Conta " + numeroConta  + ", e seu saldo " + saldo + "já está disponivel para saque");
    }
}
