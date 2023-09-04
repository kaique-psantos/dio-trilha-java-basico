import java.util.Scanner;

public class ContaTerminal {
    pu12blic static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        float saldo;

        System.out.print("Digite o número da Conta: ");
        numeroConta = scan.nextInt();
        
        scan.nextLine(); //Consumindo a quebra de linha deixada pelo nextInt anterior

        System.out.print("Digite o numero da Agência: ");
        agencia = scan.nextLine();
        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scan.nextLine();
        System.out.print("Digite o saldo da conta: ");
        saldo = scan.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já estão disponível para saque");

        scan.close();
    }
}
