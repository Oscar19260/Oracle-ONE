// Entidad Cuenta
public class Cuenta1{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente1 titular = new Cliente1();
    
    private static int total = 0;

    public Cuenta1(int agencia){
        // System.out.println("Se ha creado una nueva cuenta exitosamente!");
        if (agencia  <= 0){
            System.out.println("No se ha encontrado ese numero de agencia");
            this.agencia = 1;
        }
        else { this.agencia = agencia; }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }
        else{ return false; }
    }

    public boolean transferir(double valor, Cuenta1 cuenta){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
           cuenta.depositar(valor);
           return true;
        }
        else{ return false; }
    }

    public double getSaldo() { return this.saldo; }

    public int getAgencia() { return agencia; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public Cliente1 getTitular() { return titular; }
    public void setTitular(Cliente1 titular) { this.titular = titular; }

    public static int getTotal(){ return Cuenta1.total; }
}
