import java.util.Scanner;

public class Senhas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int senha;
		
		System.out.println("Digite a senha");
		senha = sc.nextInt();
		
		if (senha == 1234) {
			System.out.println("O seu acesso foi liberado");
		} else {
			System.out.println("Seu acesso foi negado");
		}

	}

}
