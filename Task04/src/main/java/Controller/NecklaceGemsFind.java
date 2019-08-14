package Controller;

import Model.Gems;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Templar on 26.07.2019.
 */
public class NecklaceGemsFind {
    private Necklace necklace;
    private double minTransparency;

    private double maxTransparency;
    private Map<Double, Gems> foundGems;

    public NecklaceGemsFind (Necklace necklace) {
        this.necklace = necklace;
    }

    public void setMinTransparency(double minTransparency) {
        this.minTransparency = minTransparency;
    }

    public void setMaxTransparency(double maxTransparency) {
        this.maxTransparency = maxTransparency;
    }

    public Map<Double, Gems> getFoundGems() {
        return foundGems;
    }

    public double getMinTransparency() {
        return minTransparency;
    }

    public double getMaxTransparency() {
        return maxTransparency;
    }

    public void setFoundGems(Map<Double, Gems> foundGems) {
        this.foundGems = foundGems;
    }

    public Map<Double, Gems> findGemsByTransparency () {
        Map<Double, Gems> foundGems = new TreeMap<Double, Gems>();
        if (necklace.getCentralGem() != null
                && necklace.getCentralGem().getTransparency() > minTransparency
                && necklace.getCentralGem().getTransparency() < maxTransparency) {
            foundGems.put(necklace.getCentralGem().getTransparency(), necklace.getCentralGem());
        }
        if (necklace.getFirstLeftGem() != null
                && necklace.getFirstLeftGem().getTransparency() > minTransparency
                && necklace.getFirstLeftGem().getTransparency() < maxTransparency) {
            foundGems.put(necklace.getFirstLeftGem().getTransparency(), necklace.getFirstLeftGem());
        }
        if (necklace.getFirstRightGem() != null
                && necklace.getFirstRightGem().getTransparency() > minTransparency
                && necklace.getFirstRightGem().getTransparency() < maxTransparency) {
            foundGems.put(necklace.getFirstRightGem().getTransparency(), necklace.getFirstRightGem());
        }
        if (necklace.getSecondLeftGem() != null
                && necklace.getSecondLeftGem().getTransparency() > minTransparency
                && necklace.getSecondLeftGem().getTransparency() < maxTransparency) {
            foundGems.put(necklace.getSecondLeftGem().getTransparency(), necklace.getSecondLeftGem());
        }
        if (necklace.getSecondRightGem() != null
                && necklace.getSecondRightGem().getTransparency() > minTransparency
                && necklace.getSecondRightGem().getTransparency() < maxTransparency) {
            foundGems.put(necklace.getSecondRightGem().getTransparency(), necklace.getSecondRightGem());
        }
        setFoundGems(foundGems);
        return foundGems;
    }
}
