package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        String name = "清水航";
        String number = "12345";
        while(true) {
            if(atm.existsAccount(name, number)) break;
            else atm.registerAccount(name, number);
        }

        atm.deposit(number, 1000);
        atm.withdraw(number, 2000);
        atm.withdraw(number, 500);
    }
}
