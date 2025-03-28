public class PlayerCharacter {

    int[] currentPosition;

    public String name;

    public PlayerCharacter(String name) {
        this.setName(name);
        this.currentPosition = new int[] {0,0};
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return this.currentPosition[0];
    }

    public int getY() {
        return this.currentPosition[1];
    }

    public int[] move(String w) {
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
