import java.util.Scanner;
public class QuadradoDe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Digite um numero");
			n=sc.nextInt();
			System.out.println("O valor do quadrado de N é " + n*n);
			
		}while(n%6!=0);

	}

}
