import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5, 2};
        mergeSort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.println(num);
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left<right){
            int mid = left + (left+right) / 2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
            int n1 = mid - left+1;
            int n2 = right-mid;

            int[] L = new int[n1];
            int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        // Merge the temporary arrays back into arr[]
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] and R[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

