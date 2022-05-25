import java.util.Scanner;
public class CmParaPolegadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, i=0;
		double pol;
		System.out.println("Digite os cm");
		n = sc.nextInt();
		for(i=0;i<=n;i++) {
			pol = i * 2.54;
			System.out.println(i + " Centimetros equivalem a " + pol + "Polegadas");
		}

	}

}
