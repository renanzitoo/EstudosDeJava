import java.util.Scanner;
public class PARTE4avaliação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int mes;
		System.out.println("Digite o numero do mes");
		mes = sc.nextInt();
		
		if(mes==0|| mes>=13) {
			System.out.println("O mes digitado é invalido");
		} else if(mes==1) {
			System.out.println("O mes é: Janeiro ");
		}else if(mes==2) {
			System.out.println("O mes é: Fevereiro ");
		}else if(mes==3) {
			System.out.println("O mes é: Março ");
		}else if(mes==4) {
			System.out.println("O mes é: Abril ");
		}else if(mes==5) {
			System.out.println("O mes é: Maio ");
		}else if(mes==6) {
			System.out.println("O mes é: Junho ");
		}else if(mes==7) {
			System.out.println("O mes é: Julho ");
		}else if(mes==8) {
			System.out.println("O mes é: Agosto ");
		}else if(mes==9) {
			System.out.println("O mes é: Setembro");
		}else if(mes==10) {
			System.out.println("O mes é: Outubro ");
		}else if(mes==11) {
			System.out.println("O mes é: Novembro");
		}else if(mes==12) {
			System.out.println("O mes é: Dezembro ");
		}
		

	}

}
