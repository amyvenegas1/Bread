package Bread;

public class RyeBread extends Bread {
    public double ryeFlour;
    public double carawaySeeds;
    public double cocoaPowder;

    public RyeBread() {
        super("Rye", 2, 3, 1, 3, 2, 4, "flour, water, salt, milk, eggs, yeast, rye flour, caraway seeds, and cocoa powder", false);
        this.ryeFlour = 3;
        this.carawaySeeds = 4;
        this.cocoaPowder = 3;

    }

    public double getRyeFlour() {
        return ryeFlour;
    }

    public void setRyeFlour(double ryeFlour) {
        this.ryeFlour = ryeFlour;
    }

    public double getCarawaySeeds() {
        return carawaySeeds;
    }

    public void setCarawaySeeds(double carawaySeeds) {
        this.carawaySeeds = carawaySeeds;
    }

    public double getCocoaPowder() {
        return cocoaPowder;
    }

    public void setCocoaPowder(double cocoaPowder) {
        this.cocoaPowder = cocoaPowder;
    }


    @Override
    public void Bake() {
        super.Bake();
    }

    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println(ryeFlour + " cups of rye flour" + "\n" + carawaySeeds + " tablespoons of caraway seeds" + "\n" + cocoaPowder + " cups of cocoa powder" + "\n");
    }


    @Override
    public void Recipe() {
        super.Recipe();
    }


    public String toString(){
        return "This is from the Rye Bread subclass" + "\n";
    }
}
