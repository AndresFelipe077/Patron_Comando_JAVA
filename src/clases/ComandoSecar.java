package clases;

public class ComandoSecar implements Lavadora_IComando{

	private Lavadora_Receptor lavadora_Receptor;
	
	public ComandoSecar(Lavadora_Receptor lavadora_R) 
	{
		this.lavadora_Receptor = lavadora_R;
	}
	
	@Override
	public void ejecutar()
	{
		lavadora_Receptor.secar();
	}
	
}
