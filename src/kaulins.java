import java.util.Random;
import java.util.Scanner;

public class kaulins {
static void mestKaulinu(int reizes){
	int skaitlis;
	int lielakais;
Random rand = new Random();
for(int i=1; i<=reizes; i++){
skaitlis= rand.nextInt(6)+1;
System.out.println("Uzkrita skaitlis: "+skaitlis);

if(lielakais<skaitlis) {
	lielakais=skaitlis;
	
}
System.out.println("Liel�kais skaitlis no metieniem bija: "+lielakais);
	}
}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
int reizes;

do {
System.out.println("cik reizes"); reizes = scan.nextInt();
mestKaulinu(reizes);
}while(reizes<1);
System.out.println("Beigas");
scan.close();



	}

}
