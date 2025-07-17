//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционна система");
        }

        System.out.println ("Задача 2");
        clientOs = 1;
        int clientDeviceYear = 2015;

        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ( clientOs == 0 && clientDeviceYear <= 2015 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ( clientOs  == 1  && clientDeviceYear < 2015 ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println ("Задача 3");
        int year = 2024;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println ("Задача 4");

        int deliveryDistance = 95;
        int days = 0;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Свыше 100 км доставка не осуществляется.");
        }
        System.out.println("Потребуется дней: " + days);

        System.out.println ("Задача 5");
        int monthNumber = 17;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}


