package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //pegando a logica do construtor da classe super (Account)
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

    public void loan(Double amount){
        if(amount <= loanLimit){
            balance += amount - 10;
        }
    }
}