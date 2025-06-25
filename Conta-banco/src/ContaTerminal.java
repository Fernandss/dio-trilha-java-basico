//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da sua agência:");
        String agencia= "067-8";
        String agenciaDigitada = sc.nextLine();
        int conta = 1021;
        boolean agenciaCorreta = agenciaDigitada.trim().equals(agencia);
        Double saldo = 100 + Math.random() * (1000 - 100);

        String mensagem = agenciaCorreta
                ? String.format("Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque",
                agencia, conta, saldo)
                : "Agência incorreta. Conta não criada.";

        System.out.println(mensagem);

    }
}

