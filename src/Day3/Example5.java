package Day3;

public class Example5 {

    public static void main(String[] args) {
        UseCaseWeight2 useCaseWeight2 = new UseCaseWeight2();
        useCaseWeight2.calculateUseCaseWeight(0, 29, 0);
        int total = useCaseWeight2.getTotal();
        System.out.print("Total: " + total);
    }
}
