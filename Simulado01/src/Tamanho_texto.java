import java.util.Scanner;

public class Tamanho_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um texto");
		String tamanho = sc.nextLine();
		
		System.out.println("O tamanho do texto é : " + tamanho.length());

	}

}
