package Bread;

public class Bread {
    private String breadName;
    private double cupsOfFlour;
    private double cupsOfWater;
    private double tspsOfSalt;
    private double cupsOfMilk;
    private int eggs;
    private double tspsOfYeast;
    public String recipe = "flour, water, salt, milk, eggs, yeast,";


    public Bread(String breadName, double cupsOfFlour, double cupsOfWater, double tspsOfSalt, double cupsOfMilk, int eggs, double tspsOfYeast) {
        this.breadName = breadName;
        this.cupsOfFlour = cupsOfFlour;
        this.cupsOfWater = cupsOfWater;
        this.tspsOfSalt = tspsOfSalt;
        this.cupsOfMilk = cupsOfMilk;
        this.eggs = eggs;
        this.tspsOfYeast = tspsOfYeast;
    }


    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public double getCupsOfFlour() {
        return cupsOfFlour;
    }

    public void setCupsOfFlour(double cupsOfFlour) {
        this.cupsOfFlour = cupsOfFlour;
    }

    public double getCupsOfWater() {
        return cupsOfWater;
    }

    public void setCupsOfWater(double cupsOfWater) {
        this.cupsOfWater = cupsOfWater;
    }

    public double getTspsOfSalt() {
        return tspsOfSalt;
    }

    public void setTspsOfSalt(double tspsOfSalt) {
        this.tspsOfSalt = tspsOfSalt;
    }

    public double getCupsOfMilk() {
        return cupsOfMilk;
    }

    public void setCupsOfMilk(double cupsOfMilk) {
        this.cupsOfMilk = cupsOfMilk;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public double getTspsOfYeast() {
        return tspsOfYeast;
    }

    public void setTspsOfYeast(double tspsOfYeast) {
        this.tspsOfYeast = tspsOfYeast;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public void Bake() {
        System.out.println("\n" + "The bread is now baked");
    }


    public void getIngredients() {
        System.out.println("The ingredients for " + breadName + " bread are:" + "\n" + cupsOfFlour + " cups of flour" + "\n" + cupsOfWater + " cups of water" + "\n" + tspsOfSalt + " tablespoons of salt" + "\n" + cupsOfMilk + " cups of milk" + "\n" + eggs + " eggs" + "\n" + tspsOfYeast + " tablespoons of yeast");
    }


    public void Recipe() {
        System.out.println("\n" + "A recipe for " + breadName + " Bread: " + "\n" + "1. Mix " + recipe + "2.Make the dough" + "\n" + "3.Bulk rise");
    }
}
