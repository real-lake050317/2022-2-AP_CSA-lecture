package Codes.ch5.Autoboxing.ex2;

public class ex2 {
    public static void main(String[] args) {
        Integer intOb1 = 4; //boxing
        Integer intOb2 = new Integer(4); //boxing
        if (intOb1 == intOb2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
