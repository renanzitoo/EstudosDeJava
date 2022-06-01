import java.util.Scanner;
public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, primo=0;
		do {
			System.out.println("Digite um numero");
			i = sc.nextInt();
			if (i>1 && i%2!=0 || i==2) {
				primo++;
			}
			
		}while(i!=0);
		System.out.println("A quantidade de numeros primos é = " + primo);
	}

}
