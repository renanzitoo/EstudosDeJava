import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;
		int cont, i;
		System.out.println("Digite a frase");
		frase = sc.nextLine();
		cont = frase.length();
		for (i=cont-1;i>=0;i--) {
			System.out.print(frase.charAt(i));
			
		}
		
	}

}
