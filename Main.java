import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // Method to calculate the average stock price
    public static double calculateAveragePrice(int[] stockPrices) {
        double sum = 0;
        for (int price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }

    // Method to find the maximum stock price
    public static int findMaximumPrice(int[] stockPrices) {
        int maxPrice = stockPrices[0];
        for (int price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count occurrences of a specific price
    public static int countOccurrences(int[] stockPrices, int targetPrice) {
        int count = 0;
        for (int price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices
    public static ArrayList<Integer> computeCumulativeSum(ArrayList<Integer> stockPrices) {
        ArrayList<Integer> cumulativeSum = new ArrayList<>();
        int sum = 0;
        for (int price : stockPrices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        int[] stockPricesArray = {100, 200, 150, 180, 120, 300, 250, 270, 220, 210};
        ArrayList<Integer> stockPricesList = new ArrayList<>(Arrays.asList(100, 200, 150, 180, 120, 300, 250, 270, 220, 210));

        // Calculate and print the average stock price
        double averagePrice = calculateAveragePrice(stockPricesArray);
        System.out.println("Average Stock Price: " + averagePrice);

        // Find and print the maximum stock price
        int maxPrice = findMaximumPrice(stockPricesArray);
        System.out.println("Maximum Stock Price: " + maxPrice);

        // Count and print the occurrences of a specific price
        int targetPrice = 200;
        int occurrences = countOccurrences(stockPricesArray, targetPrice);
        System.out.println("Occurrences of Price " + targetPrice + ": " + occurrences);

        // Compute and print the cumulative sum of stock prices
        ArrayList<Integer> cumulativeSum = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);
    }
}
