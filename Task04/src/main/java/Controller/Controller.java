package Controller;

import Model.*;
import View.View;
import java.util.ArrayList;

/**
 * Created by Templar on 23.07.2019.
 */
public class Controller {
    private Model model;
    private View view;
    private Necklace necklace;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void programRun() {
        necklace = necklaceBuilder(gemSelection());
        CostAndWeightCalculation priceAndWeight = new CostAndWeightCalculation(necklace);
        priceAndWeight.count();
        NecklaceGemsSort gemsSort = new NecklaceGemsSort(necklace);
        gemsSort.gemsSort();
        NecklaceGemsFind findGems = new NecklaceGemsFind(necklace);
        findGems.setMinTransparency(0.3);
        findGems.setMaxTransparency(0.95);
        findGems.findGemsByTransparency();
        view.print(necklace,
                priceAndWeight,
                gemsSort.getGemsMap(),
                findGems.getFoundGems(),
                findGems.getMaxTransparency(),
                findGems.getMinTransparency());
    }

    private ArrayList<Gems> gemSelection () {
        ArrayList<Gems> allGems = new ArrayList<Gems>();
            for (Gems g: Gems.values()) {
                allGems.add(g);
            }
        return allGems;
    }

    private Necklace necklaceBuilder (ArrayList<Gems> list) {
        Gems centralGem = null;
        Gems firstLeftGem = null;
        Gems firstRightGem = null;
        Gems secondLeftGem = null;
        Gems secondRightGem = null;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType().equals("precious") &&
                    list.get(i).getTransparency()>.6) {
                centralGem = list.get(i);
            }
            if (list.get(i).getType().equals("semipricious") &&
                    list.get(i).getColour().equals("green")) {
                firstLeftGem = list.get(i);
            }
            if (list.get(i).getType().equals("semipricious") &&
                    list.get(i).getWeight()>50) {
                firstRightGem = list.get(i);
            }
            if (list.get(i).getType().equals("semipricious") &&
                    list.get(i).getPrice()>100) {
                secondLeftGem = list.get(i);
            }
            if (list.get(i).getType().equals("semipricious") &&
                    list.get(i).getTransparency()<.2) {
                secondRightGem = list.get(i);
            }
        }
        Necklace necklace = new Necklace.Builder()
                .withCentralGem(centralGem)
                .withFirstLeftGem(firstLeftGem)
                .withFirstRightGem(firstRightGem)
                .withSecondleftGem(secondLeftGem)
                .withSecondRightGem(secondRightGem)
                .build();
        return necklace;
    }
}
