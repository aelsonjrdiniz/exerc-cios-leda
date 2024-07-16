import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		insertionSort(numeros);
		System.out.println(Arrays.toString(numeros));
	}

	private static void insertionSort(String[] v) {
		
		int i = 1;
		while (i < v.length) {
			insereOrdenado(v, i);
			i++;
		}
	}

	private static void insereOrdenado(String[] v, int i) {
		while (i > 0 && Integer.parseInt(v[i]) < Integer.parseInt(v[i-1])) {
			String auxiliar = v[i];
			v[i] = v[i-1];
			v[i-1] = auxiliar;
			i--;
		}
	}
}
