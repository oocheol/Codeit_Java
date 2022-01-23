package Bank_2;

public class BankAccount {
    private int balance;
    private Person owner ;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){

        return balance;
    }

    public void setOwner(Person owner){
        this.owner = owner;
    }

    public Person getOwner(){

        return owner;
    }

    // 첫 번째 파라미터 : 받는 사람(BankBasic.Person)
    // 두 번째 파라미터 : 이체할 금액(정수)
    // 리턴 : 성공여부(불린)
    public boolean transfer(Person to, int amount) {
        if (amount < 0 && amount > balance) {
            System.out.println("false - from: " + owner.getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + getBalance());
            return false;
        } else {
            setBalance(getBalance() - amount);
            to.getAccount().setBalance(to.getAccount().getBalance() + amount);
            System.out.println("true - from: " + owner.getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + getBalance());
            return true;
        }
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankBasic.BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        if (amount < 0 && amount > balance) {
            System.out.println("false - from: " + owner.getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + getBalance());
            return false;
        } else {
            setBalance(getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            System.out.println("true - from: " + owner.getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + getBalance());
            return true;
        }
    }

    public BankAccount(int balance) {
        this.balance = balance;
        if (balance < 0){
            this.balance = 0;
        }
    }
    public BankAccount(Person owner) {
        this.owner = owner;
        owner.setAccount(this);
        this.balance = 0;
    }

    public BankAccount(int balance, Person owner) {
        this.owner = owner;
        this.balance = balance;
        owner.setAccount(this);
        if (balance < 0){
            this.balance = 0;
        }
    }
}