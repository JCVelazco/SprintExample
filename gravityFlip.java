import java.util.Scanner;
import java.util.Arrays;
public class gravityFlip{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int columnas = sc.nextInt();
		int cubos[] = new int [columnas];
		for(int i = 0; i < columnas;i++)
			cubos[i] = sc.nextInt();
		Arrays.sort(cubos);
		for(int i = 0; i < columnas;i++)
			System.out.print(cubos[i] + " ");
	}
}
