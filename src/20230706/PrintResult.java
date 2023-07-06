import java.util.ArrayList;

/**
 * 게임의 결과를 출력하는 클래스
 */
public class PrintResult {

    public void print(ArrayList<CaseInfo> caseList) {

        System.out.println("\n\n입력한 모든 값 ------------------------------ ");


        for (CaseInfo obj : caseList) {
            Integer[] user_input = obj.getUser_input();
             System.out.println("" + obj.getCaseNo() + "회차 입력 값 : " +  user_input[0] + " , " + user_input[1] + " , " + user_input[2]);
        }
        System.out.println("\n전체 결과 보기 ------------------------------ ");

        for (CaseInfo obj : caseList) {
            System.out.println(obj.getResultText());
        }
        System.out.println("---------------------------------------- ");

    }
}
