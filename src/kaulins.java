import java.util.Random;
import java.util.Scanner;

public class kaulins {
static void mestKaulinu(int reizes){
	int skaitlis;
Random rand = new Random();
for(int i=1; i<=reizes; i++){
skaitlis= rand.nextInt(6)+1;
System.out.println("Uzkrita skaitlis: "+skaitlis);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
int reizes;
System.out.println("cik reizes"); reizes = scan.nextInt();
mestKaulinu(reizes);
System.out.println("Beigas");
scan.close();



	}

}
