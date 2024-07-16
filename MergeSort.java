import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		numeros = mergeSort(numeros);
		System.out.println(Arrays.toString(numeros));
	}
	
	private static String[] mergeSort(String[] v) {
		return mergeSort(v, 0, v.length-1);
	}

	private static String[] mergeSort(String[] v, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim)/2;
			mergeSort(v, ini, meio);
			mergeSort(v, meio+1, fim);
			merge(v, ini, meio, fim);
		}
	}

	private static merge(String[] v, int ini, int meio, int fim) {
			
	}

}
