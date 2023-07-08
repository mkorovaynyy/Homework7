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
        System.out.println("Задача 1");
        int totalSaving = 2_459_000;
        int currentSaving = 0;
        int savingPerMonth = 15000;
        int currentNumberOfMonth = 1;
        while (currentSaving <= totalSaving) {
            currentSaving += savingPerMonth;
            System.out.println("Месяц " + currentNumberOfMonth + " сумма накоплений равна " + currentSaving + " рублей");
            currentNumberOfMonth++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int currentNumber = 1;
        while (currentNumber <= 10) {
            System.out.print(currentNumber + " ");
            currentNumber++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int currentPopulation = 12_000_000;
        int currentPopulationTz = currentPopulation / 1000;
        int currentBirthRatePerYear = 17;
        int currentMortalityRatePerYear = 8;
        for (int i = 1; i <= 10; i++) {
            currentPopulation = currentPopulation - (currentMortalityRatePerYear * currentPopulationTz) + (currentBirthRatePerYear * currentPopulationTz);
            System.out.println("Год " + i + ", численность населения составляет " + currentPopulation);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double currentSaving = 15000.0;
        double currentRate = 1.07;
        double totalSaving = 12_000_000.0;
        int currentNumberOfMount = 1;
        while (currentSaving < totalSaving) {
            currentSaving *= currentRate;
            System.out.println("Месяц " + currentNumberOfMount + ", сумма накоплений " + currentSaving);
            currentNumberOfMount++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double currentSaving = 15000.0;
        double currentRate = 1.07;
        double totalSaving = 12_000_000.0;
        int currentNumberOfMount = 1;
        while (currentSaving < totalSaving) {
            currentSaving *= currentRate;
            if (currentNumberOfMount % 6 == 0) {
                System.out.println("Месяц " + currentNumberOfMount + ", сумма накоплений " + currentSaving);
            }
            currentNumberOfMount++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double currentSaving = 15000.0;
        double currentRate = 1.07;
        int currentNumberOfMount = 1;
        int maxCountOfMount = 9 * 12;
        while (currentNumberOfMount <= maxCountOfMount) {
            currentSaving *= currentRate;
            if (currentNumberOfMount % 6 == 0) {
                System.out.println("Месяц " + currentNumberOfMount + ", сумма накоплений " + currentSaving);
            }
            currentNumberOfMount++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int numberOfFriday = 3;
        for (; numberOfFriday <= 31; numberOfFriday = numberOfFriday + 7) {
            System.out.println("Сегодня пятница, " + numberOfFriday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int completionYear = currentYear + 100;
        int start = 0;
        while (start <= completionYear) {
            if (start > startYear) {
                System.out.println(start);
            }
            start += 79;
        }
    }
}