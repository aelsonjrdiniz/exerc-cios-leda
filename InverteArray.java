import java.util.Scanner;

public class InverteArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		String[] inverso = inverteArray(numeros);
		System.out.println(imprime(inverso));
	}

	private static String[] inverteArray(String[] v) {
		
		int i = v.length-1;
		for (int j = 0; j < (v.length)/2; j++) {
			String auxiliar = v[i];
			v[i] = v[j];
			v[j] = auxiliar;
			i--;
		}
		return v;
	}

	private static String imprime(String[] v) {
	
		String msg = "";
		for (int i = 0; i < v.length; i++) {
			msg += v[i] + " ";
		}
		return msg.trim();
	}
}
