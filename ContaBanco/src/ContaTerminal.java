import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente,
                agencia,
                numeroConta,
                saldo);

        scanner.close();
    }
}