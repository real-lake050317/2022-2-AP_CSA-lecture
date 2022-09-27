package Codes.ch7;

public class MyMatrixTest {
    public static void main(String[] args) {
        MyMatrix matA = new MyMatrix();
        MyMatrix matB = new MyMatrix("B", 3, 3, new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(matB);
        matB.initializeIdentityMatrix();
        System.out.println(matB);
        matB.initializeRandomly(-10, 10);
        System.out.println(matB);
    }
}
