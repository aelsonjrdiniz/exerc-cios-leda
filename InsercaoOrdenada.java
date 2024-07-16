import java.util.Scanner;
import java.util.Arrays;


public class InsercaoOrdenada {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		int pos = 0;
		while (pos < numeros.length-1 && Integer.parseInt(numeros[pos]) > Integer.parseInt(numeros[pos+1])) {
			String auxiliar = numeros[pos];
			numeros[pos] = numeros[pos+1];
			numeros[pos+1] = auxiliar;
			pos++;
		}
		System.out.println(Arrays.toString(numeros));
	}
}
