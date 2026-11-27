
class Account{
    private double balance;

    public void setBalance(double balance){
        if(balance>=0){
            this.balance=balance;
        }else {
            System.out.println("Error: balance can't be negative");
        }
    }
    public  double getBalance(){
        return this.balance;
    }
}

public class Encapsolation {
    public static void main(String[] args) {
        System.out.println("====Practice Encapsulation===");
        Account ac=new Account();
        ac.setBalance(5000);

        System.out.println("Current balance: "+ac.getBalance());
        ac.setBalance(-100);

    }
}
