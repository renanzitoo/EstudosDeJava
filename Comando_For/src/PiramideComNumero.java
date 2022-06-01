import java.util.Scanner;
public class PiramideComNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0, i2=0, n=0;
		
		System.out.println("Digite o valor de N");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++) {
			for(i2=1;i2<=i;i2++) {
			
			System.out.print(i);
			}
			System.out.println(" ");
		}	

	}

}
