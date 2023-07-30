public class GuardaReferencias {
    Object[] referencia = new Object[10];
    int index = 0;

    public void adicionar(Object obj){
        referencia[index] = obj;
        index++;
    }

    public Object obtener(int index){ return referencia[index]; }
}
