import java.util.Scanner;

public class Wordplay {
    public static void stackWords() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        if (word.equals(".")) {
            System.out.println();
        } else {
            stackWords();
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
        stackWords();
    }
}