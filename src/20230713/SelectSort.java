public class SelectSort {

    /**
     * 알고리즘
     * 1. i = 0
     * 2. i부터 N-1까지 가장 크거나 작은값을 찾는다.
     * 3. i와 가장 크거나 작은값을 교환한다. 동일한 값일 경우 교환하지 않는다.
     * 4. ++i
     * 5. 2부터 다시 반복한다.
     */

    public static void main(String[] args) {
        SelectSort obj = new SelectSort();

        System.out.println(">>>>>>>> 시작");
        obj.printValue();

        obj.sort();

        System.out.println(">>>>>>>> 결과");
        obj.printValue();
    }

    int value[] = {5, 3, 8, 2, 10, 9, 4, 1};

    public void sort() {


        for (int i = 0; i < value.length; i++) {
            int minIndex = i;
            int min = value[minIndex];
            for (int j = i; j < value.length; j++) {
                // TODO : 중요! < 와 <= 는 엄연하게 Stability 관점에서 교환하냐 안하냐가 달라질 수 있다.
                if (value[j] < min) {
                    min = value[j];
                    minIndex = j;
                }
            }
            swap(value, i, minIndex);
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
