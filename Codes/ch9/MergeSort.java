import java.util.concurrent.ExecutionException;

public class MergeSort {
    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = arr[left + i];
        }
        
        for (int i = 0; i < n2; ++i) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = 1;

        while (i < n1 && j < n2) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 10, 4, 5, 9, -4, 3, 1, -7 };

        System.out.println("Given Array\n");

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}