package Katas;

public class SquareOfSquares {

    /**
     * func to check out is integer a square number or not
     */
    public static boolean isNumASquareNum(int numToCheck) {

        /*boolean isSquareNumber = false;
        double sqrt = Math.sqrt(numToCheck);
        long sqrt2 = Math.round(sqrt);
        if (Math.abs(sqrt - sqrt2) / sqrt < 1e-15 || numToCheck == 0) isSquareNumber = true;

        return isSquareNumber;*/

        int sqrt = (int) Math.sqrt(numToCheck);

        return sqrt * sqrt == numToCheck;
    }
}
