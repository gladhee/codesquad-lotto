import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoGame {

    private final NumberGenerator numberGenerator;
    private final LottoMachine lottoMachine;
    private final List<LottoBall> lottoBalls;
    private final List<LottoBall> winningBalls;

    public LottoGame(NumberGenerator numberGenerator, LottoMachine lottoMachine) {
        this.numberGenerator = numberGenerator;
        this.lottoMachine = lottoMachine;
        this.lottoBalls = new ArrayList<>();
        this.winningBalls = new ArrayList<>();
    }

    public void run() {
        createLottoBalls();

        while (winningBalls.size() <= 6) {
            for (LottoBall lottoBall : lottoBalls) {
                int moveX = numberGenerator.generateMovement();
                int moveY = numberGenerator.generateMovement();
                if (!lottoMachine.hitWall(lottoBall)) {

                }

                lottoBall.move(moveX,moveY);
                lottoMachine.addBallCount(lottoBall);
                lottoMachine.checkWin(lottoBall);
                if (lottoBall.getSelected()) {
                    winningBalls.add(lottoBall);
                }
                lottoMachine.hitWall(lottoBall);

            }
        }
        printWinningNumber();
    }

    private void createLottoBalls() {
        for (int i = 0; i < 45; i ++) {
            int initX = numberGenerator.generateInitIndex();
            int initY = numberGenerator.generateInitIndex();
            int lottoNumber = numberGenerator.generateLottoNumber();

            lottoBalls.add(new LottoBall(lottoNumber, initX, initY));
        }
    }

    private void printWinningNumber() {
        StringBuilder sb = new StringBuilder();

        for (LottoBall lottoBall: winningBalls) {
            sb.append(lottoBall.getNumber())
                    .append(" ");
        }

        System.out.println(sb);
    }

}
