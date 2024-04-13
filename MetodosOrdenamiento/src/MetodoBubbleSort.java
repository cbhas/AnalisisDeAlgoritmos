public class MetodoBubbleSort {

    public static void main(String[] args) {
        int[] array = generateArrayDesc(10000);

        long timeStart = System.currentTimeMillis();
        bubbleSort(array);
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

    public static int[] bubbleSort(int[] array) {
        int aux;
        int[] arrayOrdenado;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        arrayOrdenado = array;

        return arrayOrdenado;
    }

}
