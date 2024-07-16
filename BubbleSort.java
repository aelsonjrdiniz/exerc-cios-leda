import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		bubbleSort(numeros);
	}


	private static void bubbleSort(String[] v) {
	
		int j = v.length-1;
		int i = 0;
		boolean achou = true;

		while (j >= 0 && achou) {
				
			achou = false;
			while (i < j) {
				if (Integer.parseInt(v[i]) > Integer.parseInt(v[i+1])) {
                                	String auxiliar = v[i];
                                	v[i] = v[i+1];
                                	v[i+1] = auxiliar;
					achou = true;
                       		}
				i++;
			}
			System.out.println(imprimeMensagem(v));
			j--;
			i = 0;
		}

	}

	private static String imprimeMensagem(String[] v) {
		String msg = "";
		for (int i = 0; i < v.length; i++) {
			msg += v[i] + " ";
		}
		return msg.trim();
	}

}
