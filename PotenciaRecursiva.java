import java.util.Scanner;

public class PotenciaRecursiva {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		int j = Integer.parseInt(sc.nextLine());
		System.out.println(potenciaRecursiva(i,j));
	}

	public static int potenciaRecursiva(int i, int j) {
		if (j == 0) {
			return 1;
		} else {
			return i * potenciaRecursiva(i,j-1);
		}
	}
}
