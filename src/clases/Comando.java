package clases;

public class Comando {
	//Profe esto lo coloque solo para ver si se podia, lo que no se es como
	//se representa asi todas las clases dentro de otra clase en un diagrama,
	//SOLO LO HICE POR CURIOSIDAD
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
	
	
}
