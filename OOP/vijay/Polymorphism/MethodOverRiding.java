package OOP.vijay.Polymorphism;

public class MethodOverRiding {
    public MethodOverRiding() {
    }

    public static void main(String[] args) {
        HDFC bank = new HDFC();
        bank.interest();
    }

    static class HDFC extends Bank {
        HDFC() {
        }

        void interest() {
            System.out.println("Interest is 8%");
        }
    }

    static class Bank {
        Bank() {
        }

        void interest() {
            System.out.println("basic interest is 5%");
        }
    }
}