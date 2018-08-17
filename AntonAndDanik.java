
import java.util.*;

public class AntonAndDanik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        sc.nextLine();
        String game;
        
        for(int i=0; i<rows; i++){
            game = sc.next();
            System.out.println(getWinner(game));
        }
    }

    public static String getWinner(String game){
        int Anton = 0, Danik = 0;

        for(int i = 0; i<game.length(); i++){
            if(game.charAt(i) == 'A') Anton++;
            else Danik++;
        }

        if(Anton > Danik) return "Anton";
        if(Anton == Danik) return "Friendship";
        else return "Danik";
    }
}