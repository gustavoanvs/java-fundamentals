package entities;

public final class SavingsAccount extends Account {  //com o "Final" não é possível herdar essa classe.

    private Double interestRate; //taxa de juros

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }
}
