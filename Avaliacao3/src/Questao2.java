import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2,i=1,n3=0;
		System.out.println("Digite o primeiro numero");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero");
		n2= sc.nextInt();	
		
		for(i=1;i<=n2;i++) {
			n3 = n3 + n1;
		}System.out.print("A sua soma é = " + n3);
		}

}
