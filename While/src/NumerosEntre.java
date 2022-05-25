import java.util.Scanner;
public class NumerosEntre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, cont=0;
		do {
			System.out.println("Digite o valor de n");
			n = sc.nextInt();
			if(n>=100 && n<=200) {
				cont++;
			}
		}while(n!=0);
		
		System.out.println("Numeros entre 100 e 200 = "+ cont);

	}

}
