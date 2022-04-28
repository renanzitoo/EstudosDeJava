import java.util.Scanner;
public class Parte1Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float M=0, H=0, T=0;
		
		double C;
		
		System.out.println("Digite a massa");
		M = sc.nextFloat();
		
		System.out.println("Digite a altura");
		H = sc.nextFloat();
		
		System.out.println("Digite o tempo");
		T = sc.nextFloat();
		
		C = (M*H/T)/745.6999;
		
		System.out.println("Os cavalos necessarios para movimentar esse corpo: "+ C);
		
		
		
		
		

	}

}
