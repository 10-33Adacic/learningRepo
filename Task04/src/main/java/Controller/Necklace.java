package Controller;

import Model.Gems;

/**
 * Created by Templar on 24.07.2019.
 */
public class Necklace {
    private Gems centralGem;
    private Gems firstLeftGem;
    private Gems firstRightGem;
    private Gems secondLeftGem;

    public Gems getCentralGem() {
        return centralGem;
    }

    public Gems getFirstLeftGem() {
        return firstLeftGem;
    }

    public Gems getFirstRightGem() {
        return firstRightGem;
    }

    public Gems getSecondLeftGem() {
        return secondLeftGem;
    }

    public Gems getSecondRightGem() {
        return secondRightGem;
    }

    private Gems secondRightGem;

    public static class Builder {

        private Necklace necklace;

        public Builder() {
            necklace = new Necklace();
        }

        public Builder withCentralGem(Gems centralGem) {
            necklace.centralGem = centralGem;
            return this;
        }

        public Builder withFirstLeftGem(Gems firstLeftGem) {
            necklace.firstLeftGem = firstLeftGem;
            return this;
        }

        public Builder withFirstRightGem(Gems firstRightGem) {
            necklace.firstRightGem = firstRightGem;
            return this;
        }

        public Builder withSecondleftGem(Gems secondLeftGem) {
            necklace.secondLeftGem = secondLeftGem;
            return this;
        }

        public Builder withSecondRightGem(Gems secondRightGem) {
            necklace.secondRightGem = secondRightGem;
            return this;
        }

        public Necklace build() {return necklace;}
    }
}


