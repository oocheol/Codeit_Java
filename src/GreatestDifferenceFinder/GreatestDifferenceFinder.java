package GreatestDifferenceFinder;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        if (intArray.length < 2){
            return 0;
        }
        else{
            int[] result = new int[(intArray.length * (intArray.length-1))];
            int max ;
            for (int i = 0; i < intArray.length -1; i++){
                for (int j = 0; j < result.length -1; j+=2){
                    result[j] = intArray[i] - intArray[i+1];
                    result[j+1] = intArray[i+1] - intArray[i];
                }

            }
            return result[0];
        }

    }
}