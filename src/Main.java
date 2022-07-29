public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int refill = 1500;
        boolean accrual = true;

        int bonus = accrual ? (refill / 100) : 0;
        int total = balance + refill + bonus;

        System.out.println("Баланс = " + total);
        System.out.println("Начислено бонусов = " + bonus);
    }
}