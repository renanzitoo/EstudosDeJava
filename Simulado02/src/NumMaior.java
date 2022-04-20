import java.util.Scanner;
public class NumMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("O primeiro numero é maior: " + n1);
		} else {
			System.out.println("O segundo numero é maior: " + n2);
		}
		
	}

}
