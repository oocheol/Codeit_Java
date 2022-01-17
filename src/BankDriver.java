public class BankDriver {
    public static void main(String[] args) {
        // 사람 생성
        Person p1 = new Person();
        p1.name = "김신의";
        p1.age = 28;
        p1.cashAmount = 30000;

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

        // 두 객체의 관계 설정
        p1.account = a1;
        a1.owner = p1;

        // 내 이름 추가
        Person p2 = new Person();
        p2.name = "정우철";
        p2.age = 30;
        p2.cashAmount = 100000;

        BankAccount a2 = new BankAccount();
        a2.balance = 500000;

        p2.account = a2;
        a2.owner = p2;


        // 테스트
        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));

    }
}