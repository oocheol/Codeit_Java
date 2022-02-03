package Black_Jack;

public class BlackjackCard extends Card{
    // 생성자 바로 만들기 단축키 (Alt + Insert) => 생성자 선택
    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue() {
        switch(rankNumber) {
            case 1:
                return 11;
            case 11:
            case 12:
            case 13:
                return 10;
            default:
                return rankNumber;
        }
    }

    public boolean isAce() {
        return rankNumber == 1;
    }
}
