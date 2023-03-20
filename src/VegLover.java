public class VegLover implements PizzaStore{
    int price = 80;
    int calories = 350;
    String ProductDesc = "Veg Pizza with full of Veggies";
    String itemName = "Veg Lover";


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
