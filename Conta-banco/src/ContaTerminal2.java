import java.util.Scanner;

public class ContaTerminal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();


        System.out.print("Por favor, digite o número da agência: ");
        String agenciaDigitada = sc.nextLine().trim();


        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();

        Double saldo = 100 + Math.random() * (1000 - 100);


        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
                nomeCliente, agenciaDigitada, numero, saldo);

        System.out.println(mensagem);

        sc.close();
    }
}
