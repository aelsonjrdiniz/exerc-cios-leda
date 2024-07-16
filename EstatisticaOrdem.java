import java.util.Scanner;

public class EstatisticaOrdem {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		int[] numbers = converteArray(numeros);
		System.out.println(estatisticaOrdem(numbers));
	}

	private static int[] converteArray(String[] v) {
		
		int[] arrayInt = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			arrayInt[i] = Integer.parseInt(v[i]);
		}
		return arrayInt;
	}

	private static int estatisticaOrdem(int[] v) {
		
		int[] arrayAuxiliar = new int[v.length];
		int ordem = -1;
		for (int i = 0; i < v.length; i++) {
			arrayAuxiliar = insereOrdenado(arrayAuxiliar, v[i], i);
		}
		
		for (int i = 0; i < v.length; i++) {
			if (v[0] == arrayAuxiliar[i]) {
				ordem = i+1;	
			}
		}

		return ordem;
	}

	private static int[] insereOrdenado(int[] v, int n, int counter) {
		v[counter] = n;
		while (counter > 0 && v[counter] < v[counter-1]) {
			int numAuxiliar = v[counter];
			v[counter] = v[counter-1];
			v[counter-1] = numAuxiliar;
			counter--;
		}
		return v;
	}

}
