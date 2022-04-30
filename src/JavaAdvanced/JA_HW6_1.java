package JavaAdvanced;

public class JA_HW6_1 {

    public static void main (String[] args) {

        Block b = new Block(new int[]{2,2,2});
//        System.out.println(b.getHeight());
//        System.out.println(b.getLength());
//        System.out.println(b.getWidth());
//        System.out.println(b.getVolume());
//        System.out.println(b.getSurfaceArea());

        Fighter f1 = new Fighter("Lew", 10, 2);
        Fighter f2 = new Fighter("Harry", 5, 4);
        Fighter.declareWinner(f1, f2, "Lew");
        System.out.println(Fighter.declareWinner(f1, f2, "Lew"));
    }

}
