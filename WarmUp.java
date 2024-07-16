import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] numeros = sc.nextLine().split(" ");
		System.out.println(multiplicaPorN(numeros, num));
	}


	public static String multiplicaPorN(String[] v, int n) {
		String msg = "";
		for (int i = 0; i < v.length; i++) {
			msg += (n * Integer.parseInt(v[i])) + " ";
		}
		return msg.trim();
	}

}
