public class PlayerCharacter {

    static int[] currentPosition = {0,0};

    public static int getX() {
        return currentPosition[0];
    }

    public static int getY() {
        return currentPosition[1];
    }

    public static int[] move(String w) {
        int[] pos = {getX(),getY()};
        switch (w) {
            case "W":
                pos[1] = pos[1] + 1;
                break;
            case "S":
                pos[1] = pos[1] - 1;
                break;
            case "D":
                pos[0] = pos[0] + 1;
                break;
            case "A":
                pos[0] = pos[0] - 1;
                break;
            default:
        }
        return pos;
    }
}
