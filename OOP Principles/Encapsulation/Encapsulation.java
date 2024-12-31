public class Encapsulation {

    public class Bank {
        String name;
        private String password;
        double accountBalance;

        Bank(String name, String password) {
            this.name = name;
            this.password = password;
        }

        // Getters
        public double getAccountBalance(){
            return accountBalance;
        }

        public int hashedPassword(){
            return password.hashCode();
        }

        // Setters
        public void depositMoney(double money){
            accountBalance += money;
        } 

        public void withdrawMoney(double money){
            accountBalance -= money;            
        }

    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        Bank bank = encapsulation.new Bank("John", "312");
        System.out.println("Current account balance: " + bank.accountBalance);
        bank.depositMoney(3132.429f);
        System.out.println("Current account balance: " + bank.accountBalance);
        bank.withdrawMoney(42.42f);
        System.out.println("Current account balance: " + bank.accountBalance);
        System.out.println(bank.hashedPassword());
    }
}
