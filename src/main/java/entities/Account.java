package entities;

public class Account {

    public static Double DEPOSIT_FEE_PERCENTAGE = 0.02;

    private long id;
    private Double balance;

    public Account(){}

    public Account(long id, Double balance) {
        this.id = id;
        this.balance = balance;
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        if(amount > 0) {
            amount -= amount * DEPOSIT_FEE_PERCENTAGE;
            balance += amount;
        }
    }

    public void withdraw(Double amount){
        if(amount > balance){
            throw new IllegalArgumentException();
        }else{
            balance -= amount;
        }
    }

    public Double fullWithdraw(){
        Double aux = balance;
        balance = 0.0;
        return aux;
    }

}
