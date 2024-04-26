import java.util.Objects;
import java.util.Scanner;

public class Login{
    private String usuario = "jheissyane";
    private String senha = "123a";
    public Scanner scanner = new Scanner(System.in);

    public Login(String usuarioPreenchido, String senhaPreenchida) throws LoginInvalidoException {
        if(!Objects.equals(usuarioPreenchido, usuario) || !Objects.equals(senhaPreenchida, senha)){
            throw new LoginInvalidoException();
        }
        else{
            System.out.println("Usuário logado com sucesso!");
        }
}
}
