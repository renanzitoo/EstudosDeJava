import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		//ler 4 notas 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();
		System.out.println();
		System.out.println("Digite sua primeira nota  ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		double nota3 = sc.nextDouble();
		
		System.out.println("Digite sua quarta nota: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4; 
		System.out.println("O aluno(a) " +nome  +" teve a media: " +media);
		
		
		 

	}

}
