import java.util.Scanner;
public class PARTE3prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int clientes;
		System.out.println("Digite a quantidade de clientes atendidos no dia:");
		clientes = sc.nextInt();
		if(clientes<=20) {
			System.out.println("O petshop ficou ocioso");
		} else if (clientes>=30) {
			System.out.println("O cliente não foi atendido");
			
		} else {
			System.out.println("O cliente foi atendido");
		}
		
		
	}

}
