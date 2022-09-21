package Bread;

public class SourdoughBread extends Bread{
    private double sourdoughStarter;

    public SourdoughBread(){
        super("Sourdough", 3,2,3,3,2,4,"flour, water, salt, milk, eggs, yeast, and sourdough starter",false);
        this.sourdoughStarter = sourdoughStarter;
    }

    public double getSourdoughStarter() {
        return sourdoughStarter;
    }

    public void setSourdoughStarter(double sourdoughStarter) {
        this.sourdoughStarter = sourdoughStarter;
    }

    public void getIngredients(){
        super.getIngredients();
        System.out.println(sourdoughStarter + " tablespoons of sourdough starter");
    }

    public void Bake() {
        System.out.println("Bread is already baked");
    }


    public String toString(){
        return "This is from the Sourdough subclass" + "\n";
    }

}
