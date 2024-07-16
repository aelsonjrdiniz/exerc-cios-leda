import java.util.Scanner;


public class TabelaFrequencia {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		int maiorInteiro = calculaMaior(numeros);
		System.out.println(tabelaFrequencia(numeros, maiorInteiro));
	}

	private static int calculaMaior(String[] v) {
		
		int maior = Integer.parseInt(v[0]);
		for (int i = 1; i < v.length; i++) {
			if (Integer.parseInt(v[i]) > maior) {
				maior = Integer.parseInt(v[i]);
			}
		}
		return maior;
	}

	private static String tabelaFrequencia(String[] v, int n) {
		
		int[] arrayAuxiliar = new int[n+1];
		String msg = "";
		for (int i = 0; i < v.length; i++) {
			int number = Integer.parseInt(v[i]);
			arrayAuxiliar[number] += 1;	
		}

		for (int j = 0; j < v.length; j++) {
			
		}
	}

}
