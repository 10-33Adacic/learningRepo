package Controller;

/**
 * Created by Templar on 26.07.2019.
 */
public class CostAndWeightCalculation {
    private Necklace necklace;
    private int totalPrice;
    private int totalWeight;

    public int getTotalWeight() {
        return totalWeight;
    }

    public CostAndWeightCalculation(Necklace necklace){
        this.necklace = necklace;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void count() {
        if (necklace.getCentralGem() != null) {
            this.totalPrice += necklace.getCentralGem().getPrice();
            this.totalWeight += necklace.getCentralGem().getWeight();
        }
        if (necklace.getFirstLeftGem() != null) {
            this.totalPrice += necklace.getFirstLeftGem().getPrice();
            this.totalWeight += necklace.getFirstLeftGem().getWeight();
        }
        if (necklace.getFirstRightGem() != null) {
            this.totalPrice += necklace.getFirstRightGem().getPrice();
            this.totalWeight += necklace.getFirstRightGem().getWeight();
        }
        if (necklace.getSecondLeftGem() != null) {
            this.totalPrice += necklace.getSecondLeftGem().getPrice();
            this.totalWeight += necklace.getSecondLeftGem().getWeight();
        }
        if (necklace.getSecondRightGem() != null) {
            this.totalPrice += necklace.getSecondRightGem().getPrice();
            this.totalWeight += necklace.getSecondRightGem().getWeight();
        }
    }
}
