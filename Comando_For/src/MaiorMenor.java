import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i=0, maior=0, menor=0, n1=0;
		System.out.println("Digite o valor de n" +(i+1));
		n1=sc.nextInt();
		maior = n1;
		menor = n1;
		
		for(i=0;i<3;i++) {
		System.out.println("Digite o valor de n" +(i+1));
		n1=sc.nextInt();
		if(menor>n1) {
			menor=n1;
		} else if (maior<n1) {
			maior=n1;
		}
		}
		System.out.println("O maior valor = "+maior);
		System.out.println("O menor valor = "+menor);
	}

}
