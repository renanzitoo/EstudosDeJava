import java.util.Scanner;
public class Voto { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano, anoV;
		System.out.println("Digite seu ano de nascimento: ");
		ano = sc.nextInt();
		
		anoV= 2022-ano;
		
		if(anoV>= 16) {
			System.out.println("Voce ja pode votar");
		} else {
			System.out.println("Voce não pode votar");
		}
		
	}

}
