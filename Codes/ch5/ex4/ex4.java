package Codes.ch5.Autoboxing.ex4;

public class ex4 {
    public static void main(String[] args) {
        Integer intOb1 = 4;
        Integer intOb2 = new Integer(4);
        if (intOb1.intValue() == intOb2.intValue()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }   
}
