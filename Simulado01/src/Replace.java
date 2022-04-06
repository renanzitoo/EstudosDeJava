import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase : ");
		String frase = sc.nextLine();
		System.out.println("Escolha uma palavra para ser trocada: ");
		String palavra1 = sc.nextLine();
		System.out.println("Digite a nova palavra: ");
		String palavra2 = sc.nextLine();
		System.out.print("A frase com a palavra trocada é: " + frase.replace(palavra1, palavra2));
		
	
	}

}
