import java.util.Scanner;

public class Acumulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=0,i=1,acc=1;
		
		System.out.println("Digite o valor de n");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++){
			acc=acc*i;
		}
		
		System.out.println("O valor da multiplicação é: " + acc);
		

	}

}
