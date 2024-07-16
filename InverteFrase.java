import java.util.Scanner;
import java.util.Arrays;


public class InverteFrase {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		int tamanhoArray = calculaPalavras(frase);
		String[] array = new String[tamanhoArray]; 
		array = converteArray(frase, tamanhoArray);
		System.out.println(Arrays.toString(array));
	}

	private static int calculaPalavras(String frase) {
		int counter = 1;
		int interruptor = 0;
		
		if (frase.charAt(0) == ' ') {
                	interruptor = 1;
                } else {
                        interruptor = -1;
                }

		for (int i = 1; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ' && interruptor == -1) {
				interruptor = 1;
				counter++;
			} else if (frase.charAt(i) != ' ' && interruptor == 1) {
				interruptor = -1;	
				counter++;
			}
		}

		return counter;

	}

	private static String[] converteArray(String v, int len) {
	
		String[] array = new String[len];
		int interruptor;
		int counter = 0;
		String auxiliar = "" + v.charAt(0);
		
		if (v.charAt(0) == ' ') {
			interruptor = 1;
		} else {
			interruptor = -1;
		}

		for (int i = 1; i < v.length(); i++) {

			if (v.charAt(i) == ' ' && interruptor == -1) {
				array[counter++] = auxiliar;
                                interruptor = 1;
				auxiliar = "" + v.charAt(i);
                        } else if (v.charAt(i) != ' ' && interruptor == 1) {
				array[counter++] = auxiliar;
                                interruptor = -1;
				auxiliar = "" + v.charAt(i);
                        } else {
				auxiliar += v.charAt(i);
			}
		}

		return array;
	}

}
