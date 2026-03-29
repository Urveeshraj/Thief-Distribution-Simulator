import java.util.*;

public class Theif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of theives and the number of items stolen");
        int numberOfTheives = sc.nextInt();
        double stolenItems = sc.nextDouble();
        double smartChorMaal = 0;
        int smartChorRank = 1;
        double maal = 0;
        for (int i = 1; i <= numberOfTheives; i++) {
            maal = stolenItems * i / 100.0;
            if (maal > smartChorMaal) {
                smartChorMaal = maal;
                smartChorRank = i;
            }
            System.out.println("Theif " + i + " has stolen " + maal + " items");
            stolenItems = stolenItems - maal;
        }
        System.out.println(smartChorMaal);
        System.out.println(smartChorRank);
    }
}