package lesson2.account;

public class BankAccount {
    /*
    -id String
    -name: String
    -balance: int
    +BankAccount(id, name, balance)
    +get
    +credit(amount: int) : int - добавляем
    +debit(amount: int):int - снимаем, ошибка сообщение
    +transfer(account: BankAccount, amount:int):int
    +toString():String -
         */
    private String id, name;
    private int balance;

    public BankAccount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("More than balance");

        return balance;
    }

    @Override
    public String toString() {
        return String.format("BankAccount = [id = %s, name = %s, balance = %d ]", id, name, balance);
    }

    public int transfer(BankAccount account, int amount) {
        if (balance >= amount) {
            balance -= amount;
            this.debit(amount);
        } else
            System.out.println("More than balance");

        return balance;
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
}
