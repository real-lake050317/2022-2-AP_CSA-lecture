package Codes.ch7;

public class MyMatrix {
    private String name;
    private int numRows;
    private int numCols;
    private double[][] matrix;

    public MyMatrix() {
        this.name = "A";
        this.numRows = 10;
        this.numCols = 10;
        this.matrix = new double[10][10];
    }

    public MyMatrix(String name, int numRows, int numCols) {
        this.name = name;
        this.numRows = numRows;
        this.numCols = numCols;
    }

    public MyMatrix(String name, int numRows, int numCols, double[][] matrix) {
        this.name = name;
        this.numRows = numRows;
        this.numCols = numCols;
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        String str = this.name + "\n" + this.numRows + "x" + this.numCols + "\n";
        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < this.numCols; j++) {
                str += this.matrix[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }

    public void initializeIdentityMatrix() {
        this.matrix = new double[this.numRows][this.numCols];
        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < this.numCols; j++) {
                if (i == j) {
                    this.matrix[i][j] = 1;
                } else {
                    this.matrix[i][j] = 0;
                }
            }
        }
    }

    public void initializeRandomly(double min, double max) {
        this.matrix = new double[this.numRows][this.numCols];
        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < this.numCols; j++) {
                this.matrix[i][j] = Math.random() * (max - min) + min;
            }
        }
    }
}
