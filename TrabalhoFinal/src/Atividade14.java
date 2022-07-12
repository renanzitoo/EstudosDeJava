import java.util.Scanner;
public class Atividade14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero a ser analizado");
		num = sc.nextInt();
		for(i=1;i<=num;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

}
