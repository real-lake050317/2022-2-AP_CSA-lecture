public class ColorGrid {
    private String[][] pixels;
    private int rows;
    private int cols;

    public ColorGrid(String s, int numRows, int numCols) {
        pixels = new String[numRows][numCols];
        rows = numRows;
        cols = numCols;
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                pixels[i][j] = s.substring(index, index + 1);
                index++;
            }
        }
    }

    public void paintRegion(int row, int col, String newColor, String oldColor) {
        if (row >= 0 && row < rows && col >= 0 && col < cols){
            if (!pixels[row][col].equals(newColor) && pixels[row][col].equals(oldColor)){
                pixels[row][col] = newColor;
                paintRegion(row + 1, col, newColor, oldColor);
                paintRegion(row - 1, col, newColor, oldColor);
                paintRegion(row, col + 1, newColor, oldColor);
                paintRegion(row, col - 1, newColor, oldColor);
            }
        }
    }
}
