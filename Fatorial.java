import java.util.Scanner;


public class Fatorial {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(fatorial(n));
	}

	private static int fatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * fatorial(n-1);
		}
	}
}
