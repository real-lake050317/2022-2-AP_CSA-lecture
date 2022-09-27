package Codes.ch5.Autoboxing.ex1;
public class ex1 {
    public static void main(String[] args) {
        Integer intOb1 = 4; //boxing
        Integer intOb2 = 4; //boxing
        if (intOb1 == intOb2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}