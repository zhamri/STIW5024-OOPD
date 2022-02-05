package Day3;

public class Example8 {

    public static void main(String[] args) {
        UseCaseWeight3 useCaseWeight3 = new UseCaseWeight3(0, 29, 0);
        int uucw = useCaseWeight3.getTotal();
        System.out.println("unadjusted use case weight (UUCW) " + uucw);

        ActorWeight actorWeight = new ActorWeight(0,0,5);
        int uaw = actorWeight.getTotal();
        System.out.println("unadjusted actor weight (UAW): " + uaw);

        int uucp = uucw + uaw;
        System.out.println("UUCP: " + uucp);
    }
}
