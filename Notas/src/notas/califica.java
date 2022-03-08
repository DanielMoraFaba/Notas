package notas;
/* Clase califica la cual contiene el método califica */
public class califica {

	/**
	 * @param num_nota
	 * @return
	 */
	/* Método califica, permite saber la calificación que recibirá una nota al introducirla*/
	public static String califica(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
			calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}

}
