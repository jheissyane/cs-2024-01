import java.util.Scanner;
import java.util.Locale;

public class ContaBancariaTeste {
    public static void main (String args[]) throws SaldoInsuficienteException {
        Locale.setDefault(Locale.US);
        Scanner scanner  = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        try{
            System.out.println("Digite o valor que deseja depositar");
            double valorDeposito = scanner.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Digite o valor que deseja sacar");
            double valorSaque = scanner.nextDouble();
            conta.sacar(valorSaque);
        }
        catch(SaldoInsuficienteException e){
            System.out.println("Não há saldo suficiente para sacar esse valor");
        }
    }
}
