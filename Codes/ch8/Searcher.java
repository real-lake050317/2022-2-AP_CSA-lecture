import java.util.Scanner;

public class Searcher {
    /*
    public boolean search(String[] a, String key) {
        if (a.length == 0) {
            return false;
        } else if (a[0].compareTo(key) == 0) {
            return true;
        } else {
            String[] shorter = new String[a.length - 1];
            for (int i = 0; i < a.length; i++) {
                shorter[i] = a[i + 1];
            }
            return search(shoreter, key);
        }
    }
    */
    public boolean search(String[] a, String key) {
        return recurSearch(a, 0, key);
    }

    public boolean recurSearch(String[] a, int startIndex, String key) {
        if (startIndex == a.length) {
            return false;
        } else if (a[startIndex].compareTo(key) == 0) {
            return true;
        } else {
            return recurSearch(a, startIndex + 1, key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = {"Mary", "Joe", "Lee", "Jake"};
        Searcher s = new Searcher();
        String key = sc.nextLine();
        boolean result = s.search(list, key);

        if (result) {
            System.out.println(key + "was found!");
        } else {
            System.out.println(key + "was not found!");
        }   
    }
}