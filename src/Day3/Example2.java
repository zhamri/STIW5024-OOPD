package Day3;

public class Example2 {

    final static int weightSimple = 5;
    final static int weightAverage = 10;
    final static int weightComplex = 15;

    public static void main(String[] args) {

        int total = calculateUseCaseWeight(0, 29, 0);
        System.out.print("Total: " + total);
    }

    public static int calculateUseCaseWeight(int inputUseCaseSimple, int inputUseCaseAverage, int inputUseCaseComplex){
        int simple = weightSimple * inputUseCaseSimple;
        int average = weightAverage * inputUseCaseAverage;
        int complex = weightComplex * inputUseCaseComplex;
        int total = simple + average + complex;
        return total;
    }
}
