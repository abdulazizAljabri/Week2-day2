public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account() {
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        if (this.balance < amount) {
            System.out.println("is not enough money");
        } else {
            this.balance -= amount;
        }
        return this.balance;
    }

    public int debit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    // we need to check
    public void transferTo(int amount, Account target) {
        if (this.balance < amount) {
            System.out.println("is not enough money");
        } else {
            this.balance -= amount;
            target.balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
