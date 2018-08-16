import java.util.Scanner;

public class vanyaandfence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfFriends = sc.nextInt();
		int heightOfTheFence = sc.nextInt();
		int totalWidth = 0;
		for (int i = 0;i < numberOfFriends; i++) {
			int actualHeigth = sc.nextInt();
			if(actualHeigth < heightOfTheFence) totalWidth+= 2;
			else totalWidth++;
		}
		System.out.println(totalWidth);
	}
}
