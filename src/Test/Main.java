package Test;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "Hello"; // a
        strings[2] = ""; // b
        strings[4] = "Java"; //a
        // 0, 4 > a
        // 1, 2, 3 > b

        int countA = 0, countB = 0;
        for (String str : strings) {
            if (str != null && !str.isEmpty()) {
                System.out.println(str);
                countA++;
            } else {
                countB++;
            }
        }
        System.out.println(countB);
    }
}