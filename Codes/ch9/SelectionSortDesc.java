package Codes.ch9;

public class SelectionSortDesc {
    public static int cnt = 0;
    public static void sort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int highest = i;
            int highkey = a[i];

            for (int j = i + 1; j < n; j++) {
                cnt++;
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
