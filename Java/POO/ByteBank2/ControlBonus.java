public class ControlBonus {
    private double suma;

    /* -------------------------------------------------------
    public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonus() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
    ------------------------------------------------------- */

    public void registrar(Funcionario func){
        this.suma = func.getBonus() + this.suma;
    }

    public double getSuma(){ return this.suma; }
}
