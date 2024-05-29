import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite o nome do cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d " +
                "e o seu saldo de R$%.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);

        scanner.close();
    }
}
