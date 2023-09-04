/**
 * <h1> Conta Banco </h1>
 * Programa de uma conta bancaria que recebe as informações via terminal e apresenta ao usuário
 * @author Kaique Pereira
 * @version 1.0
 * @since 03/09/2023
 */
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
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
