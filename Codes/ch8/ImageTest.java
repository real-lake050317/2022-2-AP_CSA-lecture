import java.util.Scanner;
public class ImageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the image: ");
        int size = sc.nextInt();
        System.out.print("Enter the density of the image: ");
        double density = sc.nextDouble();
        Image image = new Image(size);
        image.randomize(density);
        System.out.println("Randomized Image");
        image.displayImage();
        System.out.println();
        System.out.print("Enter the row number of the blob to erase: ");
        System.out.print("Enter the column number of the blob to erase: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        image.eraseBlob(row, col);
        System.out.println("Erased Blob at (" + row + ", " + col + ")");
        image.displayImage();
        image.displayInfo();
    }
}
