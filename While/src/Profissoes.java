import java.util.Scanner;
public class Profissoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String profissao, dentista;
		int dentistas=0;
		dentista = "Dentista";
		do {
			System.out.println("Digite a profissão");
			profissao=sc.nextLine();
			profissao = profissao.toUpperCase();
			if(profissao.equals("DENTISTA")) {
				dentistas++;
			}
			
		}while(!profissao.equals("FIM"));
		System.out.println("Numero de dentistas = "+dentistas);
		

	}

}
