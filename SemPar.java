import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SemPar {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		HashMap<String,Integer> d = new HashMap<>();
		
		for (int i = 0; i < numeros.length; i++) {
			if (!(d.containsKey(numeros[i]))) {
				d.put(numeros[i],1);
			} else {
				d.put(numeros[i],2);
			}
		}

		HashSet<String> keys = new HashSet<>(d.keySet());
		Iterator<String> i = keys.iterator();

		while (i.hasNext()) {
			String num = i.next();
			if (d.get(num) == 1) {
				System.out.println(num);
			}
		}
	}
}


