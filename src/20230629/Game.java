public class Game {

    public static void main(String[] args) {

        int gameCount = 3;
        BaseballGame myGame = new BaseballGame(gameCount);

        // 랜덤 수 만들기
        MakeNumber maker = new MakeNumber();
        Integer[] comNumber = maker.makeNumber();
        myGame.rand_num = comNumber;

        // 사용자 숫자 입력
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

        // 결과 출력을 위한 준비
        Integer[][] userNumber = myGame.user_input;
        String[] resultText = myGame.resultText;

        PrintResult printer = new PrintResult();
        printer.print(userNumber , resultText);
    }

}
