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
        this.matrix = new double[numRows][numCols];
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
                str += String.format("%.3f", this.matrix[i][j]) + " ";
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

    public void initializeRandomlyDouble(double min, double max) {
        this.matrix = new double[this.numRows][this.numCols];
        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < this.numCols; j++) {
                this.matrix[i][j] = Math.random() * (max - min) + min;
            }
        }
    }

    public void initializeRandomlyInt(int min, int max) {
        this.matrix = new double[this.numRows][this.numCols];
        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < this.numCols; j++) {
                this.matrix[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setMatrixEntry(int row, int col, double value) {
        this.matrix[row - 1][col - 1] = value;
    }

    public double getMatrixEntry(int row, int col) {
        return this.matrix[row - 1][col - 1];
    }

    public void swapRows(int row1, int row2) {
        double[] temp = this.matrix[row1 - 1];
        this.matrix[row1 - 1] = this.matrix[row2 - 1];
        this.matrix[row2 - 1] = temp;
    }

    public MyMatrix add(MyMatrix mat) {
        if (this.numRows != mat.getNumRows() || this.numCols != mat.getNumCols()) {
            throw new IllegalArgumentException("The two matrices are not the same size.");
        }
        MyMatrix matC = new MyMatrix("Added Matrix", this.numRows, this.numCols);
        for (int i = 1; i <= this.numRows; i++) {
            for (int j = 1; j <= this.numCols; j++) {
                matC.setMatrixEntry(i, j, this.matrix[i - 1][j - 1] + mat.getMatrixEntry(i, j));
            }
        }
        return matC;
    }

    public MyMatrix subtract(MyMatrix mat) {
        if (this.numRows != mat.getNumRows() || this.numCols != mat.getNumCols()) {
            throw new IllegalArgumentException("The two matrices are not of the same size.");
        }
        MyMatrix matC = new MyMatrix("Subtracted Matrix", this.numRows, this.numCols);
        for (int i = 1; i <= this.numRows; i++) {
            for (int j = 1; j <= this.numCols; j++) {
                matC.setMatrixEntry(i, j, this.matrix[i - 1][j - 1] - mat.getMatrixEntry(i, j));
            }
        }
        return matC;
    }

    // Overloading for the matrix multiplication
    public MyMatrix multiply(MyMatrix mat) {
        if (this.numCols != mat.getNumRows()) {
            throw new IllegalArgumentException("The two matrices are not compatible in multiplication.");
        }
        MyMatrix matC = new MyMatrix("Multiplied Matrix", this.numRows, mat.getNumCols());
        for (int i = 1; i <= this.numRows; i++) {
            for (int j = 1; j <= mat.getNumCols(); j++) {
                double sum = 0;
                for (int k = 1; k <= this.numCols; k++) {
                    sum += this.matrix[i - 1][k - 1] * mat.getMatrixEntry(k, j);
                }
                matC.setMatrixEntry(i, j, sum);
            }
        }
        return matC;
    }

    // Overloading for scalar multiplication
    public MyMatrix multiply(double scalar) {
        MyMatrix matC = new MyMatrix("Scalar Multiplied Matrix", this.numRows, this.numCols);
        for (int i = 1; i <= this.numRows; i++) {
            for (int j = 1; j <= this.numCols; j++) {
                matC.setMatrixEntry(i, j, this.matrix[i - 1][j - 1] * scalar);
            }
        }
        return matC;
    }

    public MyMatrix transpose() {
        MyMatrix matC = new MyMatrix("Transposed Matrix", this.numCols, this.numRows);
        for (int i = 1; i <= this.numRows; i++) {
            for (int j = 1; j <= this.numCols; j++) {
                matC.setMatrixEntry(j, i, this.matrix[i - 1][j - 1]);
            }
        }
        return matC;
    }

    public boolean evaluateEquality(MyMatrix mat) {
        if (this.numRows != mat.getNumRows() || this.numCols != mat.getNumCols()) {
            return false;
        }
        for (int i = 1; i <= this.numRows; i++) {
            for (int j = 1; j <= this.numCols; j++) {
                if (Math.abs(this.matrix[i - 1][j - 1] - mat.getMatrixEntry(i, j)) > 1e-10) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean evaluateSize(MyMatrix mat) {
        return this.numRows == mat.getNumRows() && this.numCols == mat.getNumCols();
    }

    public void evaluateInfo(MyMatrix mat) {
        if (!evaluateSize(mat)) {
            System.out.println("The two matrices are not of the same size.");
        } else {
            System.out.println("The two matrices are of the same size.");
        }
        if (evaluateSize(mat)) {
            if (this.evaluateEquality(mat)) {
                System.out.println("The two matrices are equal.");
            } else {
                System.out.println("The two matrices are not equal.");
            }
        }
        if (evaluateSize(mat) && !evaluateEquality(mat)) {
            double sum = 0;
            for (int i = 1; i <= this.numRows; i++) {
                for (int j = 1; j <= this.numCols; j++) {
                    sum += (this.matrix[i - 1][j - 1] - mat.getMatrixEntry(i, j));
                }
            }
            System.out.println(sum / (this.numRows * this.numCols));
        }
    }
    
    public MyMatrix reducedRowEchelonForm(MyMatrix x) {
        MyMatrix matC = new MyMatrix("Reduced Row Echelon Form", this.numRows, this.numCols + 1);

        for (int i = 1; i <= this.numRows; i++) {
            for (int j = 1; j <= this.numCols; j++) {
                matC.setMatrixEntry(i, j, this.matrix[i - 1][j - 1]);
            }   
        }

        for (int i = 1; i <= this.numRows; i++) {
            matC.setMatrixEntry(i, this.numCols + 1, x.getMatrixEntry(i, 1));
        } // Augmented matrix [A|b]

        int lead = 0;
        for (int r = 0; r < this.numRows; r++) {
            if (this.numCols <= lead) {
                break;
            }
            int i = r;
            while (matC.getMatrixEntry(i + 1, lead + 1) == 0) {
                i++;
                if (this.numRows == i) {
                    i = r;
                    lead++;
                    if (this.numCols == lead) {
                        lead--;
                        break;
                    }
                }
            }
            matC.swapRows(i + 1, r + 1);
            double div = matC.getMatrixEntry(r + 1, lead + 1);
            for (int j = 1; j <= this.numCols + 1; j++) {
                matC.setMatrixEntry(r + 1, j, matC.getMatrixEntry(r + 1, j) / div);
            }
            for (int j = 1; j <= this.numRows; j++) {
                if (j != r + 1) {
                    double sub = matC.getMatrixEntry(j, lead + 1);
                    for (int k = 1; k <= this.numCols + 1; k++) {
                        matC.setMatrixEntry(j, k, matC.getMatrixEntry(j, k) - (sub * matC.getMatrixEntry(r + 1, k)));
                    }
                }
            }
            lead++;
        }
        return matC;
    }

    public boolean check(MyMatrix x, MyMatrix b) {
        // if this.matrix * x = b, return true
        MyMatrix matC = new MyMatrix("Check", this.numRows, x.getNumCols());
        matC = this.multiply(x);
        return matC.evaluateEquality(b);
    }
}