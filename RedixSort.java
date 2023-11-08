import java.util.Arrays;
public class RedixSort {

        public static void main(String[] args) {
            int[] arr = {456, 128, 752, 956, 185, 361, 678, 462};
            radixSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }

        public static void radixSort(int[] arr) {
            int max = Arrays.stream(arr).max().getAsInt();
            for (int exp = 1; max / exp > 0; exp *= 10) {
                countingSortByDigit(arr, exp);
            }
        }

        public static void countingSortByDigit(int[] arr, int exp) {
            int n = arr.length;
            int[] output = new int[n];
            int[] count = new int[10];

            Arrays.fill(count, 0);

            // Count occurrences of each digit in the current place value
            for (int i = 0; i < n; i++) {
                count[(arr[i] / exp) % 10]++;
            }

            // Compute the cumulative count (prefix sum) of the count array
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Build the output array
            for (int i = n - 1; i >= 0; i--) {
                output[count[(arr[i] / exp) % 10] - 1] = arr[i];
                count[(arr[i] / exp) % 10]--;
            }

            // Copy the output array to the original array
            for (int i = 0; i < n; i++) {
                arr[i] = output[i];
            }
        }
    }


