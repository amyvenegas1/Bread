package Bread;

public class BananaBread extends Bread{
    private int Bananas;
    private int vanilla;
    public String recipe = " bananas, and vanilla";


    public BananaBread(String breadName, double cupsOfFlour, double cupsOfWater, double tspsOfSalt, double cupsOfMilk, int eggs, double tspsOfYeast, int Bananas,int vanilla) {
        super(breadName, cupsOfFlour, cupsOfWater, tspsOfSalt, cupsOfMilk, eggs, tspsOfYeast);
        this.Bananas = Bananas;
        this.vanilla = vanilla;
    }

    public int getBananas() {
        return Bananas;
    }

    public void setBananas(int bananas) {
        Bananas = bananas;
    }

    public int getVanilla() {
        return vanilla;
    }

    public void setVanilla(int vanilla) {
        this.vanilla = vanilla;
    }

    @Override
    public String getRecipe() {
        return recipe;
    }

    @Override
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println(Bananas + " bananas" + "\n" + vanilla + " teaspoons of vanilla");
    }

    @Override
    public void Recipe() {
        super.Recipe();
    }
}
