public class Application {

    public static void main(String[] args) {
        LottoMachine lottoMachine = new LottoMachine();
        NumberGenerator numberGenerator = new NumberGenerator();
        LottoGame lottoGame = new LottoGame(numberGenerator, lottoMachine);

        lottoGame.run();
    }

}
