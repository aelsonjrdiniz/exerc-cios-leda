import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(buscaBinaria(numeros, num));
	}

	public static String buscaBinaria(String[] v, int n) {
		int ini = 0;
		int fim = v.length-1;
		String msg = "";
		boolean achou = false;

		while (ini <= fim) {

			int meio = ini + (fim - ini)/2;
			if (Integer.parseInt(v[meio]) == n) {
				achou = true;
				msg += meio;
				break;
			}
			msg += meio + "\n";
			if (Integer.parseInt(v[meio]) > n) {
				fim = meio-1;
			} else {
				ini = meio+1;
			}
		
		}

		if (!(achou)) {
			msg += "-1";
		}

		return msg;
	}
}
