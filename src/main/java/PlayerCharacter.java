public class PlayerCharacter {
    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static int[] move(String w) {
        int[] pos = {0,0};
        if (w.equals("W")) {
            pos = new int[] {0,1};
        }
        return pos;
    }
}
