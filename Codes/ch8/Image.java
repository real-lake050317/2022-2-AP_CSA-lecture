public class Image {
    private final int BLACK = 1;
    private final int WHITE = 0;
    private int[][] image;
    private int size;

    public Image() {
        this.size = 10;
        this.image = new int[this.size][this.size];
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (this.image[i][j] == BLACK) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public void eraseBlob(int row, int col) {
        if (row >= 0 && row < size && col >= 0 && col < size) {
            if (image[row][col] == BLACK) {
                image[row][col] = WHITE;
                eraseBlob(row - 1, col);
                eraseBlob(row + 1, col);
                eraseBlob(row, col - 1);
                eraseBlob(row, col + 1);
            }
        }
    }
}