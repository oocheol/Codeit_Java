package Basic;

public class OperatorExercise {
    public static void main(String[] args) {
        // 각 과목 점수
        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        // 평균 점수
        int total = koreanScore + mathScore + scienceScore + computerScore;
        System.out.println(total / 4.0);
    }
}