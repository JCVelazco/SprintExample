import java.util.Scanner;
public class team{
	public static void main(String[] args) {
		Scanner  sc=new Scanner (System.in);

		int problemas =sc.nextInt();
		int total = 0;
		for(int i=0;i<problemas;i++){
			int losQueSiSaben = 0;
			for (int j = 0; j < 3;j++ ) {
				losQueSiSaben+=sc.nextInt();
			}
			if(losQueSiSaben >= 2)
				total++;
		}

		System.out.println(total);
	}


}
