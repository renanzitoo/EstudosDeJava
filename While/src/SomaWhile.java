import java.util.Scanner;
public class SomaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double soma=0 , n1=0;
		
		do {
			System.out.println("Digite um numero");
			n1=sc.nextInt();		
			soma = soma + n1;
		}while(n1!=0);
		System.out.println("A soma é: "+ soma);
	}

}
