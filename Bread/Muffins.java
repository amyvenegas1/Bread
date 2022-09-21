package Bread;

public class Muffins extends Bread{
    private int blueberries;
    private int vanilla;

    public Muffins() {
        super("Muffins",4,3,1,3,4,3,"flour, water, salt, milk, eggs, yeast, blueberries, vanilla", false );
        this.blueberries = 3;
        this.vanilla = 3;
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

    public void Recipe(){
        super.Recipe();
    }

    public String toString(){
        return "This is from the Muffins subclass" + "\n";
    }
}
