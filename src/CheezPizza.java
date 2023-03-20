public class CheezPizza implements PizzaStore{
    int price = 100;
    int calories = 450;
    String ProductDesc = "Cheezy Pizza with full of Cheez";
    String itemName = "Cheez Pizza";


    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    @Override
    public String getProductDesc() {
        return this.ProductDesc;
    }

    @Override
    public String itemName() {
        return this.itemName;
    }

}
