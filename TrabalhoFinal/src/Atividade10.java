import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double Y=0, X;
		System.out.println("Digite o valor de X");
		X= sc.nextDouble();
		if(X<=1) { 
			Y=1;
			System.out.println("O valor de Y é" + Y);
		}else if (X>1 && X<=2){ 
			Y=2;
			System.out.println("O valor de Y é" + Y);
		}else if (X>2 && X<=3){ 
			Y= Y*Y;
			System.out.println("O valor de Y é" + Y);
		}else if (X>3 && X<=4){ 
			Y=Y*Y*Y;
			System.out.println("O valor de Y é" + Y);
		}
	}

}
