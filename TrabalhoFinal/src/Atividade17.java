import java.util.Scanner;
public class Atividade17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome[] = new String[5];
		String end[] = new String[5];
		String telefone[] = new String[5];
		String busca, buscando;
		int i,i2,i3,i4, limit;
		limit=0;
		for (i=1;i<=5;i++) {
			System.out.println("Digite o nome " + i);
			nome[i] = sc.nextLine();
		}
		for (i2=1;i2<=5;i2++) {
			System.out.println("Digite o endereço " + i2);
			end[i2] = sc.nextLine();
		}
		for (i3=1;i3<=5;i3++) {
			System.out.println("Digite o telefone " + i3);
			telefone[i3] = sc.nextLine();
		}
		System.out.println("Os dados de quem voce quer buscar?");
		busca = sc.nextLine();
		busca = busca.toLowerCase();
		for(i4=1;i4<=5;i4++) {
			buscando = nome[i4].toLowerCase();
			if(busca.equals(buscando)) {
				limit = i4;
				break;
			}
		
		}
		System.out.println("O nome é : " +  nome[limit]);
		System.out.println("O endereço é : " +  end[limit]);
		System.out.println("O telefone é é : " +  telefone[limit]);
		
	}

}
