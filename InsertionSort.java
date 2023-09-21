import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
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
        for (int i = 0; i < list.length; ++i) {
            list[i] = random.nextInt(10);
        }
        System.out.println("Conjunto A desordenado: " + Arrays.toString(a));
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
        return list;
    }
}
