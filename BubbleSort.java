import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
     static int[] a = new int[10];
    public static void main(String[] args) throws Exception {
        
        int[] b = new int[10];
        long start = System.nanoTime();
        b = sort(a);
        System.out.println("Conjunto B ordenado: " + Arrays.toString(b));
        long end = System.nanoTime();
        System.out.println((end - start) / 1000);
    }

    public static int[] sort(int[] list) {
        Random random = new Random();
        int aux;
        for (int i = 0; i < list.length; ++i) {
            list[i] = random.nextInt(10);
        }
        System.out.println("Conjunto A desordenado: " + Arrays.toString(a));
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {
                    aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
        return list;
    }
}
