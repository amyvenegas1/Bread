package Bread;

public class SourdoughBread extends Bread{
    private double sourdoughStarter;
    private boolean status = false;

    public SourdoughBread(String breadName,double cupsOfFlour, double cupsOfWater, double tspsOfSalt,double cupsOfMilk,int eggs, double tspsOfYeast, double sourdoughStarter){
        super(breadName, cupsOfFlour,cupsOfWater,tspsOfSalt,cupsOfMilk,eggs,tspsOfYeast);
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

    public void Bake(){
        System.out.println("Bread is already baked");
    }


}
