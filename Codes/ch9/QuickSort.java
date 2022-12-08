public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int divide(int[] arr, int low, int high) {
        int pivot = arr[high];
        int cnt = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                cnt++;
                swap(arr, cnt, i);
            }
        }
        swap(arr, cnt + 1, high);
        return (cnt + 1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int idx = divide(arr, low, high);
            sort(arr, low, idx - 1);
            sort(arr, idx + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 9, 11, 3, 4, 10, 1, -5 };

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
