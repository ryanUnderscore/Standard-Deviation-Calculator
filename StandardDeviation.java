
import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNum;
        System.out.println("How many numbers are you inputting?");
        totalNum = scanner.nextInt();
        double[] numList = new double[totalNum];
        double sum = 0;
        double mean;
        double newNum;
        double variance = 0;
        double standardDev;
        String variType;
        System.out.println("Type 'sam' for sample or 'pop' for population:");
        variType = scanner.next();

        for (int i = 0; i < totalNum; ++i) { //Gets sum for mean
            System.out.printf("Enter number %d:\n", i + 1);
            newNum = scanner.nextDouble();
            sum = sum + newNum;
            numList[i] = newNum;

        }

        mean = sum / totalNum; //Calculates mean
        System.out.printf("The average/mean is %.2f.\n", mean);

        for (int i = 0; i < numList.length; ++i) { //Subtracts mean and squares each number
            numList[i] = numList[i] - mean;
            numList[i] = Math.pow(numList[i], 2);
        }
        for (double v : numList) { //Adds all numbers together
            variance = variance + v;
        }
        if (variType.equals("sam")) {
            variance = variance / (totalNum - 1);
        } else {
            variance = variance / totalNum;
        }
        System.out.printf("The Variance is %.2f.\n", variance);

        standardDev = Math.sqrt(variance);

        System.out.printf("The Standard Deviation is %.2f.\n", standardDev);



    }
}
