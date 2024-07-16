import java.util.Scanner;
import java.util.HashSet;

public class ElementosDuplicados {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] elementos = sc.nextLine().split(" ");
		System.out.println(elementosDuplicados(elementos));
	}

	public static String elementosDuplicados(String[] v) {
		
		HashSet<String> s = new HashSet<>();
		for (int i = 0; i < v.length; i++) {
			if (!(s.add(v[i]))) {
				return "true";
			}
		}
		return "false";
	}

}
