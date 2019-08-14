package Controller;

import Model.Gems;

import java.util.*;

/**
 * Created by Templar on 26.07.2019.
 */
public class NecklaceGemsSort {
    private Necklace necklace;
    private Map<Integer, Gems> gemsMap;

    public NecklaceGemsSort(Necklace necklace) {
        this.necklace = necklace;
    }

    public Map<Integer, Gems> getGemsMap() {
        return gemsMap;
    }

    public void setGemsMap(Map<Integer, Gems> gemsMap) {
        this.gemsMap = gemsMap;
    }

    public Map<Integer, Gems> gemsSort() {
        Map<Integer, Gems> gemsMap = new TreeMap<Integer, Gems>();
        if (necklace.getCentralGem() != null) {
            gemsMap.put(necklace.getCentralGem().getPrice(), necklace.getCentralGem());
        }
        if (necklace.getFirstLeftGem() != null) {
            gemsMap.put(necklace.getFirstLeftGem().getPrice(), necklace.getFirstLeftGem());
        }
        if (necklace.getFirstRightGem() != null) {
            gemsMap.put(necklace.getFirstRightGem().getPrice(), necklace.getFirstRightGem());
        }
        if (necklace.getSecondLeftGem() != null) {
            gemsMap.put(necklace.getSecondLeftGem().getPrice(), necklace.getSecondLeftGem());
        }
        if (necklace.getSecondRightGem() != null) {
            gemsMap.put(necklace.getSecondRightGem().getPrice(), necklace.getSecondRightGem());
        }
        setGemsMap(gemsMap);
        return gemsMap;
    }
}
