public class MetodoSelectionSort {

    public static void main(String[] args) {
        int[] array = generateArrayDesc(1000);

        long timeStart = System.currentTimeMillis();
        selectionSort(array);
        long timeEnd = System.currentTimeMillis();

        System.out.println("Tiempo de ordenamiento: " + (timeEnd - timeStart) + " milisegundos (ms)");
    }

    public static int[] generateArrayDesc(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }

        return array;
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = array[maxIndex];

            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
}
