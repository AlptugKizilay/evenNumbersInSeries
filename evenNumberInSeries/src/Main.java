import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {7, 12, 5, 8, 7, 7, 8, 12, 2, 3, 1};
        int[] dublicate = new int[list.length];
        int starIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[starIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : dublicate) {
            if (value != 0 && value % 2 == 0) {
                System.out.println(value);
            }
        }
    }

}
