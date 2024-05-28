public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");


        int money = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + money;
            total = total + total / 100;
            System.out.println("Месяц " + month++ + " , сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 2");

        int countdown = 0;
        while (countdown < 10) {
            countdown = countdown + 1;
            System.out.printf(" %s ", countdown);
        }

        System.out.println("\n");


        for ( int i = 10; i >= 1; i--) {

            System.out.printf(" %s ", i);
        }
        System.out.println("\n");


        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRate = 17;
        int dead = 8;
        int year = 1;

        while (year <= 10) {
            int birthRateYear = population / 1000 * birthRate;
            int deadYear = population / 1000 * dead;
            population = population + birthRateYear - deadYear;
            System.out.println("Год " + year++ + " , численность населения составялет " + population);
        }

        System.out.println("Задача 4");

        int contribution = 15000;
        total = 0;
        month = 0;

        while (month > 0) {
        }

        while (total <= 12_000_000) {
            total += contribution;
            total = total + (total * 7) / 100;
            System.out.println("За " + month++ + " месяц сумма накоплений равна " + total);
        }

        System.out.println("Задача 5");

        contribution = 15000;
        total = 0;
        month = 1;

        while (total < 12_000_000) {

            total += contribution;
            total = total + (total * 7) / 100;
            if (month % 6 == 0) {
                System.out.println("За месяц " + month + " сумма накоплений равна " + total);
            }
            month++;

        }


        System.out.println("Задача 6");

        contribution = 15000;
        total = 0;
        year = 9;
        month = 1;
        int monthInYear = 12;
        int monthTotal = year * monthInYear;

        while (month <= monthTotal) {
            total  += contribution;
            total = total + (total * 7) / 100;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев ,сумма накоплений равна " + total);
            }
            month++;
        }

        System.out.println("Задача 7");

        int friday = 5;

        while (friday <= 31) {

            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
            friday += 5;

        }

        System.out.println("Задача 8");

        int yearNow = 2024;
        int yearBefore = yearNow - 200;
        int yearAfter = yearNow + 100;
        int cometFliesBy = 79;

        for (year = yearBefore; year <= yearAfter; year++) {
            if (year % cometFliesBy == 0) {
                System.out.println(year);
            }
        }
    }
}
