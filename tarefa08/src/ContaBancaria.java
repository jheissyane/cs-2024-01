public class ContaBancaria {
    private Double saldo = 0.00;

    public void  depositar(Double valor){
        System.out.println("valor depositado: " + valor);
        System.out.println("valor antes do depósito: " + saldo);
        saldo += valor;
        System.out.println("valor após o depósito: " + saldo);
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if(valor>saldo){
            throw new SaldoInsuficienteException();
        }
        else{
            System.out.println("valor sacado: " + valor);
            System.out.println("valor antes do saque: " + saldo);
            saldo -= valor;
            System.out.println("valor após o saque: " + saldo);
        }
    }
}
