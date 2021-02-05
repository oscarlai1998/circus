package circus;

public class Cannon extends Equipment {

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }
//test
    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
