package main;
import java.util.Scanner;
import clases.*;

public class Main {

	public static void main(String[] args) {

		ejecutarLavadora();
		
	}//Fin main
	
	public static void ejecutarLavadora()
	{
		Lavadora_Receptor lavadora = new Lavadora_Receptor();
		
		LavadoraInvoker lavadoraInvoker = new LavadoraInvoker(lavadora);

		int opcion;
		
		do {
			opcion = menu();
			if(opcion != 5)
			{
				lavadoraInvoker.seleccionControl(opcion-1);
			}
		}while(opcion != 5);
	}
	
	
	public static int menu()
	{
		int opcion = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Seleccione una de las siguientes opciones: ");
			System.out.println("1. Encender lavadora");
			System.out.println("2. Lavar ropa");
			System.out.println("3. Secar ropa");
			System.out.println("4. Apagar lavadora");
			System.out.println("5. Salir");
			opcion = entrada.nextInt();
			if(opcion < 1 || opcion > 5)
			{
				System.out.println("Opcion incorrecta vuelve a intentarlo!!!");
			}
			else if(opcion == 5)
			{
				System.err.println("Haz salido");
			}
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}
	

}//Fin Main
