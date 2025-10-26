public class Converter {
    int convertStepsToKilocalories(int steps) {
        int kilocalories = (steps/1000) * 50;
        return kilocalories;
    }
    int convertToKm(int steps) {
        int kilometres = (steps*75)/ 100_000;
        return kilometres;
    }
}
