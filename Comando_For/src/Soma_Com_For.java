import java.util.Scanner;
public class Soma_Com_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=0, n2=0, i=0, acc=0;
		
		System.out.println("Digite o primeiro valor: ");
		n1=sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		n2=sc.nextInt();
		
		for(i=n1;i<=n2;i++) {
			acc= acc + i;
		}
		System.out.println("O valor do acumulador é:" + acc);
		
		
		

	}

}
