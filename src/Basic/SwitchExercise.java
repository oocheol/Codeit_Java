package Basic;

public class SwitchExercise {
    public static void main(String[] args) {
        int number = 134354;

        String num;

        switch (number % 7){
            case 0:
                num = "Zero";
                break;
            case 1:
                num = "One";
                break;
            case 2:
                num = "Two";
                break;
            case 3:
                num = "Three";
                break;
            case 4:
                num = "Four";
                break;
            case 5:
                num = "Five";
                break;
            default:
                num = "Six";
                break;

        }
        System.out.println(num);

    }
}