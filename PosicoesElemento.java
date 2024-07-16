import java.util.Scanner;

public class PosicoesElemento {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] numeros = sc.nextLine().split(" ");
		System.out.println(posicoesDeUmElemento(numeros, num));
	}

	public static String posicoesDeUmElemento(String[] v, int n) {
		
		String msg = "";	
		for (int i = 0; i < v.length; i++) {
			if (Integer.parseInt(v[i]) == n) {
				msg += i + " ";
			}
		}

		if (msg.equals("")) {
			msg = "-1";
		}

		return msg.trim();
	}
}
