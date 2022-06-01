import java.util.Scanner;
public class TaxaNatalidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double cid1, cid2;
		int i=0;
		cid1=5000000;
		cid2=7000000;
		do {
			
			cid1 = cid1 +(cid1*0.03);
			cid2= cid2 +(cid2*0.02);
			i++;
		}while(cid2>cid1);
		System.out.println("Foram necessarios " + i + "anos");
	}

}
