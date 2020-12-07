package htlanl.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Functions {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        Collections.addAll(values, 1, 1, 1, 1, 1, 2, 2, 1);

        System.out.println("Median: " + getMedian(values));
        System.out.println("Mode: " + getMode(values));
        System.out.println("Mean: " + getMean(values));
    }

    public static List<Integer> sortValues(List<Integer> valuesToBeSorted) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < valuesToBeSorted.size() - 1; i++) {
                if (valuesToBeSorted.get(i) > valuesToBeSorted.get(i + 1)) {
                    int tempValue = valuesToBeSorted.get(i);
                    valuesToBeSorted.set(i, valuesToBeSorted.get(i + 1));
                    valuesToBeSorted.set(i + 1, tempValue);
                    sorted = false;
                }
            }
        }
        return valuesToBeSorted;
    }

    public static double getMedian(List<Integer> values) {
        double median;

        List<Integer> sortedValues = sortValues(values);
        int allElementsOfArray = sortedValues.size();
        if (allElementsOfArray % 2 == 0) {
            int sumOfBothElements = sortedValues.get(allElementsOfArray / 2)
                    + sortedValues.get((allElementsOfArray / 2) - 1);
            median = ((double) sumOfBothElements) / 2;
        } else
            median = (double) sortedValues.get(sortedValues.size() / 2);

        return median;
    }

    private static double getMode(List<Integer> values) {

        double modeNumber = 0.0;
        int maxAppearances = -1;

        for (int i = 0; i < values.size(); i++) {
            int counter = 0;

            for (int j = 0; j < values.size(); j++) {
                if (values.get(i).equals(values.get(j)))
                    counter++;
            }

            if (counter > maxAppearances) {
                modeNumber = values.get(i);
                maxAppearances = counter;
            }
        }

        return modeNumber;
    }

    private static double getMean(List<Integer> values) {

        double sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum / values.size();

        // Efficient solution
        // return (double) values.stream().reduce(0, (subtotal, element) -> subtotal +
        // element) / values.size();

    }
}
