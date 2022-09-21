package Bread;

public class Bread {
    private String breadName;
    private double cupsOfFlour;
    private double cupsOfWater;
    private double tspsOfSalt;
    private double cupsOfMilk;
    private int eggs;
    private double tspsOfYeast;
    private String recipe;
    public boolean isBaked;



    public Bread(String breadName, double cupsOfFlour, double cupsOfWater, double tspsOfSalt, double cupsOfMilk, int eggs, double tspsOfYeast,String recipe, boolean isBaked) {
        this.breadName = breadName;
        this.cupsOfFlour = cupsOfFlour;
        this.cupsOfWater = cupsOfWater;
        this.tspsOfSalt = tspsOfSalt;
        this.cupsOfMilk = cupsOfMilk;
        this.eggs = eggs;
        this.tspsOfYeast = tspsOfYeast;
        this.recipe = recipe;
        this.isBaked = isBaked;
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

    public boolean isBaked() {
        return isBaked;
    }

    public void setBaked(boolean isBaked) {
        this.isBaked = isBaked;
    }

    public void Bake() {
        if(isBaked = false) {
            System.out.println("\n" + "The bread is now baked" +"\n");
        }
        else{
            System.out.println("\n" + "The bread is already baked." + "\n");
        }
    }


    public void getIngredients() {
        System.out.println("The ingredients for " + breadName + " bread are:" + "\n" + cupsOfFlour + " cups of flour" + "\n" + cupsOfWater + " cups of water" + "\n" + tspsOfSalt + " tablespoons of salt" + "\n" + cupsOfMilk + " cups of milk" + "\n" + eggs + " eggs" + "\n" + tspsOfYeast + " tablespoons of yeast");
    }


    public void Recipe() {
        System.out.println("\n" + "A recipe for " + breadName + " Bread: " + "\n" + "1. Mix " + recipe +"\n" + "2.Make the dough" + "\n" + "3.Bulk rise" + "\n" + "4.Stretch and fold the dough" + "\n" + "5.Cut and shape the dough" + "\n" + "6.Preheat the oven to 450 degrees fahrenheit" + "\n" + "7.Spray the loaf with lukewarm water" + "\n" + "8.Bake the bread at 400 degrees fahrenheit for 20 minutes, until it is a deep golden brown" + "\n" + "9.Remove the bread from the oven" + "\n" + "10. Let the bread cool until it is good to eat" + "\n");
    }

    public String toString(){
        return "This is from the bread class." + "\n";
    }
}
