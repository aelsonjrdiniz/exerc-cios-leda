import java.util.Scanner;
import java.util.HashSet;

public class ElementoSobrando {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] v = sc.nextLine().split(" ");
		String[] u = sc.nextLine().split(" ");
		System.out.println(elementoSobrando(v,u));
	}

	private static String elementoSobrando(String[] v, String[] u) {
	
		String[] maior;
		String[] menor;
		String sobrando = "";
		HashSet <String> conjunto = new HashSet<>();

		if (v.length > u.length) {
			maior = v;
			menor = u;
		} else {
			maior = u;
			menor = v;
		}

		for (int i = 0; i < menor.length; i++) {
			conjunto.add(menor[i]);
		} 

		for (int i = 0; i < maior.length; i++) {
			if (!(conjunto.contains(maior[i]))) {
				sobrando = maior[i];
			}	
		}

		return sobrando;
	}

}
