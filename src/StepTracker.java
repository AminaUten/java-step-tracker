import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthData = new MonthData[12] ;
    int goalByStepsPerDay = 10_000;
    Scanner scan = new Scanner(System.in);
    Converter convertKmAndKilocalories = new Converter();
    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthData.length; i++) {
            monthData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scan.nextInt();
        if (month > 0 && month < 12) {
            System.out.println("Введите день от 1-30(включительно)");
            int day = scan.nextInt();
            if (day > 0 && day <= 30) {
                System.out.println("Введите количество шагов");
                int steps = scan.nextInt();
                if (steps > 0) {
                    monthData[month-1].days[day-1] = steps;
                    System.out.println("Шаги успешно добавлены!");
                } else {
                    System.out.println("Шаги должны быть положительными");
                }
            } else {
                System.out.println("Некорректный день! Попробуйте заново");
            }
        } else {
            System.out.println("Некорректный месяц! Попробуйте заново"); }


        System.out.println("Введите количество шагов");
    }
    void changeStepGoal() {
        System.out.println("Введите новую цель по количеству шагов в день");
        int newSteps = scan.nextInt();
        if (newSteps > 0) {
            goalByStepsPerDay = newSteps;
            System.out.println("Новая цель сохранена!");
        } else {
            System.out.println("Попробуйте заново. Цель по количеству шагов некорректна");
        }
    }

    void printStatistic() {
        System.out.println("Введите число месяца(0-12):");
        int numMonth = scan.nextInt();
        if (numMonth > 0 && numMonth <= 12) {
            MonthData monthData1 = monthData[numMonth-1];
            monthData1.printDaysAndStepsFromMonth();
            int sumSteps = monthData1.sumStepsFromMonth();
            System.out.println("Общее количество шагов за месяц: " + sumSteps);
            System.out.println("Среднее количество шагов за месяц: " + sumSteps/30);
            System.out.println("Максимально пройденное количество шагов: " + monthData1.maxSteps());
            System.out.println("Количество сожженных килокалорий за месяц: " + convertKmAndKilocalories.convertStepsToKilocalories((sumSteps)/1000) * 50);
            System.out.println("Пройденная дистанция за месяц: " + convertKmAndKilocalories.convertToKm(sumSteps * 75/100_000));
            System.out.println("Лучшая серия за месяц: " + monthData1.bestSeries(10000));

        }

    }
}