public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)){
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    public static String removeBlanks(String str) {
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == ' ') {
            return removeBlanks(str.substring(1));
        } else {
            return str.charAt(0) + removeBlanks(str.substring(1));
        }
    } 

    public static String removePuctuation(String str) {
        char temp = str.charAt(0);
        if (str.length() == 1) {
            if (temp < 48 || temp > 122 || (temp > 90 && temp < 97)) {
                return "";
            } else {
                return str;
            }
        }
        if (temp < 48 || temp > 122 || (temp > 90 && temp < 97)) {
            return removePuctuation(str.substring(1));
        } else {
            return str.charAt(0) + removePuctuation(str.substring(1));
        }
    }

    public static String lowercase(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        //String str = "!H$e%%%l^ l&o**    J a(V-A!";
        //String str = "Flo, gin is a sin! I golf.";
        String str = "A Santa lived as a devil at NASA.";
        str = removeBlanks(str);
        str = removePuctuation(str);
        str = lowercase(str);
        System.out.println(str);
        System.out.println(isPalindrome(str));
    }
}
