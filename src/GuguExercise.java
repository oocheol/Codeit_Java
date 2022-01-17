public class GuguExercise {
    public static void main(String[] args) {
        // 여기에 코드를 작성하세요.
        int j = 1;
        for (int i = 1; i <= 9; i++){

            System.out.println(j + " * " + i + " = " + (j*i));
            if (i == 9){
                i = 0;
                j ++;
                if (j == 10){
                    break;
                }
            }

        }
    }
}
