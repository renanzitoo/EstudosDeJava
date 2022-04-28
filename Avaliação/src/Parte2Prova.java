import java.util.Scanner;

public class Parte2Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String frase1, frase2, frase3;
		String resultado1, resultado2;
		int palavra1;
		
		System.out.println("Digite a primeira frase:");
		frase1 = sc.nextLine();
		palavra1 = frase1.indexOf("mecanismo");
		resultado1 = frase1.substring(palavra1);
		System.out.println("Resultado da busca: " + resultado1);
		
		System.out.println("Digite a segunda frase:");
		frase2 = sc.nextLine();
		palavra1 = frase2.indexOf("Paulo");
		resultado2 = "A palavra paulo não foi encontrada";
		System.out.println("Resultado da busca: " + resultado2);
		
		
		

	}

}
