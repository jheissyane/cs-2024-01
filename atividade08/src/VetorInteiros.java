import java.util.InputMismatchException;
import java.util.Scanner;

 class VetorInteiros {
    public Scanner scanner = new Scanner(System.in);
    private int n = 10;

    public VetorInteiros() {
        int[] vetor = new int[n];
        int i = 0;
        while (true) {
            try{
                System.out.println("Digite um valor: ");
                vetor[i] = scanner.nextInt();
                if (vetor[i] == 0) {
                    break;
                }
                i++;
            }
            catch(ArrayIndexOutOfBoundsException  e){
                throw new ArrayIndexOutOfBoundsException("O valor máximo de itens a ser inserido é 10!");
            }
            catch(InputMismatchException e){
                throw new InputMismatchException("Não é possível insirar dados que não sejam numéricos!");
            }
        }

            for (i = 0; i < n; i++) {
                System.out.print(vetor[i] + "");
                if (vetor[i] == 0) {
                    return;
                }
            }
    }
 }
