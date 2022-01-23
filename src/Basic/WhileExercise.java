package Basic;

public class WhileExercise {
    public static void main(String[] args){
        int num = 10000;
        int key = 153;
        int result = 0;
        int find = 0 ;

        while (true) {
            find = num / key;
            result = key * find;
            break;
        }
        System.out.println(result);
    }
}
