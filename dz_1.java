
import java.util.Arrays;

public class dz_1 {
    public static void getArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 43, 5, 87, 2, 9, 17 };
        System.out.println(Arrays.toString(array));

        getArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d  ",array[i] );
        }


    }
}
