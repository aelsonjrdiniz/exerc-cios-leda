import java.util.Scanner;


public class BuscaRecursiva {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		String numero = sc.nextLine();
		System.out.println(buscaBinaria(numeros, numero));
	}

	private static int buscaBinaria(String[] v, String elem) {
		return buscaBinaria(v, elem, 0);
	}

	private static int buscaBinaria(String[] v, String elem, int pos) {
	
		if (pos >= v.length) {
			return -1;
		}
		if (v[pos].equals(elem)) {
			return pos;
		} else {
			return buscaBinaria(v, elem, pos+1);
		}
	}
}
