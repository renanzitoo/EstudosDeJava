import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =  new Scanner(System.in);
		int a, b , c;
		double  delta, x1, x2;
		
		System.out.println("Digite o numero a: ");
		a = sc.nextInt();
		
		System.out.println("Digite o numero B: ");
		b = sc.nextInt();
		
		System.out.println("Digite o numero C: ");
		c = sc.nextInt();
		
		delta = (b*b) - 4*a*c;
		
		if (delta>0) {
			System.out.println("O delta não pode ser negativo");
		}else {
		
		x1 = (b * (-1) + Math.sqrt(delta))/2*a;
		x2 = (b * (-1) - Math.sqrt(delta))/2*a;
		
		System.out.println("O x1 é : "  + x1);
		System.out.println("O x2 é : "  + x2);
		}
		
	}

}
