package notas;

import java.util.Scanner;
/* Clase Notas la cual contiene el código principal */
public class Notas { 
	/* Método main */
	public static void main(String[] args) {
		/* Atributos */ 
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();
		
		/* Llamada al método califica */
		calificacion = notas.califica.califica(nota);

		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param nota
	 * @return
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	/* Método cali obsoleto */
	public static String cali(int nota) {
		return notas.califica.califica(nota);
	}

	/**
	 * @param num_nota
	 * @return
	 * @deprecated Use {@link califica#califica(int)} instead
	 */
	/* Método califica */
	public static String califica(int num_nota) {
		return califica.califica(num_nota);
	}
}