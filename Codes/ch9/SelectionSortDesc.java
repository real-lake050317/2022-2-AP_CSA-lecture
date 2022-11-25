package Codes.ch9;

public class SelectionSortDesc {
    public static void sort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int highest = i;
            int highkey = a[i];

            for (int j = i + 1; j < n; j++) {
                if (a[j] > highkey) {
                    highest = j;
                    highkey = a[j];
                }
            }
            int temp = a[i];
            a[i] = a[highest];
            a[highest] = temp;
        }
    }
}
