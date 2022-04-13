import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		double l1, l2, l3;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro lado do triangulo: ");
		l1 = sc.nextDouble();
		System.out.println("Digite o segundo lado do triangulo: ");
		l2 = sc.nextDouble();
		System.out.println("Digite o terceiro lado do triangulo: ");
		l3 = sc.nextDouble();
		
		if (l1 == l3 && l1 == l2 && l2 == l3) {
			System.out.println("O seu triangulo é equilatero");
		}
		
		else {
			System.out.println("Seu triangulo não é equilatero");
		}

	}

}
