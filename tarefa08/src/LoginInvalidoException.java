public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(){
        super("Usuário ou Senha estão incorretos");
    }
}
