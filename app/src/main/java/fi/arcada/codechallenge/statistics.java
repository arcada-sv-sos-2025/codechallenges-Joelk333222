package fi.arcada.codechallenge;

import java.util.ArrayList;

public class statistics {

    public static double calcMean(double...data) {
        if (data.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double num : data) {
            sum += num;
        }

        return sum / data.length;
    }

    public static void main(String[] args) {
        // Example usage
        double average = statistics.calcMean(10, 20, 30, 40);
        System.out.println("Average: " + average);

    }
}
