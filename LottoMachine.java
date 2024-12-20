import java.util.List;

public class LottoMachine {

    private static final int MAX_WALL = 20;
    private static final int MIN_WALL = -1;
    // 각 좌표마다의 공 갯수
    int[][] ballCount = new int[MAX_WALL][MAX_WALL];
    //각 좌표위에 올려진 공 번호
    int[][] machine = new int[MAX_WALL][MAX_WALL];


    public void checkWin(LottoBall lottoBall) {
        lottoBall.checkGoal();
    }

    public boolean hitWall(LottoBall lottoBall) {
        if (lottoBall.getX() == MAX_WALL || lottoBall.getX() == MIN_WALL || lottoBall.getY() == MAX_WALL || lottoBall.getY() == MIN_WALL) {
            return false;
        }
        return true;
    }

    public boolean hitBall() {
        for (int i = 0; i < MAX_WALL; i++) {
            for (int j = 0; j < MAX_WALL; j++) {
                if (ballCount[i][j] > 1) return false;
            }
        }
        return true;
    }

    public void addBallCount(LottoBall lottoBall) {
        int ballX = lottoBall.getX();
        int ballY = lottoBall.getY();

        ballCount[ballY][ballX]++;
    }
}
