import java.util.Scanner;
public class PARTE4avalia��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int mes;
		System.out.println("Digite o numero do mes");
		mes = sc.nextInt();
		
		if(mes==0|| mes>=13) {
			System.out.println("O mes digitado � invalido");
		} else if(mes==1) {
			System.out.println("O mes �: Janeiro ");
		}else if(mes==2) {
			System.out.println("O mes �: Fevereiro ");
		}else if(mes==3) {
			System.out.println("O mes �: Mar�o ");
		}else if(mes==4) {
			System.out.println("O mes �: Abril ");
		}else if(mes==5) {
			System.out.println("O mes �: Maio ");
		}else if(mes==6) {
			System.out.println("O mes �: Junho ");
		}else if(mes==7) {
			System.out.println("O mes �: Julho ");
		}else if(mes==8) {
			System.out.println("O mes �: Agosto ");
		}else if(mes==9) {
			System.out.println("O mes �: Setembro");
		}else if(mes==10) {
			System.out.println("O mes �: Outubro ");
		}else if(mes==11) {
			System.out.println("O mes �: Novembro");
		}else if(mes==12) {
			System.out.println("O mes �: Dezembro ");
		}
		

	}

}
