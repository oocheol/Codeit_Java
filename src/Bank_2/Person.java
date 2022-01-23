package Bank_2;

public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    // 첫 번째 파라미터 : 받는 사람(BankBasic.Person)
    // 두 번째 파라미터 : 이체할 금액(정수)
    // 리턴 : 성공여부(불린)
    public boolean transfer(Person to, int amount) {
        if (amount < 0 && amount > getAccount().getBalance()) {
            System.out.println("false - from: " + getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + getAccount().getBalance());
            return false;
        } else {
            getAccount().setBalance(getAccount().getBalance() - amount);
            to.getAccount().setBalance(to.getAccount().getBalance() + amount);
            System.out.println("true - from: " + getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + getAccount().getBalance());
            return true;
        }
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankBasic.BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        if (amount < 0 && amount > getAccount().getBalance()) {
            System.out.println("false - from: " + getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + getAccount().getBalance());
            return false;
        } else {
            getAccount().setBalance(getAccount().getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            System.out.println("true - from: " + getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + getAccount().getBalance());
            return true;
        }
    }


    public Person(String name, int age) {
        this.name = name ;
        this.age = age;
        if (age < 0) {
            this.age = 12;
        }
    }

    public Person(String name, int age, int cashAmount) {
        this.name = name ;
        this.age = age;
        this.cashAmount = cashAmount;
        if (age < 0) {
            this.age = 12;
        }

        if (cashAmount < 0) {
            this.cashAmount = cashAmount;
        }
    }
}

