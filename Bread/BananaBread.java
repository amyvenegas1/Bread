package Bread;

public class BananaBread extends Bread{
    private int Bananas;
    private int vanilla;
    public String recipe;


    public BananaBread() {
        super("Banana",3,2,3,2,4,5,"flour, water, salt, milk, eggs, yeast, bananas, and vanilla",true);
        this.Bananas = 4;
        this.vanilla = 3;
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
    public void Bake() {
        super.Bake();
        System.out.println("The Banana Bread is now baked");
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

    public String toString(){
        return "This is from the Banana Bread subclass." + "\n";
    }
}
