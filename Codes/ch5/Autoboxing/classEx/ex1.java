package Codes.ch5.Autoboxing.classEx;

public class ex1 {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
