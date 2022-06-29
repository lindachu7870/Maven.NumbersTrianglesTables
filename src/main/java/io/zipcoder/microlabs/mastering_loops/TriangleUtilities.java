package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangleRows = "";
        // The number of rows determines the triangle size
        for (int i = 1; i <= numberOfRows; i++) {
            triangleRows += getRow(i) + "\n";
        }
        return triangleRows;
    }

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 0; i < numberOfStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String getSmallTriangle() {
        return TriangleUtilities.getTriangle(4);
    }

    public static String getLargeTriangle() {
        return TriangleUtilities.getTriangle(10);
    }
}
