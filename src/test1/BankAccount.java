package test1;

public class BankAccount {
    private int balance;
    private Person owner ;

    public void setBalance(int pBalance){
        balance = pBalance;
    }

    public int getBalance(){

        return balance;
    }

    public void setOwner(Person pOnwer){
        owner = pOnwer;
    }

    public Person getOwner(){

        return owner;
    }



    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean deposit(int amount) {

        if (owner.getCashAmount() - amount >= 0){
            setBalance(getBalance() + amount);
            int total = owner.getCashAmount() - amount;
            owner.setCashAmount(total);
            System.out.println(amount + "원 입금하였습니다. 잔고: "+ getBalance() + "원, 현금: "+ owner.getCashAmount()+"원");
            return true;
        }
        else {
            System.out.println("입금 실패입니다. 잔고: "+ getBalance() + "원, 현금: "+ owner.getCashAmount()+"원");
            return false;
        }

    }
    public boolean depositWithExchangeRate(double amount, double exchangeRate) {
        return deposit((int) (amount * exchangeRate));
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
        if (getBalance() - amount >= 0){
            setBalance(getBalance() - amount);
            int total = owner.getCashAmount() + amount;
            owner.setCashAmount(total);
            System.out.println(amount + "원 출금하였습니다. 잔고: "+ getBalance() + "원, 현금: "+ owner.getCashAmount()+"원");
            return true;
        }
        else {
            System.out.println("출금 실패입니다. 잔고: "+ getBalance() + "원, 현금: "+ owner.getCashAmount()+"원");
            return false;
        }
    }

    // 첫 번째 파라미터 : 받는 사람(Person)
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

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
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

    public BankAccount(int pBalance) {
        setBalance(pBalance);
        if (pBalance < 0){
            setBalance(0);
        }
    }
    public BankAccount(Person pOwner) {
        setOwner(pOwner);
        setBalance(0);
    }

    public BankAccount(int pBalance, Person pOwner) {
        setOwner(pOwner);
        setBalance(pBalance);
        if (pBalance < 0){
            setBalance(0);
        }
    }
}