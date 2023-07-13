public class BubbleSort {
    /**
     * 알고리즘
     * 1. i = 0;
     * 2. i가 n-1이면 끝낸다.
     * 3. j = 1;
     * 4. j가 n-i가 되면 7로 간다.
     * 5. a[j-1] > a[j] 이면 두 값을 교환한다,
     * 6. j를 하나 증가시키고 4로 돌아간다.
     * 7. i를 하나 증가시키고 2로 돌아간다.
     */
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();

        System.out.println(">>>>>>>> 시작");
        obj.printValue();

        obj.sort();

        System.out.println(">>>>>>>> 결과");
        obj.printValue();
    }

    int value[] = {5, 3, 8, 2, 10, 9, 4, 1};

    public void sort() {
        for (int i = 0; i < value.length - 1; i++) {
            for (int j = 1; j < value.length - i; j++) {
                if (value[j - 1] > value[j]) {
                    swap(value, j - 1, j);
                }
            }
            printValue();
        }
    }
    private void swap(int array[], int index1, int index2) {
        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }

    private void printValue() {

        StringBuilder builder = new StringBuilder();
        for (int i=0;i<value.length;i++) {
            builder.append(value[i]).append(" ");
        }

        System.out.println(builder.toString());
    }
}
