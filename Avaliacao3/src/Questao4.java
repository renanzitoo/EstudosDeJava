import java.util.Scanner;
public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1, i=1;
		double som=0;
		System.out.println("Digite o valor de N");
		i1= sc.nextInt();
		for(i=1;i<=i1;i++) {
			som = som + (double) 1/i ;
		}
		System.out.println("A soma é" + som);
		

	}

}
