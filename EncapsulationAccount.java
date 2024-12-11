class Account{

    String AccountNumber;
    Double Balance;

    public String getAccountNumber()
    {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.AccountNumber = accountNumber;
    }

    public Double getBalance()
    {
        return Balance;
    }

    public void setBalance(Double balance)
    {
        this.Balance = balance;
    }
}

    class EncapsulationAccount{

        public static void main(String args[]){

        Account account = new Account();

        account.setAccountNumber("SB-876789");
        account.setBalance(2000.0);

       String  accountNumber = account.getAccountNumber();
        Double Balance = account.getBalance();

        System.out.println("Account Number is:" + accountNumber );
        System.out.println("Balance :" + Balance);
    }
}

