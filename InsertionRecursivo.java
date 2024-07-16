import java.util.Scanner;
import java.util.Arrays;


public class InsertionRecursivo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		insertionRecursivo(numeros);
	}

	private static void insertionRecursivo(String[] v) {
		insertionRecursivo(v, 1);
	}

	private static void insertionRecursivo(String[] v, int pos) {
		
		if (pos >= v.length) {
			return;
		} else {
			insereOrdenado(v,pos);
			System.out.println(Arrays.toString(v));
			insertionRecursivo(v,pos+1);
		}
	}

	private static void insereOrdenado(String[] v, int pos) {
		while (pos > 0 && Integer.parseInt(v[pos]) < Integer.parseInt(v[pos-1])) {
			String auxiliar = v[pos];
			v[pos] = v[pos-1];
			v[pos-1] = auxiliar;
			pos--;
		}
	}
}
