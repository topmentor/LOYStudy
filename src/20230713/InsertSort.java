
public class InsertSort {
    /**
     * 알고리즘
     * 1. i = 1
     * 2. j = i;
     * 3. t = arr[i]
     * 3. array[j-1] > array[i] && j > 0 인동안
     * 3-1. array[j] = array[j-1];
     * 3-2. j--;
     * 4. arr[j] = t;
     * 5. i++; 반복
     */

    public static void main(String[] args) {
        InsertSort obj = new InsertSort();

        System.out.println(">>>>>>>> 시작");
        obj.printValue();

        obj.sort();

        System.out.println(">>>>>>>> 결과");
        obj.printValue();
    }
    int value[] = {5, 3, 8, 2, 10, 9, 4, 1};

    public void sort() {

        for (int i = 1; i < value.length; i++) {
            int j = i;
            int t = value[i];
            while (j > 0 && value[j - 1] > t) {
                value[j] = value[j - 1];
                j--;
            }
            value[j] = t;
            printValue();
        }

    }

    private void printValue() {

        StringBuilder builder = new StringBuilder();
        for (int i=0;i<value.length;i++) {
            builder.append(value[i]).append(" ");
        }

        System.out.println(builder.toString());
    }
}