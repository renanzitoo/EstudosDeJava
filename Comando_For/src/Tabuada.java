import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=0, i=0,t=0;
		
		System.out.println("Digite qual tabuada voce quer saber");
		x = sc.nextInt();
		
		for(i=0;i<=10;i++) {
			t=x*i;
			System.out.println(x + " * " + i +  " = " + t );
			
		}
		

	}

}
