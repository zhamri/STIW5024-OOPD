package Day3;

public class UseCaseWeight {

    private final int weightSimple = 5;
    private final int weightAverage = 10;
    private final int weightComplex = 15;

    public int calculateUseCaseWeight(int inputUseCaseSimple, int inputUseCaseAverage, int inputUseCaseComplex){
        int simple = weightSimple * inputUseCaseSimple;
        int average = weightAverage * inputUseCaseAverage;
        int complex = weightComplex * inputUseCaseComplex;
        int total = simple + average + complex;
        return total;
    }
}
