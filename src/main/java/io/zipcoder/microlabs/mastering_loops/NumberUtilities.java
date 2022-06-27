package io.zipcoder.microlabs.mastering_loops;


import java.sql.SQLOutput;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNum = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                if (evenNum.length() == 0) evenNum += i;
                else evenNum += "," + i;
            }
        }
        return evenNum;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNum = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                if (oddNum.length() == 0) oddNum += i;
                else oddNum += "," + i;
            }
        }
        return oddNum;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String sqNum = "";
        for (int i = start; i < stop; i+= step) {
            int sq = i * i;
            if (sqNum.length() == 0) sqNum += sq;
                else sqNum += "," + sq;
        }
        return sqNum;
    }

    public static String getRange(int start) {
        String numRange = "";
        for (int i = 0; i < start; i++) {
            if (numRange.length() == 0) numRange += i;
            else numRange += "," + i;
        }
        return numRange;
    }

    public static String getRange(int start, int stop) {
        String numRange = "";
        for (int i = start; i < stop; i++) {
            if (numRange.length() == 0) numRange += i;
            else numRange += "," + i;
        }
        return numRange;
    }

    public static String getRange(int start, int stop, int step) {
        String numRange = "";
        for (int i = start; i < stop; i+= step) {
            if (numRange.length() == 0) numRange += i;
            else numRange += "," + i;
        }
        return numRange;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expNum = "";
        for (int i = start; i < stop; i+= step) {
            double exp = Math.pow(i, exponent);
            if (expNum.length() == 0) expNum += (int)exp;
            else expNum += "," + (int)exp;
        }
        return expNum;
    }
}
