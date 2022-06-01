import java.util.Scanner;
public class serie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=1, n=0;
		double s=0;
		
		System.out.println("Digite o valor de n");
		n = sc.nextInt();
		
		for(i=1;i<n;i=i+2) {
			s=s+(1/i);
		}
		System.out.println("O valor de s é = "+s);
	

	}

}
