import java.util.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = sc.nextLine();
		
			System.out.println("Digite uma palavra de sua frase");
			String palavra = sc.nextLine();
			
			System.out.println("Indice da sua palavra: " + frase.indexOf(palavra));
		

	}

}
