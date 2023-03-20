import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        int choice=0;

        Scanner sc = new Scanner(System.in);
        OrderTotal orders = new OrderTotal();


        for(int i=0;i<10;i++){

            System.out.println("*** Menu ***\n1.Cheez Pizza.\n2.Meat Lover.\n3.Veg Lover.\n4.Exit.\n-------------");
            System.out.println("Select: ");

            choice = sc.nextInt();

            if(choice==4)break;

            switch(choice){
                case 1:
                    PizzaStore item = new CheezPizza();
                    orders.AddToCart(item);
                    System.out.println("Cheez Pizza added to the cart");
                    break;
                case 2:
                    PizzaStore item2 = new MeatLover();
                    orders.AddToCart(item2);
                    System.out.println("Meat Lover added to the cart");
                    break;
                case 3:
                    PizzaStore item3 = new VegLover();
                    orders.AddToCart(item3);
                    System.out.println("Veg Lover added to the cart");
                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid input. Please try again..");
                    break;
            }

        }

        orders.ShowOrder();

    }

}