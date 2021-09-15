package day2.training;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhone;

    public Account(){
        this("5555", 12.00, "Default name", "Default address", "Default nr");
        System.out.println("Created but no info updated!");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhone) {
        setNumber(number);// not that good/ not good practice
        this.balance = balance;
        this.customerEmailAddress = customerEmailAddress;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        System.out.println("Info Updated!");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhone) {
        this("99999", 100.5, customerName, customerEmailAddress, customerPhone);
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhone = customerPhone;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Can't withdraw!" );
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
