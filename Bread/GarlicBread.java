package Bread;

public class GarlicBread extends Bread{
    private double garlic;
    private double butter;
    private double cheese;


    public GarlicBread() {
        super("Garlic", 2,4,3,2,3,2,"flour, water, salt, milk, eggs, yeast, garlic, butter, and cheese", false);
        this.garlic = 3;
        this.butter = 2;
        this.cheese = 4;
    }

    public double getGarlic() {
        return garlic;
    }

    public void setGarlic(double garlic) {
        this.garlic = garlic;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }

    public double getCheese() {
        return cheese;
    }

    public void setCheese(double cheese) {
        this.cheese = cheese;
    }

    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println(garlic + " cloves of garlic" + "\n" + butter + " sticks of butter" + "\n" + cheese + " cups of cheese" + "\n");
    }

    @Override
    public void Bake() {
        super.Bake();
    }

    public String toString() {
        return "This is from the Garlic Bread subclass." + "\n";
    }
}
