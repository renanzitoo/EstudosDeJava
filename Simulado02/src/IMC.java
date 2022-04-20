import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parte de declarações de variaveis
		Scanner sc = new Scanner(System.in);
		double altura, imc;
		int sex;
		
		//Leitura de dados
		System.out.println("Qual o seu sexo digite 1 para masculino e 2 para feminino");
		sex = sc.nextInt();
		
		//Processamento de dados 
		if(sex == 1) {
			System.out.println("Digite sua altura");
			altura = sc.nextDouble();
			imc = altura * 72.7 - 58;
			System.out.println("O seu Peso ideal é" + imc);
		}
		
		else if(sex == 2) {
			System.out.println("Digite sua altura");
			altura = sc.nextDouble();
			imc = altura * 62.1 - 44.7;
			System.out.println("O seu Peso ideal é " + imc);
		}
		
		//Caso erro no programa
		
		else {
			System.out.println("Você digitou um número inválido");
		}
		

	}

}
