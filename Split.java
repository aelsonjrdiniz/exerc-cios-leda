import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Split {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		String[] arrayPalavras = separa(frase);
		String inversa = geraInversa(arrayPalavras);
		System.out.println(inversa);
	}

	private static String[] separa(String v) {
		
		ArrayList<String> lista = new ArrayList<>();
		int interruptor = 1;
		String auxiliar = "";

		for (int i = 0; i < v.length(); i++) {
			
			if (v.charAt(i) == ' ' ) {
				interruptor = -1;
				lista.add(auxiliar);
				auxiliar = "";
			} else {
				auxiliar += "" + v.charAt(i);
			}
		}

		lista.add(auxiliar);	
		String[] fraseSeparada = new String[lista.size()];
		
		for (int j = 0; j < lista.size(); j++) {
			fraseSeparada[j] = lista.get(j);
		}

		return fraseSeparada;
	}
	
	private static String geraInversa(String[] v) {
		String inversa = v[v.length-1];
		for (int i = v.length-2; i >= 0; i--) {
			inversa += " " + v[i]; 
		}
		return inversa;
	}

}
