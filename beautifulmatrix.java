import java.util.Scanner;

public class beautifulmatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++){
				if(sc.nextInt() == 1){
					total = Math.abs(3-i) + Math.abs(3-j);
					break;
				}
			}
			if(total != 0) break;
		}
		System.out.println(total);
	}
}
