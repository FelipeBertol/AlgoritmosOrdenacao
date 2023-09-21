import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    static int[] a = setRandom(10, 10);
    
    public static void main(String[] args) throws Exception {
        long start = System.nanoTime();
        System.out.println("Conjunto A desordenado: " + Arrays.toString(a));
        int[] b = sort(a, 0, a.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(b));
        long end = System.nanoTime();
        System.out.println((end - start) / 1000);
    }

    public static int[] sort(int[] list, int left, int right) {
        
        if (left < right) {
            int middle = (left + right) / 2;
            sort(list, left, middle);
            sort(list, middle + 1, right);
            merge(list, left, middle, right);
        }
        
        return list;
    }

    public static void merge(int[] list, int left, int middle, int right) {
        
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = list[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = list[middle + 1 + i];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                list[k] = leftArray[i];
                i++;
            } else {
                list[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            list[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            list[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static int[] setRandom(int length, int valor) {
        int[] list = new int[length];
        Random random = new Random();


        for (int i = 0; i < length; i++) {
            list[i] = random.nextInt(valor);
        }

        return list;
    }

}
