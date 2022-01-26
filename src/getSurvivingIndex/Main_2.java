package getSurvivingIndex;

import java.util.ArrayList;

public class Main_2 {
    public static int getSurvivingIndex(int n, int k) {

        ArrayList<Integer> soldiers = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        for (int soldierNumber = 1; soldierNumber <= n; soldierNumber++) {
            soldiers.add(soldierNumber);
        }
        int count = 0;
        while (soldiers.size() > 1) {
            for (int i = 0; i < soldiers.size(); i++) {
                count++;
                if (count == k) {
                    System.out.println(soldiers.get(i) + "번 군사가 죽습니다.");
                    index.add(i);
                    count = 0;
                }
            }
            for (int i = index.size(); i > 0; i--) {
                int num2 = index.get(i - 1);
                soldiers.remove(num2);
            }
            index.clear();
        }

        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}