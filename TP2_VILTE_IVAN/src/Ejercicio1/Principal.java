package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		String [] palabras = {"Hola", "como", "estas?"};
		
		Transformador t = (p)->{
			String [] palabrasMay = new String[p.length];
			for (int i = 0; i < p.length; i++) {
				palabrasMay[i] = p[i].toUpperCase();
			}
			return palabrasMay;
		};
		
		String [] nuevasPalabras = t.transformar(palabras);
		
		for (int i = 0; i < nuevasPalabras.length; i++) {
			System.out.println(nuevasPalabras[i]);
		}
	}

}
