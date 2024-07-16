import java.util.Scanner;

public class DoisSomam {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(doisSomam(numeros, num));
	}


	private static String doisSomam(String[] v, int n) {
		
		String resultado = "";
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = i+1; j < v.length; j++) {
				if (Integer.parseInt(v[i]) + Integer.parseInt(v[j]) == n) {
					resultado = v[i] + " " + v[j];
					break;
				}
			}
		}

		if (resultado.equals("")) {
			resultado = "-1";
		}

		return resultado;	
	}
}
