import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o texto em letras minusculas");
		String minusculo = sc.nextLine();
		
		System.out.println("O texto convertido em letras maiusculas: " + minusculo.toUpperCase());
		
		System.out.println("Digite o texto em letras maiusculas");
		String maiusculo = sc.nextLine();
		
		System.out.println("O texto convertido em letras maiusculas: " + maiusculo.toLowerCase());
		
	}

}
