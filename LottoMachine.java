public class LottoMachine {

    static final int MAX_WALL = 20;
    static final int MIN_WALL = -1;

    public void checkWin(LottoBall lottoBall) {
        if (lottoBall.x == 0 && lottoBall.y == 0) {
            lottoBall.isSelected = true;
        }
    }

    public boolean hitWall(LottoBall lottoBall) {
        if (lottoBall.x == MAX_WALL || lottoBall.x == MAX_WALL || lottoBall.y == MAX_WALL || lottoBall.y == MAX_WALL){
            return false;
        }
        return true;
    }
}
