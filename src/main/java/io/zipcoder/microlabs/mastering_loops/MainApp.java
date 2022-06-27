package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

//Created by leon on 1/31/18.

public class MainApp {
    public static void main(String[] args) {
        String evenNum = NumberUtilities.getEvenNumbers(2, 20);
        System.out.println(evenNum);

        String oddNum = NumberUtilities.getOddNumbers(2, 20);
        System.out.println(oddNum);

        String sqNum = NumberUtilities.getSquareNumbers(2,20, 4);
        System.out.println(sqNum);

        String numRange = NumberUtilities.getRange(20);
        System.out.println(numRange);

        String numRange2 = NumberUtilities.getRange(2, 20);
        System.out.println(numRange2);

        String numRange3 = NumberUtilities.getRange(2, 20, 4);
        System.out.println(numRange3);

        String expNum = NumberUtilities.getExponentiations(2, 20, 4, 3);
        System.out.println(expNum);

        String triangleRows = TriangleUtilities.getTriangle(5);
        System.out.println(triangleRows);
    }
}
