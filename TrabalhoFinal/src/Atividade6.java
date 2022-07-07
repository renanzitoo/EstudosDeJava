import java.util.Scanner;
public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km, kmrodado=0;
		int carro;
		Scanner sc = new Scanner(System.in);
		System.out.println("O seu carro é modelo A, B ou C? 1=A, 2=B, 3=C");
		carro = sc.nextInt();
		System.out.println("Quantos km voce quer rodar?");
		km = sc.nextDouble();
		if(carro==1) { 
			kmrodado = km/12;
			System.out.println("Voce vai precisar de " +kmrodado+ "l para chegar ao seu destino");
		}else if(carro==2) { 
			kmrodado = km/9;
			System.out.println("Voce vai precisar de " +kmrodado+ "l para chegar ao seu destino");
		}else if(carro==3) { 
			kmrodado = km/8;
			System.out.println("Voce vai precisar de " +kmrodado+ "l para chegar ao seu destino");
		}else {
			System.out.println("Voce digitou um modelo errado");
		}
		
		
		
		
		
	}

}
