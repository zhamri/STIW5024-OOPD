package Day3;

public class Example1 {
    public static void main(String[] args) {

        int weightSimple = 5;    // local variable
        int weightAverage = 10;
        int weightComplex = 15;

        int inputUseCaseSimple = 0;
        int inputUseCaseAverage = 29;
        int inputUseCaseComplex = 0;

        int simple = weightSimple * inputUseCaseSimple;
        int average = weightAverage * inputUseCaseAverage;
        int complex = weightComplex * inputUseCaseComplex;

        int total = simple + average + complex;

        System.out.print("Total: " + total);

    }
}
