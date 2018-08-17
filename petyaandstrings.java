import java.util.Scanner;
public class Petyaandstrings  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linea1 = sc.nextLine(), linea2 = sc.nextLine();
		String palabra1 = linea1.toLowerCase(), palabra2 = 
linea2.toLowerCase();
		int val = 0;
		for (int i = 0; i < palabra1.length(); i++)
			if (palabra1.charAt(i) == palabra2.charAt(i))
				continue;
			else if (palabra1.charAt(i) < 
palabra2.charAt(i)) {
				val = -1;
				break;
			} else {
				val = 1;
				break;
			}
		System.out.println(val);
	}
}

