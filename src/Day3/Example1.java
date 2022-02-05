package Day3;

public class Example1 {
    public static void main(String[] args) {

        int weightSimple = 5;
        int weightAverage = 10;
        int weightComplex = 15;

        int inputUseCase1 = 0;
        int inputUseCase2 = 29;
        int inputUseCase3 = 0;

        int simple = weightSimple * inputUseCase1;
        int average = weightAverage * inputUseCase2;
        int complex = weightComplex * inputUseCase3;

        int total = simple + average + complex;

        System.out.print("Total: " + total);

    }
}
