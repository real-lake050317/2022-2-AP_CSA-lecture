public class Image {
    private final int BLACK = 1;
    private final int WHITE = 0;
    private int[][][] image; // 3D array of pixels, row, col, info (colour, visit sequence, color change sequence)
    private int size;
    private int visitSequence = 0;
    private int colorChangeSequence = 0;

    public Image() {
        this.size = 10;
        this.image = new int[this.size][this.size][3];
    }

    public Image(int size) {
        this.size = size;
        this.image = new int[this.size][this.size][3]; 
    }

    public Image(int size, int[][] board) {
        this.size = size;
        this.image = board;
    }

    public void randomize(double factor) {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (Math.random() < factor) {
                    this.image[i][j][0] = BLACK;
                } else {
                    this.image[i][j][0] = WHITE;
                }
            }
        }
    }

    public void displayImage() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (this.image[i][j][0] == BLACK) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public void displayInfo() {
        System.out.println("\nVisit Sequence");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.image[i][j][1] + "  ");
            }
            System.out.println();
        }
        System.out.println("\nColor Change Sequence");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(this.image[i][j][2] + "  ");
            }
            System.out.println();
        }
    }

    public void eraseBlob(int row, int col) {
        if (row >= 0 && row < size && col >= 0 && col < size) {
            if (image[row][col][1] == 0 || visitSequence == 0) {
                image[row][col][1] = ++visitSequence;
            }

            if (image[row][col][0] == BLACK) {
                image[row][col][0] = WHITE;
                image[row][col][2] = colorChangeSequence++;
                eraseBlob(row - 1, col);
                eraseBlob(row + 1, col);
                eraseBlob(row, col - 1);
                eraseBlob(row, col + 1);
            }
        }
    }
}