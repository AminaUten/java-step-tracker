
import java.util.Scanner;

public class StepTracker {
    MonthData[] monthData = new MonthData[12];
    int goalByStepsPerDay = 10_000;
    Scanner scan = new Scanner(System.in);

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        System.out.println("Введите день от 1-30(включительно)");
        System.out.println("Введите количество шагов");
    }

    void changeStepGoal() {
        System.out.println("Введите новую цель по количеству шагов в день");
        int newSteps = scan.nextInt();
        if (newSteps > 0 && newSteps != 0) {
            goalByStepsPerDay = newSteps;
        } else {
            System.out.println("Попробуйте заново. Цель по количеству шагов некорректна");
        }
    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        int numMonth = scan.nextInt();
        if (numMonth > 0 && numMonth <= 12) {

        }

    }
}
