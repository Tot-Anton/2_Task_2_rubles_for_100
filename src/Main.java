public class Main {
    public static void main(String[] args) {

        int account = 200;
        int profit = 1500;
        int bonus = profit / 100;

        if (profit >= 1000) {
            System.out.println("Клиент пополнил счёт на:" + profit);
            System.out.println("Итоговая сумма на счету клиента:" + (account + profit + bonus));
            System.out.println("Начисленно бонусных баллов:" + (profit / 100 + "баллов"));

        } else {
            System.out.println("Клиент пополнил счёт на:" + profit);
            System.out.println("Итоговая сумма на счету клиента:" + (account + profit));
            System.out.println("Для зачисления бонусов на счёт нужно положить от 1000 рублей");
        }

    }
}
