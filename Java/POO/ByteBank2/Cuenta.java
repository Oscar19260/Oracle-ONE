// Entidad Cuenta
public abstract class Cuenta{
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    
    private static int total = 0;

    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Creando cuenta ...");
        Cuenta.total++;
    }

    public abstract void depositar(double valor);

    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }
        else{ return false; }
    }

    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor){
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        }
        else{ return false; }
    }

    public double getSaldo() { return this.saldo; }

    public int getAgencia() { return agencia; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public Cliente getTitular() { return titular; }
    public void setTitular(Cliente titular) { this.titular = titular; }

    public static int getTotal(){ return Cuenta.total; }
}
