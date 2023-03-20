public class MeatLover implements PizzaStore{
    int price = 150;
    int calories = 750;
    String ProductDesc = "Meat Pizza with full of Meat";
    String itemName = "Meat Lover";


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
