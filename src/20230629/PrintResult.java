/**
 * 게임의 결과를 출력하는 클래스
 */
public class PrintResult {

    public void print(Integer[][] user_input, String[] resultText) {
        System.out.println("\n\n입력한 모든 값 ------------------------------ ");


        for (int i = 0; i < user_input.length; i++) {
            if (user_input[i] != null && user_input[i][0] != null) {
                System.out.println("" + (i + 1) + "회차 입력 값 : " + user_input[i][0] + " , " + user_input[i][1] + " , " + user_input[i][2]);
            }else{
                break;
            }
        }
        System.out.println("\n전체 결과 보기 ------------------------------ ");
        for (String res : resultText) {
            if (res != null && !res.equals("")) {
                System.out.println(res);
            }
        }
        System.out.println("---------------------------------------- ");

    }
}
