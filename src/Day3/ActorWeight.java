package Day3;

public class ActorWeight {

    private final int weightSimple = 1;
    private final int weightAverage = 2;
    private final int weightComplex = 3;
    private int total;

    public ActorWeight(int inputUseCaseSimple, int inputUseCaseAverage, int inputUseCaseComplex) {
        int simple = weightSimple * inputUseCaseSimple;
        int average = weightAverage * inputUseCaseAverage;
        int complex = weightComplex * inputUseCaseComplex;
        total = simple + average + complex;
    }

    public int getTotal() {
        return total;
    }
}
