public class Game {

    public static void main(String[] args) {

        int gameCount = 3;
        BaseballGame myGame = new BaseballGame(gameCount);

        myGame.genNumber();
        for(int cnt = 0; cnt < gameCount ; cnt++) {
            myGame.inputUserNumber(cnt);
            int strike_num = myGame.checkNumber(cnt);

            if (strike_num == 3) {
                System.out.println("게임 클리어");
                break;
            } else if (cnt == gameCount - 1) {
                System.out.println("게임 클리어 실패");

            }
        }
        myGame.printResult();
    }

}
