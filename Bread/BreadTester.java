package Bread;

public class BreadTester {
    public static void main(String[]args){
    Muffins muffin = new Muffins();
    GarlicBread garlic = new GarlicBread();
    BananaBread banana = new BananaBread();

    muffin.getIngredients();
    muffin.Recipe();
    System.out.println(muffin);

    garlic.getIngredients();
    garlic.Recipe();
    System.out.println(garlic);

    banana.getIngredients();
    banana.Recipe();
    banana.Bake();





    }
}
