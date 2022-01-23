package AverageFinder;

public class AverageFinder {
    double computeAverage(int[] intArray) {
        double result = 0;
        for (int i = 0; i < intArray.length; i++){
            result += intArray[i];
        }
        return (double) (result/ intArray.length);
    }
}
