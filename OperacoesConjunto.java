import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

public class OperacoesConjunto {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Digite 1 para realizar União, 2 para Diferença, 3 para Intersecção"
					+ " e 4 para encerrar o programa: ");
			int escolha = Integer.parseInt(sc.nextLine());
			if (escolha == 4) {
				break;
			}

			System.out.println("Insira o conjunto 1 separando os elementos com um espaço: ");
			String[] conjunto1 = sc.nextLine().split(" ");
			System.out.println("Insira o conjunto 2 separando os elementos com um espaço: ");
			String[] conjunto2 = sc.nextLine().split(" ");
			
			switch (escolha) {
				case 1:
					System.out.println(Arrays.toString(uniao(conjunto1, conjunto2)));
					break;
				case 2:
					System.out.println(Arrays.toString(diferenca(conjunto1, conjunto2)));
					break;
				case 3:
					System.out.println(Arrays.toString(interseccao(conjunto1, conjunto2)));
					break;
				default:
					System.out.println("Deixa de ser burro, pow");
					break;
			}
		
		}
	
	}
	
	public static String[] uniao(String[] v, String[] u) {
		HashSet<String> conjunto = new HashSet<>();
		
		for (int i = 0; i < v.length; i++) {
			conjunto.add(v[i]);
		}	
		for (int j = 0; j < u.length; j++) {
			conjunto.add(u[j]);
		}

		String[] resultado = new String[conjunto.size()];			
		Iterator<String> i = conjunto.iterator();
		int pointer = 0;

		while (i.hasNext()) {
			resultado[pointer++] = i.next();
		}
		
		return resultado;
	}

	public static String[] diferenca(String[] v, String[] u) {
		HashSet<String> conjunto = new HashSet<>();

		for (int i = 0; i < v.length; i++) {
			conjunto.add(v[i]);
		}

		for (int j = 0; j < u.length; j++) {
			conjunto.remove(u[j]);
		}
		

		String[] resultado = new String[conjunto.size()];
		Iterator<String> i = conjunto.iterator();
		int pointer = 0;

		while (i.hasNext()) {
			resultado[pointer++] = i.next();
		}
	
		return resultado;
	}

	public static String[] interseccao(String[] v, String[] u) {
		HashSet<String> conjunto1 = new HashSet<>();
		HashSet<String> conjunto2 = new HashSet<>();

		for (int i = 0; i < v.length; i++) {
			conjunto1.add(v[i]);
		}

		for (int j = 0; j < u.length; j++) {
			conjunto2.add(u[j]);
		}

		Iterator<String> i = conjunto1.iterator();
		String[] resultado = new String[conjunto1.size() + conjunto2.size()];
		int pointer = 0;

		while (i.hasNext()) {
			String elemento = i.next();
			if (conjunto2.contains(elemento)) {
				resultado[pointer++] = elemento;
			}
		}
		
		String[] naoNula = new String[pointer];
		int pointer2 = 0;

		for (String s: resultado) {
			if (s != null) {
				naoNula[pointer2++] = s;		
			}
		}
		
		return naoNula;
	
	}
}
