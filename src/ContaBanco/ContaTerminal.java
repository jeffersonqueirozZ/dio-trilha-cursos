package ContaBanco;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 237.48;
        System.out.println("Ola seja bem vindo e muito obrigado por usar nosso banco");
        System.out.println("Como gostaria de ser chamado?");
        String nome = input.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = input.nextLine();
        System.out.println("Qual a conta?");
        int contaNumero = Integer.parseInt(input.nextLine());
        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+contaNumero+ " e seu saldo de "+ saldo+ " já esta disponível para saque." );
    }
}
