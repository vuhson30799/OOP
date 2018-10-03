package Location;

public class Location {
    public static int row;
    public static int column;
    public static double maxValue = 0;

    public static void setColumn(int column) {
        Location.column = column;
    }

    public static void setRow(int row) {
        Location.row = row;
    }

    public static void locateLargest (double[][] a){
        int i = 0, j = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (a[i][j] > maxValue) maxValue = a[i][j];
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (a[i][j] == maxValue) break;
            }
            break;
        }
        System.out.println("The location of max value: " + maxValue + " is: (" + i + "," + j +")");
    }
}
