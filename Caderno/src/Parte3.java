import java.util.Scanner;
public class Parte3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("Digite a frase");
		frase = sc.nextLine();
		
		System.out.println("Letras a trocadas por 1" + frase.replace('a', '1'));
		System.out.println("Letras e trocadas por 2" + frase.replace('e', '2'));
		System.out.println("Letras i trocadas por 3" + frase.replace('i', '3'));
		System.out.println("Letras o trocadas por @" + frase.replace('o', '@'));
		System.out.println("Letras u trocadas por 5" + frase.replace('u', '5'));


		
}
}