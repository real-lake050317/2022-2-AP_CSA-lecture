public class InsertionSort{
    private static int operationCount=0;

    public static int[] ascendingInsertionSort(int[] list){
        int[] res = new int[list.length];
        for (int i = 0; i < list.length; i++) res[i] = list[i]; //deep copy
        for (int i = 1; i < res.length; i++) {
            int key = res[i];
            int j = i - 1;
            while (j >= 0 && res[j] > key){
                res[j + 1] = res[j];
                operationCount++;
                j--;
            }
            res[j + 1] = key;
        }
        return res;
    }

    public static int[] ascendingInsertionSortShiftLater(int[] list){
        int[] res = new int[list.length];
        for (int i = 0; i < list.length; i++) res[i] = list[i]; //deep copy
        for (int i = 1; i < res.length; i++) {
            int key = res[i];
            int j = i - 1;
            while (j >= 0 && res[j] > key){
                operationCount++;
                j--;
            }
            for (int z = i; z > j+1; z--){
                res[z] = res[z - 1];
            }
            res[j + 1]=key;
        }
        return res;
    }    

    public static int[] descendingInsertionSort(int[] list){
        int[] res = new int[list.length];
        for (int i = 0; i < list.length; i++) res[i] = list[i]; //deep copy
        for (int i = 1; i < res.length; i++) {
            int key = res[i];
            int j = i - 1;
            while (j >= 0 && res[j] < key){
                res[j + 1] = res[j];
                operationCount++;
                j--;
            }
            res[j + 1] = key;
        }
        return res;
    }

    public static int[] descendingInsertionSortShiftLater(int[] list){
        int[] res = new int[list.length];
        for (int i = 0; i < list.length; i++) res[i] = list[i]; //deep copy
        for (int i = 1; i < res.length; i++) {
            int key = res[i];
            int j = i-1;
            while (j >= 0 && res[j] < key){
                operationCount++;
                j--;
            }
            for (int z = i; z > j + 1; z--){
                res[z] = res[z - 1];
            }
            res[j + 1] = key;
        }
        return res;
    }    

    public static void printArr(int[] list){
        for (int i = 0; i < list.length; i++) System.out.print(list[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * 10 + 1);
        }
        int[] asc = ascendingInsertionSort(list);
        System.out.println(operationCount);
        operationCount = 0;
        int[] des = descendingInsertionSort(list);
        System.out.println(operationCount);
        operationCount = 0;
        int[] asc1 = ascendingInsertionSortShiftLater(list);
        System.out.println(operationCount);
        operationCount = 0;
        int[] des1 = descendingInsertionSortShiftLater(list);
        System.out.println(operationCount);
        printArr(list);
        printArr(asc);
        printArr(asc1);
        printArr(des);
        printArr(des1);
    }
}