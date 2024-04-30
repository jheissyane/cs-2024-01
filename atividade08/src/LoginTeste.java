import java.util.Scanner;

public class LoginTeste {
    public static void main(String[] args) throws LoginInvalidoException{
        Scanner scanner  = new Scanner(System.in);
        try{
             System.out.println("digite o usuario");
             String usuario = scanner.nextLine();
             System.out.println("digite a senha");
             String senha = scanner.nextLine();
             new Login(usuario, senha);
        }catch(LoginInvalidoException e){
            System.out.println("Usuário ou senha inválidos!");
        }
    }
}
