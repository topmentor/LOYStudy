import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGame {



    public int member = 0;

    public static void main(String[] args) {
        Integer[] rand_num = new Integer[3];
        int value = 0;
        for (int i = 0; i < 3; i++) {
            value = (int) Math.floor(Math.random() * 10); // 0~9
            rand_num[i] = value;
            System.out.println(rand_num[i]);
        }
//        console.log(rand_num);
        int[] user_input = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            value = sc.nextInt();
            user_input[i] = value;
        }

        int strike_num = 0;
        int ball_num = 0;
        int match_index = -1;
        int i = 0;
        for (int user_num : user_input) {
            match_index = Arrays.asList(rand_num).indexOf(user_num);
            if (match_index != -1) {
                System.out.println(" >> " + match_index + "  - " + user_num);
                if (match_index == i) {
                    strike_num++;
                } else {
                    ball_num++;
                }
            }
            i++;
        }
        System.out.println("판정 -- " + strike_num + " 스트라이트 , " + ball_num + " 볼 ");

    }
}
