public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        int deposit = 15000;
        double total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total *= 1.01;
            total += deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2:");
        int i = 1;
        while ( i <= 10 ) {
            System.out.print(i + "\t");
            i++;
        }
        i = 10;
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + "\t");
        }
    }

    public static void task3() {
        System.out.println("\n\nЗадача 3:");
        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            int birthRateThisYear = totalPopulation * birthRate / 1000;
            int deathRateThisYear = totalPopulation * deathRate / 1000;
            totalPopulation = totalPopulation + birthRateThisYear - deathRateThisYear;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4:");
        int amountOfSavings = 15000;
        int month = 0;
        double depositInterest = 0.07;
        while (amountOfSavings < 12_000_000) {
            amountOfSavings = (int) (amountOfSavings + amountOfSavings * depositInterest);
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amountOfSavings + " рублей");
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5:");
        int amountOfSavings = 15000;
        int month = 0;
        double depositInterest = 0.07;
        while (amountOfSavings < 12_000_000) {
            amountOfSavings = (int) (amountOfSavings + amountOfSavings * depositInterest);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + amountOfSavings + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("\nЗадача 6:");
        int amountOfSavings = 15000;
        int month = 0;
        int years = 9;
        double depositInterest = 0.07;
        while (month / 12 != years) {
            amountOfSavings = (int) (amountOfSavings + amountOfSavings * depositInterest);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + amountOfSavings + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("\nЗадача 7:");
        int fridayDate = 4;
        for (; fridayDate <= 31; fridayDate += 7) {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("\nЗадача 8:");
        int currentYear = 2023;
        int yearOfCometFlight = 0;
        int nextCentury = currentYear + 100;
        int twoCenturiesAgo = currentYear - 200;
        while (yearOfCometFlight <= nextCentury) {
            yearOfCometFlight += 79;
            if (yearOfCometFlight >= twoCenturiesAgo && yearOfCometFlight <= nextCentury) {
                System.out.println(yearOfCometFlight);
            }
        }
    }
}