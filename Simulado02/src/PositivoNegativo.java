import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		double n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero a ser verificado: ");
			n1= sc.nextDouble();
			
			if (n1>=0) {
				System.out.println("Seu numero é positivo");
			} else {
				System.out.println("Seu numero é negativo");
			}
			
			

	}

}
