import java.util.Scanner;

public class AlunoStatus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double media, n1 , n2;
		
		
		System.out.println("Digite a primeira nota nota do aluno: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2)/2;
		
		
	
		if (media > 10 || media < 0 || n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10) {
			System.out.println("Entrada invalida");
			System.exit(1);
		}
		
		
		if(media >= 6) {
			System.out.println("A media do aluno foi: " + media);
			System.out.println("Aprovado");
		}
		
		else {
			System.out.println("A media do aluno foi: " + media);
			System.out.println("Reprovado");
		}

	}

}
