package clases;

public class LavadoraInvoker {
	
	private Lavadora_IComando[] lavadora_IComandos_Array = new Lavadora_IComando[5];
	public LavadoraInvoker(Lavadora_Receptor lavadora_R)
	{
		lavadora_IComandos_Array[0] = new ComandoEncender(lavadora_R);
		lavadora_IComandos_Array[1] = new ComandoLavar(lavadora_R);
		lavadora_IComandos_Array[2] = new ComandoSecar(lavadora_R);
		lavadora_IComandos_Array[3] = new ComandoApagar(lavadora_R);
	}
	
	public void seleccionControl(int indice)
	{
		lavadora_IComandos_Array[indice].ejecutar();
	}
	
	
}
