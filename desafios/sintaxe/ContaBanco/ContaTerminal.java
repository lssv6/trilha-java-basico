import java.io.Console;
public class ContaTerminal{
    public static void main(String[] args) {
        Console teclado = System.console();


        System.out.print("Por favor, digite o número da Agência (ex: 1234-99): ");
        String agencia = teclado.readLine();
        
        System.out.print("Por favor, digite o numero da conta (ex: 4321): ");
        int conta = Integer.parseInt(teclado.readLine());

        System.out.print("Por favor, digite o seu nome(ex: MARIO ANDRADE): ");
        String nomeCliente = teclado.readLine();

        System.out.print("Por favor, digite o seu saldo: ");
        float saldo = Float.parseFloat(teclado.readLine());

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco!\n"+
            "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque!\n",
            nomeCliente, agencia, conta, saldo
        );
    }
}
