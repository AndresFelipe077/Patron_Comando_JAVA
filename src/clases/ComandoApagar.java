package clases;

public class ComandoApagar implements Lavadora_IComando{
	
	private Lavadora_Receptor lavadora_Receptor;
	public ComandoApagar(Lavadora_Receptor lavadora_R)
	{
		this.lavadora_Receptor = lavadora_R;
	}
	
	@Override
	public void ejecutar()
	{
		lavadora_Receptor.apagar();
	}
	
}
