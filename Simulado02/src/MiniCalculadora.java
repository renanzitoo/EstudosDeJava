import java.util.Scanner;
public class MiniCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner(System.in);
		char op;
		double num1, num2, res=0 ;
		
		//Parte da leitura de dados
		System.out.println("Digite o primeiro numero a ser calculado");
		num1 = sc.nextDouble();
		
		System.out.println("Digite a opera��o para ser feita");
		op = sc.next().charAt(0);
		
		System.out.println("Digite o segundo numero a ser calculado");
		num2 = sc.nextDouble();
		
		
		//Parte das varia��es de opera��es
		if (op == '+') {
			res = num1 + num2;
				System.out.println("O resultado �: " + res);
		}else if (op == '-') {
			res = num1 - num2;
			System.out.println("O resultado �: " + res);
		}else if (op == '*') {
			res = num1 * num2;
			System.out.println("O resultado �: " + res);
		}else if (op == '/') {
		 if  (num2 != 0){
			res = num1 * num2;
			System.out.println("O resultado �: " + res);
			}
			else {
				System.out.println("O numero n�o � divisivel por 0");
			}
		}else {
				System.out.println("O operador digitado � invalido");
		}
		
	}

}
