/* This is a stub for the Cafe class */
/* This is a stub for the Cafe class */
public class Cafe extends Building{
    /**
     * Has information extended from the Building class. Stores the inventory of the cafe and the ability to sell and restock the inventory.
     * @param args The program's arguments
     */
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
  
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        /**
         * Stores(String) the name, address, floor number, and inventory of the cafe.
         * @param(String) name The name of the cafe.
         * @param(int) address The address of the cafe.
         * @param(int) the number of floors in the cafe.
         * @param(int) nCoffeeOunces The number of coffee the cafe has in its inventory.
         * @param(int) SugarPackets The number of sugar packets the cafe has in its inventory.
         * @param(int) nCreams The number of creams the cafe has in its inventory.
         * @param(int) nCups The number of cups the cafe has in its inventory.
         */
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams) { //Each time this method is called, the inventory should decrease in each category according to the given parameters, e.g. calling `myCafe.sellCoffee(12, 2, 3);`should decrease the `myCafe` object's `nCoffeeOunces` by 12, `nSugarPackets` by 2, and `nCreams` by 3 (and of course, `nCups` by 1).
        /**
         * The method that allows the cafe to sell coffee. Decreases the inventory based on the order.
         * @param(int) size The amount of coffee ordered in ounces.
         * @param(int) nSugarPackets The number of sugar packets used in the order.
         * @param(int) nCreams the number of creams used in the order.
         */
        while (size > this.nCoffeeOunces || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams) {
            this.restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        this.nCoffeeOunces = this.nCoffeeOunces - size;
        this.nSugarPackets = this.nSugarPackets - nSugarPackets;
        this.nCreams = this.nCreams - nCreams;
        this.nCups--;
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) { //This method will be `private` (since we don't want some random person forcefully restocking the shelves!) - we'll call it from **inside** the `sellCoffee(...)` method, in the event that we don't have enough ingredients in stock to make the requested drink.
        /**
         * The method that allows the cafe to restock its inventory.
         * @param(int) nCoffeeOunces The number of coffee the cafe has in its inventory.
         * @param(int) SugarPackets The number of sugar packets the cafe has in its inventory.
         * @param(int) nCreams The number of creams the cafe has in its inventory.
         * @param(int) nCups The number of cups the cafe has in its inventory.
         */
        this.nCoffeeOunces = nCoffeeOunces + 500;
        this.nSugarPackets = nSugarPackets + 350;
        this.nCreams = nCreams + 425;
        this.nCups = nCups + 1000;
    }

    public static void main(String[] args) {
        Cafe theroost = new Cafe("The Roost", "10 Main St", 2, 500, 350, 425, 1000);
        theroost.sellCoffee(20, 15, 30);
        System.out.print(" " + theroost.nCoffeeOunces);
        System.out.print(" " + theroost.nSugarPackets);
        System.out.print(" " + theroost.nCreams);
        System.out.print(" " + theroost.nCups);

    }
    
}