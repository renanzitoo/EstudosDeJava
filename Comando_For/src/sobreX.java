import java.util.Scanner;

public class sobreX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i=1, b=0, e=0, acc = 1;
		System.out.println("Digite o valor da base");
		b = sc.nextInt();
		System.out.println("Digite o valor da expoente");
		e = sc.nextInt();
		for(i=1;i<=e;i++) {
			acc = acc*b;
		}
		System.out.println("Resultado= "+ acc);
	}

}
