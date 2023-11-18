package Ejercicio1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ConvertirString {

	public static void main(String[] args) {
	
		List<String> strings = new ArrayList<>();
		
		strings.add("pelota");
		strings.add("zapato");
		strings.add("mouse");
		strings.add("jarro");
		strings.add("gato");		
		
		System.out.println(strings.stream().collect(Collectors.joining(",")));
		
		List<String> stringsMay = convertMayuscula(strings);
		
		String stringsMayTexto = stringsMay.stream().collect(Collectors.joining(","));
	
		System.out.println(stringsMayTexto);
	}
	
	public static List<String> convertMayuscula(List<String> lista){
		return lista.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
	}
}
