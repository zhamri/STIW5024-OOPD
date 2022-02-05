package Day3;

public class UseCaseWeight2 {

    private final int weightSimple = 5;
    private final int weightAverage = 10;
    private final int weightComplex = 15;
    private int total;

    public void calculateUseCaseWeight(int inputUseCaseSimple, int inputUseCaseAverage, int inputUseCaseComplex){
        int simple = weightSimple * inputUseCaseSimple;
        int average = weightAverage * inputUseCaseAverage;
        int complex = weightComplex * inputUseCaseComplex;
        total = simple + average + complex;
    }

    public int getTotal() {
        return total;
    }
}
