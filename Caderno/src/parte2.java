import java.util.Scanner;
public class parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double angulo;
		
		System.out.println("Digite o angulo a ser analizado");
		angulo = sc.nextDouble();
		
		if(angulo == 90) {
			System.out.println("O seu triangulo é um triangulo retangulo");
		} else if(angulo>=90) {
			System.out.println("O seu triangulo é um triangulo obtusangulo");
		} else if(angulo<=90) {
			System.out.println("O seu triangulo é um triangulo acutangulo");
		}
		
		
		

	}

}
