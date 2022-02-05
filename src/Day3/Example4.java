package Day3;

public class Example4 {

    public static void main(String[] args) {
        UseCaseWeight useCaseWeight = new UseCaseWeight();
        int total= useCaseWeight.calculateUseCaseWeight(0, 29, 0);
        System.out.print("Total: " + total);
    }
}
