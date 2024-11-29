import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Оригінальний  массив:");
        System.out.println(Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.println("Відсортований масив:");
        System.out.println(Arrays.toString(array));

        int target = array[random.nextInt(array.length)];
        System.out.println("Пошук елемента: " + target);

        int index = ArrayUtils.binarySearch(array, target);
        if (index != -1) {
            System.out.println("Елемент знайдено на позиції: " + index);
        } else {
            System.out.println("Елемент не знайдено.");
        }
    }
}
