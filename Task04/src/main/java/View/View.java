package View;

import Controller.CostAndWeightCalculation;
import Controller.Necklace;
import Model.Gems;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import static View.TextConstants.*;

/**
 * Created by Templar on 23.07.2019.
 */
public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
//                    new Locale("ua", "UA"));  // Ukrainian
                        new Locale("en"));        // English

    public void print(Necklace necklace,
                      CostAndWeightCalculation calculation,
                      Map<Integer, Gems> mapSort,
                      Map<Double, Gems> mapFind,
                      double maxTransparency,
                      double minTransparency){
        printStringMessage();
        printGems(necklace);
        printNecklaceAbilities(calculation);
        printGemsSort(mapSort);
        printGemsFind(mapFind, maxTransparency, minTransparency);
    }

    /**
     *
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
//        draw();

    }

    /**
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringMessage() {
        printMessage(concatenationString(
                bundle.getString(GREETINGS),
                bundle.getString(GEMS_SELECTED)));
    }

    public void printGems(Necklace necklace){
        System.out.println(necklace.getSecondLeftGem() + " - "
            + necklace.getFirstLeftGem() + " - "
            + necklace.getCentralGem() + " - "
            + necklace.getFirstRightGem() + " - "
            + necklace.getSecondRightGem()
            + "\n\r");
    }

    public void printNecklaceAbilities(CostAndWeightCalculation costAndWeightCalculation) {
        printNeckLaceWeight(costAndWeightCalculation.getTotalWeight());
        printNeckLacePrice (costAndWeightCalculation.getTotalPrice());
    }

    public void printNeckLaceWeight (int weight) {
        printMessage(concatenationString(
                bundle.getString(NECKLACE_WEIGHT),
                weight + ""));
    }

    public void printNeckLacePrice (int price) {
        printMessage(concatenationString(
                bundle.getString(NECKLACE_PRICE),
                price + "\n\r"));
    }

    public void printGemsSort (Map<Integer, Gems> map) {
        printMessage(concatenationString(
                bundle.getString(NECKLACE_SORT)));
        for (Map.Entry<Integer, Gems> temp : map.entrySet()) {
            System.out.println(temp.getValue() + " " + temp.getKey());
        }
    }

    public void printGemsFind (Map<Double, Gems> map, double maxTransparency, double minTransparency) {
        System.out.println();
        printMessage(concatenationString(
                bundle.getString(NECKLACE_FIND),
                minTransparency + " ",
                bundle.getString(AND),
                maxTransparency + " ",
                bundle.getString(GEMS_FOUND)));
        for (Map.Entry<Double, Gems> temp : map.entrySet()) {
            System.out.println(temp.getValue() + " " + temp.getKey());
        }
    }

//    public void draw() {
//        System.out.println("\t---------\t\t\t\t\t\t\t---------\n" +
//                "\t|\t|\t---------\t\t\t---------\t|\t|\n" +
//                "\t|\t|\t|\t|\t---------\t|\t| \t|\t|\n" +
//                "\t|\t|\t|\t|\t|\t|\t|\t|\t|\t|\n" +
//                "\t|\t|\t|\t|\t|\t|\t|\t|\t|\t|\n" +
//                "\t---------\t|\t|\t|\t|\t|\t|\t---------\n" +
//                "\t\t\t---------\t|\t|\t---------\t\t\n" +
//                "\t\t\t\t\t---------");
//    }
}
