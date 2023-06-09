import java.util.Arrays;
import java.util.Scanner;

/**
 * 사용자 수를 입력받고 
 */
public class BaseballGame {

    public Integer[] rand_num = null;
    public Integer[][] user_input = null;
    int strike_num = 0;
    int ball_num = 0;


    public int gameCount = 10;
    public String[] resultText = null;

    public BaseballGame() {
        this.gameCount = 10;
        resultText = new String[gameCount];
        user_input = new Integer[gameCount][3];
    }

    public BaseballGame(int count) {
        this.gameCount = count;
        resultText = new String[gameCount];
        user_input = new Integer[gameCount][3];
    }


    public void inputUserNumber(int cnt) {
        Scanner sc = new Scanner(System.in);
        int value = 0;

        System.out.println(">> 1~9 숫자를 하나씩 입력해 주세요.");
        user_input[cnt] = new Integer[3];

        for (int i = 0; i < 3; i++) {
            value = sc.nextInt();

            // 중복 처리
            if (Arrays.asList(user_input[cnt]).indexOf(value) == -1 && value > 0) {
                user_input[cnt][i] = value;
            } else {
                System.out.println("중복된 값이 있거나 잘못된 값입니다. 다시 입력해 주세요");
                i--;
            }
        }
    }

    public int checkNumber(int cnt) {

        int value = 0;

        int strike_num = 0;
        int ball_num = 0;

        int match_index = -1;
        int i = 0;
        for (int user_num : user_input[cnt]) {
            match_index = Arrays.asList(rand_num).indexOf(user_num);
            if (match_index != -1) {
//                    System.out.println(" >> " + match_index + "  - " + user_num);
                if (match_index == i) {
                    strike_num++;
                } else {
                    ball_num++;
                }
            }
            i++;
        }

        String result = "" + (cnt + 1) + "회차 판정 -- " + strike_num + " 스트라이트 , " + ball_num + " 볼 ";
        System.out.println(result);
        resultText[cnt] = result;

        return strike_num;
    }


}
