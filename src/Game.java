public class Game {

    public static void main(String[] args) {

        int gameCount = 3;
        BaseballGame myGame = new BaseballGame(gameCount);

        myGame.start();
        myGame.printResult();

    }
}
