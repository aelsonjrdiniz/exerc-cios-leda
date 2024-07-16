import java.util.Scanner;


public class Triade {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		System.out.println(calculaTupla(numeros));
	}

	private static String calculaTupla(String[] v) {
		int soma = 0;
		String resultado = "";
		for (int i = 0; i < v.length - 2; i++) {
			int novaSoma = Integer.parseInt(v[i]) + Integer.parseInt(v[i+1]) + Integer.parseInt(v[i+2]);
			if (novaSoma > soma) {
				resultado = "A soma vale: " + novaSoma + ". Ela é o resultado da soma dos elementos das posições " + 
					i + " " + (i+1) + " " + (i+2) + ".";
				soma = novaSoma;
			}
		}
		return resultado;
	}
}
