package Day3;

public class Example9 implements UseCaseInterface{

    private final int weightSimple = 5;
    private final int weightAverage = 10;
    private final int weightComplex = 15;

    public static void main(String[] args) {
        Example9 example3 = new Example9();
        int total= example3.calculateUseCaseWeight(0, 29, 0);
        System.out.print("Total: " + total);
    }

    @Override
    public int calculateUseCaseWeight(int inputUseCaseSimple, int inputUseCaseAverage, int inputUseCaseComplex){
        int simple = weightSimple * inputUseCaseSimple;
        int average = weightAverage * inputUseCaseAverage;
        int complex = weightComplex * inputUseCaseComplex;
        int total = simple + average + complex;
        return total;
    }
}
