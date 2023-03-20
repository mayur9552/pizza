public class OrderTotal {

    public static int itemCount = 0;
    public static double tax = 4;
    public static  double subTotal = 0;
    public static double Total = 0;
    PizzaStore items[] = new PizzaStore[10];

    public void AddToCart(PizzaStore item) {

            itemCount++;
            items[itemCount] = item;
        OrderTotal.subTotal = OrderTotal.subTotal + item.getPrice();
        OrderTotal.Total = OrderTotal.Total = OrderTotal.subTotal + (OrderTotal.subTotal/100)*OrderTotal.tax;

    }

    public void ShowOrder(){

        System.out.println("\n*************Receipt*************");

        for(int i=1;i<=itemCount;i++){
            System.out.println(items[i].itemName() + "  " + items[i].getPrice());
        }
        System.out.println("  Sub Total: " + OrderTotal.subTotal);
        System.out.println("+ Tax(" +OrderTotal.tax+"%): " + "  " + (OrderTotal.subTotal/100)*OrderTotal.tax);
        System.out.println("  Total: " + OrderTotal.Total);

        System.out.println("*************Receipt*************");

    }
}
