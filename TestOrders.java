import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args){
        // Menu Items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 1.50;
        Item item2 = new Item();
        item1.name = "Latte";
        item1.price = 0.50;
        Item item3 = new Item();
        item1.name = "Drip Coffee";
        item1.price = 2.00;
        Item item4 = new Item();
        item1.name = "Capuccino";
        item1.price = 1.50;

        // Order variables
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 1.50;
        order1.ready = true;
        ArrayList<Item> firstOrder = new ArrayList<Item>();
        firstOrder.add(item1);
        order1.items = firstOrder;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 2.50 + item1.price;
        order2.ready = false;
        ArrayList<Item> secondOrder = new ArrayList<Item>();
        secondOrder.add(item2);
        secondOrder.add(item3);
        order2.items = secondOrder;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 3.50;
        order3.ready = true;
        ArrayList<Item> thirdOrder = new ArrayList<Item>();
        secondOrder.add(item3);
        secondOrder.add(item4);
        order3.items = thirdOrder;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 2.50;
        order4.ready = true;
        ArrayList<Item> fourthOrder = new ArrayList<Item>();
        fourthOrder.add(item4);
        fourthOrder.add(item2);
        fourthOrder.add(item2);
        order4.items = fourthOrder;
        
        System.out.println("Order1... " + order1.name);
        System.out.println("Order1... " + order1.total);
        System.out.println("Order1... " + order1.ready);
        System.out.println(item1.name + " " + item1.price);
        // just shows item memory place for both below
        System.out.println("Order1... " + order1.items.get(0).name);
        System.out.println("Order1... " + firstOrder.get(0).name);
        
        System.out.println("Order2... " + order2.name);
        System.out.println("Order2... " + order2.total);
        System.out.println("Order2... " + order2.ready);

        System.out.println("Order3... " + order3.name);
        System.out.println("Order3... " + order3.total);
        System.out.println("Order3... " + order3.ready);

        System.out.println("Order4... " + order4.name);
        System.out.println("Order4... " + order4.total);
        System.out.println("Order4... " + order4.ready);

        //  Application Simulations
        // System.out.println("Name: %s/n", order1.name);
        // System.out.println("Total: %s/n", order1.total);
        // System.out.println("Ready: %s/n", order1.ready);
    }
}
