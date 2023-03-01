import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("+++ Task 1 +++");
        checkLeapYear(2024);
        System.out.println("+++ Task 2 +++");
        checkOS(1, 2022);
        System.out.println("+++ Task 3 +++");
        System.out.print("Для доставки потребуется дней: " + countsDeliveryTime(120));
    }
    public static void checkLeapYear (int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year + " год - високосный год");
        else
            System.out.println(year + " год - не високосный год");
    }
    public static void checkOS (int verOS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            switch (verOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
            }
        } else
            System.out.println("Обновление не требуется");
    }
    public static int countsDeliveryTime (int deliveryDistance) {
        if (deliveryDistance <= 100) {
            if (deliveryDistance >= 60)
                return 3;
            else if (deliveryDistance >= 20)
                return 2;
            else
                return 1;
        }
        System.out.println("Доставка не осуществляется");
        return -1;
    }
}