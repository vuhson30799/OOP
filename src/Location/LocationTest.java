package Location;

import java.util.Scanner;

public class LocationTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns in the array: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        double[][] a = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the element " + i + "," + j);
                a[i][j] = scanner.nextDouble();
            }
        }
        Location.setColumn(column);
        Location.setRow(row);
        Location.locateLargest(a);
    }
}
