public class Building {
    /**
     * Stores information about the building's name, address, and number of floors in the building.
     * @param args The program's arguments
     */
    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    public Building(String name, String address, int nFloors) {
        /**
         * Constructs a building and sets the building's name, address, and floor numbers. Throws an exception if a negative number of floors is entered.
         * @param(String) name The name of the building.
         * @param(String) address The address of the building.
         * @param(int) nFloors The number of floors in the building.
         * @throws RuntimeException When a negative number of floors is entered.
         */
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    public String getName() {
        /**
         * Getter for the building name in the String class.
         * @return The name of the building.
         */
        return this.name;
    }

    public String getAddress() {
         /**
         * Getter for the building address in the String class.
         * @return The address of the building.
         */
        return this.address;
    }

    public int getFloors() {
         /**
         * Getter for the number of floors in the building.
         * @return The number of floors in the building.
         */
        return this.nFloors;
    }

    public String toString() {
         /**
         * A string that states the attributes of the building in a print statement.
         * @return A print statement stating the name, the number of stories/floors, and the address of the building using the given values of the parameters.
         */
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}