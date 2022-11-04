public class MyMatrixTest {
    public static void main(String[] args) {
        // MyMatrix matA = new MyMatrix("A", 3, 3, new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        MyMatrix matA = new MyMatrix("A", 3, 3, new double[][] { { 9, 1, 2 }, { 8, 0, 1 }, { 7, 3, 4 } });
        MyMatrix matB = new MyMatrix("B", 3, 3, new double[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
        // System.out.println(matA);
        // System.out.println(matB);
        // matB.initializeIdentityMatrix();
        // System.out.println(matB);
        // matB.initializeRandomly(-10, 10);
        /* 
        System.out.println(matB);
        System.out.println(matB.transpose());
        matB.setMatrixEntry(1, 1, 10);
        System.out.println(matB.add(matA));
        System.out.println(matB.subtract(matA));
        System.out.println(matB.multiply(matA));
        System.out.println(matB.multiply(3));
        matB.evaluateInfo(matB);
        */
        matA.initializeRandomlyInt(-10, 10);
        // MyMatrix matC = new MyMatrix("Test", 3, 3, new double[][] { {1, 0, 0}, {0, 0, 0}, {0, 0, 3} });
        System.out.println(matA);
        System.out.println(matA.reducedRowEchelonForm(new MyMatrix("b", 3, 1, new double[][] { { 1 }, { 2 }, { 3 } })));
        // System.out.println(matA.gebs(new MyMatrix("b", 3, 1, new double[][] { { 1 }, { 2 }, { 3 } })));
        // System.out.println()
    }
}