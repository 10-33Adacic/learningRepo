package Model;

/**
 * Created by Templar on 23.07.2019.
 */
public enum Gems {
    DIAMOND ("precious", 15, "white", 2500, .9),
    RUBY ("precious", 17, "red", 1420, .3),
    EMERALD ("precious", 31, "green", 1810, .45),
    SAPPHIRE ("precious", 22, "blue", 1380, .6),
    ALEXANDRITE ("precious", 11, "green", 1270, .15),
    CHRYSOBERYL("precious", 23, "green", 1310, .23),
    JASPER("semipricious", 27, "orange", 110, .08),
    TANZANITE("semipricious", 40, "blue", 190, .4),
    QUARTZ ("semipricious", 70, "violet", 95, .31),
    MALACHITE ("semipricious", 12, "green", 55, .29),
    AMBER ("semipricious", 55, "yellow", 70, .6),
    AMETHYST("semipricious", 19, "violet", 30, .4),
    TOPAZ("semipricious", 66, "blue", 78, .22);

    private String type;
    private int weight;
    private String colour;
    private int price;
    private double transparency;

    Gems(String type, int weight, String colour, int price, double transparency) {
        this.type = type;
        this.weight = weight;
        this.colour = colour;
        this.price = price;
        this.transparency = transparency;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public double getTransparency() {
        return transparency;
    }
}
