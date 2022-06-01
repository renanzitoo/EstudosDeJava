import java.util.Scanner;
public class NumeroTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i=1, triangular=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite um numero");
			n = sc.nextInt();
			for (i=1;i<=n;i++) {
				if(i*(i+1)*(i+2)==n) {
					System.out.println("O numero é triangular");
				}
			}
		}while (n!=0);
	}

}
