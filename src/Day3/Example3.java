package Day3;

public class Example3 {

    final int weightSimple = 5;
    final int weightAverage = 10;
    final int weightComplex = 15;

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        int total= example3.calculateUseCaseWeight(0, 29, 0);
        System.out.print("Total: " + total);
    }

    public int calculateUseCaseWeight(int inputUseCaseSimple, int inputUseCaseAverage, int inputUseCaseComplex){
        int simple = weightSimple * inputUseCaseSimple;
        int average = weightAverage * inputUseCaseAverage;
        int complex = weightComplex * inputUseCaseComplex;
        int total = simple + average + complex;
        return total;
    }
}
