package Bread;

public class Muffins extends Bread{
    private int blueberries;
    private int vanilla;
    private boolean status = false;

    public Muffins(String breadName, double cupsOfFlour, double cupsOfWater, double tspsOfSalt, double cupsOfMilk, int eggs, double tspsOfYeast) {
        super(breadName, cupsOfFlour, cupsOfWater, tspsOfSalt, cupsOfMilk, eggs, tspsOfYeast);
        this.blueberries = blueberries;
        this.vanilla = vanilla;
    }

    public int getBlueberries() {
        return blueberries;
    }

    public void setBlueberries(int blueberries) {
        this.blueberries = blueberries;
    }

    public int getVanilla() {
        return vanilla;
    }

    public void setVanilla(int vanilla) {
        this.vanilla = vanilla;
    }

    public void getIngredients(){
        super.getIngredients();
        System.out.println(blueberries + " cup(s) of blueberries" + "\n" + vanilla + " teaspoons of vanilla");
    }
}
