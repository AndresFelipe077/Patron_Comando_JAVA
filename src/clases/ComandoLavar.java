package clases;

public class ComandoLavar implements Lavadora_IComando{

	private Lavadora_Receptor lavadora_Receptor;
	
	public ComandoLavar(Lavadora_Receptor lavadora_R)
	{
		this.lavadora_Receptor = lavadora_R;
	}
	
	@Override
	public void ejecutar()
	{
		lavadora_Receptor.lavar();
	}
	
}
