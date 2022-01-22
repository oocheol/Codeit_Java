public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public void setAge(int newAge){
        if (newAge >= 0 ){
            age = newAge;
        }
    }
    public int getAge() {
        return age;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setCashAmount(int newCashAmount){
        cashAmount = newCashAmount;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount pAccount) {
        account = pAccount;
    }

    public BankAccount getAccount() {
        return account;
    }

    // 첫 번째 파라미터 : 받는 사람(Person)
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

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
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
}