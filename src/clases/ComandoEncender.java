package clases;

public class ComandoEncender implements Lavadora_IComando{

	private Lavadora_Receptor lavadora_Receptor;

	public ComandoEncender(Lavadora_Receptor lavadora_R)
	{
		this.lavadora_Receptor = lavadora_R;
	}
	
	@Override
	public void ejecutar()
	{
		lavadora_Receptor.encender();
	}

}
