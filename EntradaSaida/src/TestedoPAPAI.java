import java.util.Scanner;

public class TestedoPAPAI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu sexo? 0 para masculino 1 para feminino");
		int gender = sc.nextInt();
		if (gender == 0){
			System.out.println("Qual sua altura em cm?");
			double alt = sc.nextDouble();
			System.out.println("Qual seu peso?");
			double height = sc.nextDouble();
			double imc = height/(alt*alt);
			System.out.println("O seu imc é :" +imc);
		
		}
		
		else {
			System.out.println("Qual sua altura em cm?");
			double alt = sc.nextDouble();
			System.out.println("Qual seu peso?");
			double height = sc.nextDouble();
			double imc = height/(alt*alt);
			System.out.println("O seu imc é :" +imc);
		}
		
		
		
		
	}

}
