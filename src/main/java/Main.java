
import java.util.Scanner;

public class Main {
    public static PlayerCharacter player;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        player = new PlayerCharacter(name);
        System.out.println("Hallo "+player.getName() + "! Let's start the game :)");
    }
}
