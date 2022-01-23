package Basic;

public class ArrayExercise {
    public static void main(String[] args) {
        // 여기에 코드를 작성하세요.
        int[] intArray = new int[30];

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = 1000 + i + 1;
            // System.out.println(intArray[i]);
        }
        String[] remainders = {"Zero", "One", "Two", "Three"};

        for (int i : intArray){
            int j = i % 4;
            System.out.println(remainders[j]);
        }



    }
}
