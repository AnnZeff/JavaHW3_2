public class BmiService {
    public int calculate(double heightInMeters, int weightInKg) {
        double bmi = weightInKg / Math.pow(heightInMeters, 2);
        return (int) bmi;
    }

}
