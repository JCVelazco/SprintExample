import java.util.Scanner;
public class bear{
	public static void main(String[] args) {
		Scanner  sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int tiempo=0;
		while(a<=b)
		{
			a= 3*a;
			b=2*b;
			tiempo++;
		}
		System.out.println(tiempo);
	}
}
