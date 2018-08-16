import java.util.Scanner;
import java.io.*;

public class stonesonthetable{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rocks;
		String colors;
		int count=0;
		rocks = sc.nextInt();
		colors = sc.next();
		int size = colors.length();
		for(int i=0; i<size-1; i++){
			char actual = colors.charAt(i);
			char next = colors.charAt(i+1);

			if(actual == next){
				count++;  
			}
		}
		System.out.println(count);
	}
}
