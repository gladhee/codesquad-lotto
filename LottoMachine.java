public class LottoMachine {

    static final int maxX = 20;
    static final int minX = 0;
    static final int maxY = 20;
    static final int minY = 0;

    public void checkWin(LottoBall lottoBall) {
        if (lottoBall.x == 0 && lottoBall.y == 0) {
            lottoBall.isSelected = true;
        }
    }
}
