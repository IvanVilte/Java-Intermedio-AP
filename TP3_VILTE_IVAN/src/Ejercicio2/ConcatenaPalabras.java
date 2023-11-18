package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenaPalabras {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		Integer n = 8;
	
		strings.add("pelota");	
		strings.add("pantalon");	
		strings.add("supermercado");	
		strings.add("sal");	
		strings.add("television");	
		strings.add("remera");	
		strings.add("pantera");	
		strings.add("papa");	
		strings.add("pala");	
		
		System.out.println(strings.stream().collect(Collectors.joining(",")));
	
		String palabrasMayN = palabrasMayN(strings, n);
		
		System.out.println(palabrasMayN);
	}
	
	public static String palabrasMayN(List<String> lista, Integer n) {
		return lista.stream().filter(string -> string.length() > n).collect(Collectors.joining(","));
	}
}
