import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoNumeros {
    private Scanner scanner = new Scanner(System.in);

    public DivisaoNumeros() {
        try{
            System.out.println("primeiro número: ");
            int primeiroNumero = scanner.nextInt();
            System.out.println("segundo número: ");
            int segundoNumero = scanner.nextInt();

            int result = primeiroNumero/segundoNumero;

            System.out.println(result);
        } catch(ArithmeticException e){
            throw new Error("Não é possível dividir por 0!");
        }catch(InputMismatchException e) {
            throw new Error("Não é possível insirar dados que não sejam numéricos!");
        }
        }
    }

