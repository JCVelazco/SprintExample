import java.util.*;

public class WordCapitalization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        CharSequence first = word.subSequence(0,1);

        String toCapital = first.toString();
        String capital = toCapital.toUpperCase();
        
        System.out.println(word.replaceFirst(toCapital, capital));
    }
}