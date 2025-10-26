import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker(scanner);
        while (true) {
            System.out.println("1.Ввести количество шагов за определенный день");
            System.out.println("2.Изменить цель по количеству шагов в день");
            System.out.println("3.Напечататать статистику за определенный месяц");
            System.out.println("4.Выйти из приложения");
            int command = scanner.nextInt();
            if (command == 1) {
                tracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                tracker.changeStepGoal();
            } else if (command == 3) {
                tracker.printStatistic();
            } else if (command == 4) {
                System.out.println("Пока!");
                break;
            } else {
                System.out.println("Такой команды нет");
            }

        }

    }
}

