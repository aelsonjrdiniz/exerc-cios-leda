import java.util.Scanner;
import java.util.Arrays;


public class FuraFila {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		int n = Integer.parseInt(sc.nextLine());
		furaFila(numeros, n);
	}


	private static void furaFila(String[] v, int index) {
		
		for (int i = index; i < v.length; i++) {
			v = alteraPosicao(v, i, i - index);
			System.out.println(Arrays.toString(v));
		}
	}

	private static String[] alteraPosicao(String[] v, int index, int posFinal) {
		
		while (index > 0 && index != posFinal) {
			String auxiliar = v[index];
			v[index] = v[index-1];
			v[index-1] = auxiliar;
			index--;
		}
		return v;
	}

}
