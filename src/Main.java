public class Main {
    public static void main(String[] args) {

        int balance = 0;
        int replenishment = 2000;
        int bonus = 1;
        int accrued;
        int amount;

        if (replenishment > 1000) {
            accrued = replenishment / 100;
            amount = accrued + balance + replenishment;

        } else {
            accrued = 0;
            amount = balance + replenishment;
        }

        System.out.println("Итоговая сумма: " + amount);
        System.out.println("Сумма бонуса: " + accrued);

    }
}