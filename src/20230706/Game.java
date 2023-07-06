import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        int gameCount = 3;

        System.out.println(">>>>>>> 숫자야구 게임을 시작합니다.");
        Scanner sc = new Scanner(System.in);
        int value = 1;

        while(value == 1) {

            System.out.println("\n\n>> 새로운 게임을 시작합니다.");
            startGame(gameCount);

            System.out.println(">> 게임을 계속하시겠습니까? 계속하려면 1을 입력하세요.");
            value = sc.nextInt();

        }

        System.out.println(">>>>>>> 게임을 종료합니다. ");

    }

    public static void startGame(int gameCount){

        BaseballGame myGame = new BaseballGame(gameCount);

        // 랜덤 수 만들기
        MakeNumber maker = new MakeNumber();
        Integer[] comNumber = maker.makeNumber();
        myGame.rand_num = comNumber;

        // 사용자 숫자 입력
        for(int cnt = 0; cnt < gameCount ; cnt++) {

            CaseInfo caseinfo = new CaseInfo(cnt+1);
            myGame.inputUserNumber(caseinfo);
            int strike_num = myGame.checkNumber();

            if (strike_num == 3) {
                System.out.println("\n === 게임 클리어");
                break;
            } else if (cnt == gameCount - 1) {
                System.out.println("\n === 게임 클리어 실패");

            }
        }

        PrintResult printer = new PrintResult();
        printer.print(myGame.caseList);
    }
}
