public class LottoBall {

    private final int number;

    private int x;

    private int y;
    private boolean isSelected;
    public LottoBall(int number, int x, int y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.isSelected = false;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public int getNumber() {
        return number;
    }

    public boolean getSelected() {
        return isSelected;
    }

    public void checkGoal() {
        if (this.x == 0 && this.y == 0) {
            this.isSelected = true;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
